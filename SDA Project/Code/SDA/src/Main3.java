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
//    public abstract void performAction();
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
//        return jobID;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void apply() {
//        System.out.println("Job application for: " + title);
//    }
//}
//
//class JobSeeker extends User {
//    private CVManager cvManager;
//    private JobPostingService jobPostingService;
//
//    public JobSeeker(JobPostingService jobPostingService, CVManager cvManager) {
//        this.jobPostingService = jobPostingService;
//        this.cvManager = cvManager;
//    }
//
//    @Override
//    public void performAction() {
//        System.out.println(name + " is looking for a job.");
//    }
//
//    public void applyForJob(Job job) {
//        System.out.println(name + " applied for job: " + job.getTitle());
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
//        return this.filePath;
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
//class Admin extends User implements JobPostingService {
//    public Admin() {
//    }
//
//    @Override
//    public void performAction() {
//        System.out.println(name + " is managing users and jobs.");
//    }
//
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
//}
//
//class Employer extends User implements JobPostingService {
//    public Employer() {
//    }
//
//    @Override
//    public void performAction() {
//        System.out.println(name + " is managing jobs.");
//    }
//
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
//    @Override
//    public void performAction() {
//        System.out.println(name + " is looking for freelance work.");
//    }
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
//public class Main3 {
//    public static void main(String[] args) {
//        CVManager cvManager = new CVManager();
//        JobPostingService jobPostingService = new Employer();
//
//        JobSeeker jobSeeker = new JobSeeker(jobPostingService, cvManager);
//        jobSeeker.name = "Daniyal Wajid";
//        jobSeeker.applyForJob(new Job(1, "Software Developer", "Develop applications", "Java, Spring", 60000, 101));
//        jobSeeker.uploadCV(new CV());
//
//        Admin admin = new Admin();
//        admin.name = "Admin User";
//        admin.postJob(new Job(2, "Project Manager", "Manage projects", "Leadership, Java", 70000, 102));
//
//        Employer employer = new Employer();
//        employer.name = "Company Inc.";
//        employer.postJob(new Job(3, "Web Developer", "Create websites", "HTML, CSS, JS", 50000, 103));
//
//        Freelancer freelancer = new Freelancer();
//        freelancer.name = "Freelance Expert";
//        freelancer.applyForFreelanceJob(new Job(4, "Freelance Writer", "Write articles", "Writing, Research", 30000, 104));
//    }
//}
