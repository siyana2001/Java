package com.example.demo1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Query;

import com.example.demo1.modal.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByName(String name);
    List<User> findByMail(String mail);
    List<User> findByPhone(String phone);
    List<User> findByPassword(String password);
//    List<User> findByIsActiveTrue();
    List<User> findByIsDeleteFalse();
	List<User> findByNameOrPhoneOrMail(String to, String textBody, String topic);



//	@Query(nativeQuery = true, value = "SELECT  id, name, phone, mail, password FROM user " +
//	        "UNION " +
//	        "SELECT id, address, climate, cost, place, hotel FROM packagepro")
//	List<Object[]> mergeUserAndPackageproData();
//	List<Object[]> mergeUserDataA
	
	@Query(nativeQuery = true, value = "SELECT id, name, phone, mail, password, is_delete FROM user UNION SELECT ptid, address, climate, cost, place, hotel FROM packagepro;"
	        )
	List<Object[]> mergeUserAndPackageproData();
	
	}