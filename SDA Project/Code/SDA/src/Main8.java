//abstract class UserFactory {
//    public abstract User createUser();
//}
//
//class JobSeekerFactory extends UserFactory {
//    @Override
//    public User createUser() {
//        return new JobSeeker();
//    }
//}
//
//class AdminFactory extends UserFactory {
//    @Override
//    public User createUser() {
//        return new Admin();
//    }
//}
//
//class EmployerFactory extends UserFactory {
//    @Override
//    public User createUser() {
//        return new Employer();
//    }
//}
//
//class FreelancerFactory extends UserFactory {
//    @Override
//    public User createUser() {
//        return new Freelancer();
//    }
//}
//
//abstract class User {
//    protected int userId;
//    protected String name;
//    protected String email;
//    protected String password;
//
//    public abstract void displayRole();
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
//
//    @Override
//    public void displayRole() {
//        System.out.println(name + " is a Job Seeker.");
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
//
//    @Override
//    public void displayRole() {
//        System.out.println(name + " is an Admin.");
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
//
//    @Override
//    public void displayRole() {
//        System.out.println(name + " is an Employer.");
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
//
//    @Override
//    public void displayRole() {
//        System.out.println(name + " is a Freelancer.");
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
//}
//
//class CV {
//    private int cvID;
//    private int userID;
//    private String filePath;
//    private String reviewStatus;
//}
//
//class CVManager {
//    public void upload(CV cv) {
//        System.out.println("CV uploaded at: DB");
//    }
//
//    public void review(CV cv) {
//        System.out.println("CV is under review.");
//    }
//}
//
//public class Main8 {
//    public static void main(String[] args) {
//        UserFactory jobSeekerFactory = new JobSeekerFactory();
//        UserFactory adminFactory = new AdminFactory();
//        UserFactory employerFactory = new EmployerFactory();
//        UserFactory freelancerFactory = new FreelancerFactory();
//
//        User jobSeeker = jobSeekerFactory.createUser();
//        jobSeeker.name = "Daniyal Wajid";
//
//        User admin = adminFactory.createUser();
//        admin.name = "Admin User";
//
//        User employer = employerFactory.createUser();
//        employer.name = "Company Inc.";
//
//        User freelancer = freelancerFactory.createUser();
//        freelancer.name = "Freelance Expert";
//
//        jobSeeker.displayRole();
//        admin.displayRole();
//        employer.displayRole();
//        freelancer.displayRole();
//
//        JobSeeker jobSeekerUser = (JobSeeker) jobSeeker;
//        jobSeekerUser.applyForJob(new Job(1, "Software Developer", "Develop applications", "Java, Spring", 60000, 101));
//
//        Employer employerUser = (Employer) employer;
//        employerUser.postJob(new Job(2, "Data Scientist", "Analyze data", "Python, ML", 80000, 102));
//
//        Freelancer freelancerUser = (Freelancer) freelancer;
//        freelancerUser.applyForFreelanceJob(new Job(3, "Web Developer", "Build websites", "HTML, CSS, JavaScript", 50000, 103));
//    }
//}
