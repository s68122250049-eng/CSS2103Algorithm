public class MainSystem {
    public static void main(String[] args) {
        // 1. สร้างแผนก
        Department itDept = new Department(101, "IT Department");

        // 2. สร้าง User (Manager)
        User manager = new User("admin", "1234", 1, "Somchai", RoleUser.Manager);
        manager.setDepartment(itDept);
        manager.userLogin();

        // 3. สร้าง Applicant และ Proposal (Composition)
        Applicant app1 = new Applicant(501, "Somsri", Gender.F);
        Proposal prop1 = new Proposal("P-001", "Buy New Servers", app1);
        
        // 4. User เพิ่ม Proposal
        manager.addProposal(prop1);

        // 5. สร้าง Report จาก Proposal
        Report rep1 = new Report(901, prop1);
        rep1.viewReports();
        
        // ตรวจสอบสถานะ Proposal
        prop1.viewStatus(); // ผลลัพธ์ควรเป็น Waiting
    }
}