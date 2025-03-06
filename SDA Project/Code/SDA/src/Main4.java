//interface JobSeekerActions {
//    void applyForJob(Job job);
//    void findJob();
//    void uploadCV(CV cv);
//    void reviewCV(CV cv);
//}
//
//interface EmployerActions {
//    void postJob(Job job);
//    void editJob(Job job);
//    void deleteJob(Job job);
//    void hireFreelancer(Freelancer freelancer);
//}
//
//interface AdminActions {
//    void manageUsers();
//    void manageJobs();
//    void generateReports();
//}
//
//interface FreelancerActions {
//    void applyForFreelanceJob(Job job);
//    void getHired();
//}
//
//class User {
//    protected int userId;
//    protected String name;
//    protected String email;
//    protected String password;
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
//class JobSeeker extends User implements JobSeekerActions {
//    private CVManager cvManager;
//
//    public JobSeeker() {
//        this.cvManager = new CVManager();
//    }
//
//    @Override
//    public void applyForJob(Job job) {
//        System.out.println(name + " applied for job: " + job.getTitle());
//    }
//
//    @Override
//    public void findJob() {
//        System.out.println(name + " is looking for a job.");
//    }
//
//    @Override
//    public void uploadCV(CV cv) {
//        cvManager.upload(cv);
//    }
//
//    @Override
//    public void reviewCV(CV cv) {
//        cvManager.review(cv);
//    }
//}
//
//class Admin extends User implements AdminActions {
//    public void manageUsers() {
//        System.out.println(name + " managing users.");
//    }
//
//    public void manageJobs() {
//        System.out.println(name + " managing jobs.");
//    }
//
//    public void generateReports() {
//        System.out.println(name + " generating reports.");
//    }
//}
//
//class Employer extends User implements EmployerActions {
//    @Override
//    public void postJob(Job job) {
//        System.out.println(name + " posted job: " + job.getTitle());
//    }
//
//    @Override
//    public void editJob(Job job) {
//        System.out.println(name + " edited job: " + job.getTitle());
//    }
//
//    @Override
//    public void deleteJob(Job job) {
//        System.out.println(name + " deleted job: " + job.getTitle());
//    }
//
//    @Override
//    public void hireFreelancer(Freelancer freelancer) {
//        System.out.println(name + " hired freelancer: " + freelancer.name);
//    }
//}
//
//class Freelancer extends User implements FreelancerActions {
//    public void applyForFreelanceJob(Job job) {
//        System.out.println(name + " applied for freelance job: " + job.getTitle());
//    }
//
//    public void getHired() {
//        System.out.println(name + " got hired for a freelance job.");
//    }
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
//public class Main4 {
//    public static void main(String[] args) {
//        UserAuthentication auth = new UserAuthentication();
//
//        JobSeeker jobSeeker = new JobSeeker();
//        jobSeeker.name = "Daniyal Wajid";
//        auth.signup(jobSeeker);
//        jobSeeker.applyForJob(new Job(1, "Software Developer", "Develop applications", "Java, Spring", 60000, 101));
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
