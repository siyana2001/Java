package NewProj;

class User {
    private String UserName;
    private String Password;

    
    public String getUserName() {
        return UserName;
    }

   
    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    
    public void setPassword(String password) {
        Password = password;
    }
}

public class Getset {
    public static void main(String[] args) {
        User user = new User();

       
        user.setUserName("KGM");
        user.setPassword("Kgm@123");

        
        String userName = user.getUserName();
        String password = user.getPassword();

        System.out.println("User Name: " + userName);
        System.out.println("Password: " + password);
    }
}
