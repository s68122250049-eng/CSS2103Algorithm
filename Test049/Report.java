import java.util.Date;

class Report {
    private int Report_code;
    private Date Report_date;
    
    // Composition: Report 1 ฉบับ ผูกกับ Proposal 1 รายการ
    private Proposal proposal;   

    public Report(int code, Proposal prop) {
        this.Report_code = code;
        this.Report_date = new Date();
        this.proposal = prop;
    }

    // Methods
    public void viewReports() { System.out.println("Viewing Report ID: " + Report_code); }
    public void createReports() { System.out.println("Report Created"); }
}