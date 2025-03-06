//import java.util.Date;
//
//class User {
//    protected int userId;
//    protected String name;
//    protected String email;
//    protected String password;
//
//    // User-related methods can go here
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
//    public void apply() {
//        System.out.println("Job application for: " + title);
//    }
//
//    // Getter methods...
//}
//
//class JobSeeker extends User {
//    private CVManager cvManager;
//
//    public JobSeeker() {
//        this.cvManager = new CVManager(); // Initialize CVManager
//    }
//
//    public void applyForJob(Job job) {
//        JobApplication application = new JobApplication(this.userId, job.getJobID());
//        System.out.println(name + " applied for job: " + job.getTitle());
//    }
//
//    public void findJob() {
//        System.out.println(name + " is looking for a job.");
//    }
//
//    // Delegating the CV management to the CVManager
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
//    // Getters and setters...
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
//    private int adminID;
//
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
//
//    public void editJob(Job job) {
//        System.out.println("Employer edited job: " + job.getTitle());
//    }
//
//    public void deleteJob(Job job) {
//        System.out.println("Employer deleted job: " + job.getTitle());
//    }
//
//    public void hireFreelancer(Freelancer freelancer) {
//        System.out.println("Employer hired freelancer: " + freelancer.name);
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
//class JobApplication {
//    private int applicationID;
//    private int jobID;
//    private int userID;
//    private String status;
//    private Date dateApplied;
//
//    public JobApplication(int userID, int jobID) {
//        this.userID = userID;
//        this.jobID = jobID;
//        this.status = "Applied";
//        this.dateApplied = new Date();
//        this.applicationID = (int) (Math.random() * 1000); // Random ID for simplicity
//    }
//
//    public void updateStatus(String newStatus) {
//        this.status = newStatus;
//        System.out.println("Application status updated to: " + status);
//    }
//}
//
//// Example of using the classes
//public class Main {
//    public static void main(String[] args) {
//        User user = new User();
//        user.name = "Daniyal Wajid";
//
//        UserAuthentication auth = new UserAuthentication();
//        auth.signup(user);
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
