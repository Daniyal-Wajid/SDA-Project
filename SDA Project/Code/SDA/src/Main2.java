//import java.util.Date;
//
//interface JobPostingService {
//    void postJob(Job job);
//    void editJob(Job job);
//    void deleteJob(Job job);
//}
//
//interface CVManagementService {
//    void upload(CV cv);
//    void review(CV cv);
//}
//
//abstract class User {
//    protected int userId;
//    protected String name;
//    protected String email;
//    protected String password;
//
//    // Abstract methods can be defined here for user-specific behavior if needed
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
//    public int getJobID() {
//        return this.jobID;
//    }
//
//    public String getTitle() {
//        return this.title;
//    }
//
//    public String getDescription() {
//        return this.description;
//    }
//
//    public String getRequirements() {
//        return this.requirements;
//    }
//
//    public float getSalary() {
//        return this.salary;
//    }
//
//    public int getCategoryID() {
//        return this.categoryID;
//    }
//
//    public void apply() {
//        System.out.println("Job application for: " + title);
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
//        return this.filePath;
//    }
//
//    public void setFilePath(String filePath) {
//        this.filePath = filePath;
//    }
//
//    // other getters and setters...
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
//class CVManager implements CVManagementService {
//    public void upload(CV cv) {
//        System.out.println("CV uploaded at: " + cv.getFilePath());
//    }
//
//    public void review(CV cv) {
//        System.out.println("CV is under review.");
//    }
//}
//
//class JobSeeker extends User {
//    private JobPostingService jobPostingService;
//    private CVManager cvManager;
//
//    public JobSeeker(JobPostingService jobPostingService, CVManager cvManager) {
//        this.jobPostingService = jobPostingService;
//        this.cvManager = cvManager;
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
//class Admin extends User implements JobPostingService, CVManagementService {
//    public void postJob(Job job) {
//        System.out.println("Admin posted job: " + job.getTitle());
//    }
//
//    public void editJob(Job job) {
//        System.out.println("Admin edited job: " + job.getTitle());
//    }
//
//    public void deleteJob(Job job) {
//        System.out.println("Admin deleted job: " + job.getTitle());
//    }
//
//    public void upload(CV cv) {
//        System.out.println("Admin uploaded CV at: " + cv.getFilePath());
//    }
//
//    public void review(CV cv) {
//        System.out.println("Admin is reviewing CV.");
//    }
//
//    public void manageJobs() {
//        System.out.println("Admin is managing jobs.");
//    }
//}
//
//class Employer extends User implements JobPostingService {
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
//public class Main2 {
//    public static void main(String[] args) {
//        CVManager cvManager = new CVManager();
//        JobPostingService jobPostingService = new Employer(); // Assuming Employer posts jobs
//
//        JobSeeker jobSeeker = new JobSeeker(jobPostingService, cvManager);
//        jobSeeker.name = "Daniyal Wajid";
//        jobSeeker.uploadCV(new CV());
//
//        Admin admin = new Admin();
//        admin.name = "Admin User";
//        admin.manageJobs();
//        admin.postJob(new Job(1, "Software Developer", "Develop applications", "Java, Spring", 60000, 101));
//
//        Employer employer = new Employer();
//        employer.name = "Company Inc.";
//        employer.postJob(new Job(2, "Project Manager", "Manage projects", "Leadership, Java", 70000, 102));
//
//        Freelancer freelancer = new Freelancer();
//        freelancer.name = "Freelance Expert";
//        freelancer.applyForFreelanceJob(new Job(3, "Web Developer", "Create websites", "HTML, CSS, JS", 50000, 103));
//    }
//}
