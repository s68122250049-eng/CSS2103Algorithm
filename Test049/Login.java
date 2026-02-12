class Login {
    protected String username;
    protected String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Methods
    public boolean loginStatus() {
        return true; // สมมติว่าล็อกอินผ่าน
    }
}