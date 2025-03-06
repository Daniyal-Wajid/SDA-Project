//import java.util.Date;
//
//class CV {
//    private String filePath;
//
//    public CV(String filePath) {
//        this.filePath = filePath;
//    }
//
//    public String getFilePath() {
//        return filePath;
//    }
//}
//
//interface ICVManager {
//    void upload(CV cv);
//    void review(CV cv);
//}
//
//interface IJobPostingService {
//    void postJob(Job job);
//    void editJob(Job job);
//    void deleteJob(Job job);
//}
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
//    public String getTitle() {
//        return title;
//    }
//
//    public int getJobID() {
//        return jobID;
//    }
//}
//
//class CVManager implements ICVManager {
//    public void upload(CV cv) {
//        System.out.println("CV uploaded at: " + cv.getFilePath());
//    }
//
//    public void review(CV cv) {
//        System.out.println("CV is under review.");
//    }
//}
//
//class JobPostingService implements IJobPostingService {
//    public void postJob(Job job) {
//        System.out.println("Job posted: " + job.getTitle());
//    }
//
//    public void editJob(Job job) {
//        System.out.println("Job edited: " + job.getTitle());
//    }
//
//    public void deleteJob(Job job) {
//        System.out.println("Job deleted: " + job.getTitle());
//    }
//}
//
//class JobSeeker extends User {
//    private ICVManager cvManager;
//
//    public JobSeeker(ICVManager cvManager) {
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
//class Admin extends User {
//    private IJobPostingService jobPostingService;
//
//    public Admin(IJobPostingService jobPostingService) {
//        this.jobPostingService = jobPostingService;
//    }
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
//
//    public void postJob(Job job) {
//        jobPostingService.postJob(job);
//    }
//}
//
//class Employer extends User {
//    private IJobPostingService jobPostingService;
//
//    public Employer(IJobPostingService jobPostingService) {
//        this.jobPostingService = jobPostingService;
//    }
//
//    public void postJob(Job job) {
//        jobPostingService.postJob(job);
//    }
//
//    public void editJob(Job job) {
//        jobPostingService.editJob(job);
//    }
//
//    public void deleteJob(Job job) {
//        jobPostingService.deleteJob(job);
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
//public class Main5 {
//    public static void main(String[] args) {
//        User user = new User();
//        user.name = "Daniyal Wajid";
//
//        UserAuthentication auth = new UserAuthentication();
//        auth.signup(user);
//
//        ICVManager cvManager = new CVManager();
//        JobSeeker jobSeeker = new JobSeeker(cvManager);
//        jobSeeker.name = "Daniyal Wajid";
//        jobSeeker.uploadCV(new CV("path/to/cv"));
//
//        IJobPostingService jobPostingService = new JobPostingService();
//        Admin admin = new Admin(jobPostingService);
//        admin.name = "Admin User";
//        admin.manageJobs();
//        admin.postJob(new Job(1, "Software Developer", "Develop applications", "Java, Spring", 60000, 101));
//
//        Employer employer = new Employer(jobPostingService);
//        employer.name = "Company Inc.";
//        Job job = new Job(1, "Software Developer", "Develop applications", "Java, Spring", 60000, 101);
//        employer.postJob(job);
//
//        Freelancer freelancer = new Freelancer();
//        freelancer.name = "Freelance Expert";
//        freelancer.applyForFreelanceJob(job);
//    }
//}
