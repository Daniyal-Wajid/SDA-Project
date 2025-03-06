//import java.util.Date;
//
//class User {
//    protected int userId;
//    protected String name;
//    protected String email;
//    protected String password;
//}
//
//class UserAuthentication {
//    public void login(User user) {
//        System.out.println(user.name + " logged in.");
//    }
//
//    public void logout(User user) {
//        System.out.println(user.name + " logged out.");
//    }
//
//    public void signup(User user) {
//        System.out.println(user.name + " signed up.");
//    }
//}
//
//class NewAuthSystem {
//    public void registerUser(String name, String email) {
//        System.out.println(name + " is registered using the new system.");
//    }
//
//    public void loginUser(String name) {
//        System.out.println(name + " logged in using the new system.");
//    }
//}
//
//class AuthenticationAdapter extends UserAuthentication {
//    private NewAuthSystem newAuthSystem;
//
//    public AuthenticationAdapter(NewAuthSystem newAuthSystem) {
//        this.newAuthSystem = newAuthSystem;
//    }
//
//    @Override
//    public void signup(User user) {
//        newAuthSystem.registerUser(user.name, user.email);
//    }
//
//    @Override
//    public void login(User user) {
//        newAuthSystem.loginUser(user.name);
//    }
//
//    @Override
//    public void logout(User user) {
//        System.out.println(user.name + " logged out using the new system.");
//    }
//}
//
//public class Main9 {
//    public static void main(String[] args) {
//        User user = new User();
//        user.name = "Daniyal Wajid";
//        user.email = "daniyal@example.com";
//
//        NewAuthSystem newAuthSystem = new NewAuthSystem();
//
//        UserAuthentication authAdapter = new AuthenticationAdapter(newAuthSystem);
//
//        authAdapter.signup(user);
//        authAdapter.login(user);
//        authAdapter.logout(user);
//    }
//}
