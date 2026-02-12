import java.util.ArrayList;
import java.util.List;

public class User extends Login {
    private int user_id;
    private int department_id;
    private String user_username;
    private String user_password;
    private String user_name;
    private Gender user_gender;      // ต้องมีไฟล์ Gender.java
    private String user_email;
    private RoleUser user_role;      // ต้องมีไฟล์ RoleUser.java

    private Department department;
    private List<Proposal> myProposals = new ArrayList<>();

    // Constructor
    public User(String username, String password, int uid, String name, RoleUser role) {
        super(username, password);
        this.user_id = uid;
        this.user_name = name;
        this.user_role = role;
    }

    public void setDepartment(Department dept) {
        this.department = dept;
        this.department_id = 1; 
    }

    // --- เมธอดที่ Error แจ้งว่าหาไม่เจอ ---
    public void userLogin() { 
        if(super.loginStatus()) {
            System.out.println(user_name + " Logged in successfully.");
        }
    }
    
    public void addProposal(Proposal p) {
        myProposals.add(p);
        System.out.println("Proposal added.");
    }
    // ------------------------------------

    public void viewProposal() { System.out.println("Viewing all proposals..."); }
    public void confirmProposal() { System.out.println("Proposal Confirmed."); }
    public void createReports() { System.out.println("Report Created by User."); }
    public void viewReports() { System.out.println("Viewing Reports."); }
    
    public void updateDepartment() { 
        if(department != null) department.updateDepartment(); 
    }
}