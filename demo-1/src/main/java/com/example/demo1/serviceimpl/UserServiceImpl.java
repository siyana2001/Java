package com.example.demo1.serviceimpl;

import java.security.SecureRandom;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo1.dto.UserDto;
import com.example.demo1.modal.User;
import com.example.demo1.repository.UserRepository;
import com.example.demo1.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private JavaMailSender javaMailSender; // Add this line

    @Override
    public boolean Savorupdate(UserDto dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setMail(dto.getMail());
        user.setPassword(dto.getPassword());
        user.setPhone(dto.getPhone());
        userRepository.save(user);
        return true;
    }

    @Override
    public boolean deleteUserById(int id) {
        userRepository.deleteById(id);
        return true;
    }

    @Override
    public List<User> getAllUser() {
        List<User> product = userRepository.findAll();
        return product;
    }

    @Override
    public Optional<User> getById(int id) {
        Optional<User> opro = userRepository.findById(id);
        return opro;
    }

    @Override
    public String signUp(UserDto dto) {
        List<User> name = userRepository.findByName(dto.getName());
        if (name != null) {
            List<User> mail = userRepository.findByMail(dto.getMail());
            if (mail != null) {
                List<User> phone = userRepository.findByPhone(dto.getPhone());
                if (phone != null) {
                    List<User> password = userRepository.findByPassword(dto.getPassword());
                    if (password != null) {
                        User user = new User();
                        BeanUtils.copyProperties(dto, user);
                        user.setPassword(this.encode(dto.getPassword()));
                        userRepository.save(user);
                        return "success";
                    }
                    return "check password";
                }
                return "check phone number";
            }
            return "check mail";
        }
        return "check name";
    }

    private String encode(String encodedPassword) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(10, new SecureRandom());
        return bCryptPasswordEncoder.encode(encodedPassword);
    }

    public boolean decode(String text, String text2) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder.matches(text, text2);
    }

    @Override
    public String signIn(String mail, String password) {
        List<User> users = userRepository.findByNameOrPhoneOrMail(mail, mail, mail);
        String status = "";
        if (users.size() > 0) {
            for (User user : users) {
                if (this.decode(password, user.getPassword())) {
                    status = "successfully login";
                } else {
                    status = "check password";
                }
            }
        } else {
            status = "no data found";
        }
        return status;
    }

    @Override
    public int softDeleteById(int id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setIsDelete(true); // Mark the user as deleted
            userRepository.save(user);
            return 1; // Successful soft delete
        }
        return 0; // User not found
    }

    @Override
    public String sendEmail(String to, String textBody, String topic) {
        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setFrom("ilagowda1105@gmail.com");
            simpleMailMessage.setTo(to);
            simpleMailMessage.setSubject(topic);
            simpleMailMessage.setText(textBody);
            javaMailSender.send(simpleMailMessage); // Use javaMailSender
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
        return "Successfully Sent";
    }

	@Override
	public boolean Savorupdate(int id) {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public List<Object[]> mergeUserDataAndPackagePro(Integer userId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	

//    @Override
//    public List<Object[]> mergeUserDataAndPackagePro(Integer userId) {
//        return userRepository.mergeUserDataAndPackagePro(userId);
//    }

}

