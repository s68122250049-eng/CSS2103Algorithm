class Department {
    private int department_id;  
    private String department_name;

    public Department(int id, String name) {
        this.department_id = id;
        this.department_name = name;
    }

    public void insertDepartment() { System.out.println("Inserted Department"); }
    public void updateDepartment() { System.out.println("Updated Department"); }
    public void deleteDepartment() { System.out.println("Deleted Department"); }
}