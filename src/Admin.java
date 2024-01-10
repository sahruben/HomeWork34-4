public class Admin implements Authorization {
    private String username;
    private String password;

    public Admin(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean checkPassword(String password) {
        return this.password.equals(password) && this.username.equals("admin");
    }


}
