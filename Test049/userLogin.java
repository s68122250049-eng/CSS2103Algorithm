public void userLogin() { 
        if(super.loginStatus()) {
            System.out.println(user_name + " Logged in successfully.");
        }
    }
    
    public void addProposal(Proposal p) {
        myProposals.add(p);
        System.out.println("Proposal added.");
    }

    public void viewProposal() { System.out.println("Viewing all proposals..."); }
    public void confirmProposal() { System.out.println("Proposal Confirmed."); }
    public void createReports() { System.out.println("Report Created by User."); }
    public void viewReports() { System.out.println("Viewing Reports."); }
    
    // Method นี้ชื่อซ้ำกับใน Department แต่น่าจะเป็นการเรียกใช้ข้ามคลาส
    public void updateDepartment() { 
        if(department != null) department.updateDepartment(); 
    }