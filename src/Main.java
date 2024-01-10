public class Main {
    public static void main(String[] args) {
        User user = new User("user", "password");
        System.out.println(user.checkPassword("password"));
        System.out.println(user.checkPassword("wrong_password"));

        Admin admin = new Admin("admin", "password");
        System.out.println(admin.checkPassword("password"));
        System.out.println(admin.checkPassword("wrong_password"));

    }
}
