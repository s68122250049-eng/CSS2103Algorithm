import java.util.Date;

class Proposal {
    private String proposal_code;
    private String proposal_title;
    private String proposal_text;
    private Date proposal_date;
    private StatusProposal proposal_status;
    
    //  Composition: Proposal 1 รายการ ต้องมี Applicant 1 คน
    private Applicant applicant; 

    public Proposal(String code, String title, Applicant app) {
        this.proposal_code = code;
        this.proposal_title = title;
        this.proposal_date = new Date();
        this.proposal_status = StatusProposal.Waiting; //ค่าเริ่มต้น Waiting
        this.applicant = app; // ผูก Applicant เข้ากับ Proposal ทันที
    }

    //  Methods
    public void viewProposal() { System.out.println("Viewing Proposal: " + proposal_title); }
    public void viewStatus() { System.out.println("Status: " + proposal_status); }
    public void updateProposal() { System.out.println("Proposal Updated"); }
    public void deleteProposal() { System.out.println("Proposal Deleted"); }
    public void archiveProposal() { System.out.println("Proposal Archived"); }
    public void viewApplicant() { System.out.println("Applicant is: " + applicant); }
}