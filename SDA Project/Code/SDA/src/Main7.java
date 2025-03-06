//import java.util.Date;
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
//    public String getTitle() {
//        return title;
//    }
//
//    public int getJobID() {
//        return jobID;
//    }
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
//    public String getFilePath() {
//        return filePath;
//    }
//
//    public void setFilePath(String filePath) {
//        this.filePath = filePath;
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
//        this.applicationID = (int) (Math.random() * 1000);
//    }
//
//    public void updateStatus(String newStatus) {
//        this.status = newStatus;
//        System.out.println("Application status updated to: " + status);
//    }
//}
//
//class UserFactory {
//    public static User createUser(String userType) {
//        switch (userType.toLowerCase()) {
//            case "jobseeker":
//                return new JobSeeker();
//            case "admin":
//                return new Admin();
//            case "employer":
//                return new Employer();
//            case "freelancer":
//                return new Freelancer();
//            default:
//                throw new IllegalArgumentException("Invalid user type.");
//        }
//    }
//}
//
//public class Main7 {
//    public static void main(String[] args) {
//        User user1 = UserFactory.createUser("jobseeker");
//        user1.name = "Daniyal Wajid";
//        UserAuthentication auth = new UserAuthentication();
//        auth.signup(user1);
//
//        JobSeeker jobSeeker = (JobSeeker) user1;
//        jobSeeker.uploadCV(new CV());
//
//        User user2 = UserFactory.createUser("admin");
//        user2.name = "Admin User";
//        Admin admin = (Admin) user2;
//        admin.manageJobs();
//
//        User user3 = UserFactory.createUser("employer");
//        user3.name = "Company Inc.";
//        Employer employer = (Employer) user3;
//        Job job = new Job(1, "Software Developer", "Develop applications", "Java, Spring", 60000, 101);
//        employer.postJob(job);
//
//        User user4 = UserFactory.createUser("freelancer");
//        user4.name = "Freelance Expert";
//        Freelancer freelancer = (Freelancer) user4;
//        freelancer.applyForFreelanceJob(job);
//    }
//}
