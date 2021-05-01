public class StudentManager extends  UserManager{
    @Override
    public void register(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adlı kullanıcı aramıza öğrenci olarak katıldı.");
    }

    @Override
    public void getUserProfile(User user) {
        System.out.println("--------------------------");
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getUserName());
        System.out.println(user.getPassWord());
        System.out.println(user.getAge());
        System.out.println(user.getEmail());
        System.out.println("--------------------------");
    }
}
