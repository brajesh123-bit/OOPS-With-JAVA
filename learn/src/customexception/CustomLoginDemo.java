package customexception;

//Custom Exception for Invalid Login
class InvalidLoginException extends Exception {
 public InvalidLoginException(String message) {
     super(message);
 }
}

//Login System Class
class LoginSystem {
 private String correctUsername = "admin";
 private String correctPassword = "1234";

 public void login(String username, String password) throws InvalidLoginException {
     if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
         throw new InvalidLoginException("Login Failed! Invalid Username or Password.");
     } else {
         System.out.println("Login Successful! Welcome " + username + " 🚀");
     }
 }
}

//Main Class
public class CustomLoginDemo {
 public static void main(String[] args) {
     LoginSystem system = new LoginSystem();

     try {
         // First attempt (wrong credentials)
         system.login("user", "pass");

         // Second attempt (correct credentials)
         system.login("admin", "1234");
     } catch (InvalidLoginException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}

