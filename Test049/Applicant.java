class Applicant {
    private int Applicant_id; 
    private String Applicant_name;
    private String Applicant_job;
    private String Applicant_address; 
    private Gender Applicant_gender;
    private String Applicant_tel;

    public Applicant(int id, String name, Gender gender) {
        this.Applicant_id = id;
        this.Applicant_name = name;
        this.Applicant_gender = gender;
    }

    //  Methods
    public void insertApplicant() { System.out.println("Applicant Inserted"); }
    public void updateApplicant() { System.out.println("Applicant Updated"); }
    public void deleteApplicant() { System.out.println("Applicant Deleted"); }
}