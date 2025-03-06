//import java.util.Date;
//
//class User {
//    protected int userId;
//    protected String name;
//    protected String email;
//    protected String password;
//}
//
//interface AuthenticationSystem {
//    void signup(User user);
//    void login(User user);
//    void logout(User user);
//}
//
//class UserAuthentication {
//    protected AuthenticationSystem authSystem;
//
//    public UserAuthentication(AuthenticationSystem authSystem) {
//        this.authSystem = authSystem;
//    }
//
//    public void login(User user) {
//        authSystem.login(user);
//    }
//
//    public void logout(User user) {
//        authSystem.logout(user);
//    }
//
//    public void signup(User user) {
//        authSystem.signup(user);
//    }
//}
//
//class NewAuthSystem implements AuthenticationSystem {
//    public void registerUser(String name, String email) {
//        System.out.println(name + " is registered using the new system.");
//    }
//
//    public void loginUser(String name) {
//        System.out.println(name + " logged in using the new system.");
//    }
//
//    public void logoutUser(String name) {
//        System.out.println(name + " logged out using the new system.");
//    }
//
//    @Override
//    public void signup(User user) {
//        registerUser(user.name, user.email);
//    }
//
//    @Override
//    public void login(User user) {
//        loginUser(user.name);
//    }
//
//    @Override
//    public void logout(User user) {
//        logoutUser(user.name);
//    }
//}
//
//class Job {
//    private int jobID;
//    private String title;
//    private String description;
//    private String requirements;
//    private float salary;
//    private int categoryID;
//
//    public Job(int jobID, String title, String description, String requirements, float salary, int categoryID) {
//        this.jobID = jobID;
//        this.title = title;
//        this.description = description;
//        this.requirements = requirements;
//        this.salary = salary;
//        this.categoryID = categoryID;
//    }
//
//    // Getter for title
//    public String getTitle() {
//        return title;
//    }
//
//    // Getter for jobID
//    public int getJobID() {
//        return jobID;
//    }
//
//    public void apply() {
//        System.out.println("Job application for: " + title);
//    }
//}
//
//class JobSeeker extends User {
//    private CVManager cvManager;
//
//    public JobSeeker() {
//        this.cvManager = new CVManager();
//    }
//
//    public void applyForJob(Job job) {
//        System.out.println(name + " applied for job: " + job.getTitle());
//    }
//
//    public void findJob() {
//        System.out.println(name + " is looking for a job.");
//    }
//
//    public void uploadCV(CV cv) {
//        cvManager.upload(cv);
//    }
//
//    public void reviewCV(CV cv) {
//        cvManager.review(cv);
//    }
//}
//
//class CV {
//    private int cvID;
//    private int userID;
//    private String filePath;
//    private String reviewStatus;
//
//    // Getter for filePath
//    public String getFilePath() {
//        return filePath;
//    }
//}
//
//class CVManager {
//    public void upload(CV cv) {
//        System.out.println("CV uploaded at: " + cv.getFilePath());
//    }
//
//    public void review(CV cv) {
//        System.out.println("CV is under review.");
//    }
//}
//
//class Admin extends User {
//    public void manageUsers() {
//        System.out.println("Admin managing users.");
//    }
//
//    public void manageJobs() {
//        System.out.println("Admin managing jobs.");
//    }
//
//    public void generateReports() {
//        System.out.println("Admin generating reports.");
//    }
//}
//
//class Employer extends User {
//    public void postJob(Job job) {
//        System.out.println("Employer posted job: " + job.getTitle());
//    }
//}
//
//class Freelancer extends User {
//    private String portfolio;
//
//    public void applyForFreelanceJob(Job job) {
//        System.out.println(name + " applied for freelance job: " + job.getTitle());
//    }
//
//    public void getHired() {
//        System.out.println(name + " got hired for a freelance job.");
//    }
//}
//
//public class Main10 {
//    public static void main(String[] args) {
//        User user = new User();
//        user.name = "Daniyal Wajid";
//        user.email = "daniyal@example.com";
//
//        NewAuthSystem newAuthSystem = new NewAuthSystem();
//        UserAuthentication authAdapter = new UserAuthentication(newAuthSystem);
//
//        authAdapter.signup(user);
//        authAdapter.login(user);
//        authAdapter.logout(user);
//
//        JobSeeker jobSeeker = new JobSeeker();
//        jobSeeker.name = "Daniyal Wajid";
//        jobSeeker.uploadCV(new CV());
//
//        Admin admin = new Admin();
//        admin.name = "Admin User";
//        admin.manageJobs();
//
//        Employer employer = new Employer();
//        employer.name = "Company Inc.";
//        Job job = new Job(1, "Software Developer", "Develop applications", "Java, Spring", 60000, 101);
//        employer.postJob(job);
//
//        Freelancer freelancer = new Freelancer();
//        freelancer.name = "Freelance Expert";
//        freelancer.applyForFreelanceJob(job);
//    }
//}
