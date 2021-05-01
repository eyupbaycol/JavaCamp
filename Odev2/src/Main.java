public class Main {


    public static void main(String[] args) {
        //Login Page Ui
        RegisterUI registerUi = new RegisterUI();

        //Profile page
        ProfileUI profileUI = new ProfileUI();


        //student for register
        Student student = new Student();
        student.setId(1);
        student.setFirstName("Eyüp");
        student.setLastName("Bayçöl");
        student.setDepartmentName("Computer Engineering");
        student.setSchoolEmail("eyup.baycol@ceng.tr");
        student.setSchoolName("Cumhuriyet Üniversitesi");
        student.setAge(24);
        student.setEmail("eyup.bycl@gmail.com");
        student.setPassWord("*******");
        student.setUserName("eyupbaycol");

        //Instructor for register
        Instructor instructor = new Instructor();
        instructor.setId(1);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demirog");
        instructor.setAge(35);
        instructor.setEmail("engin.demirog@gmail.com");
        instructor.setCertificates("PMP Certificate");
        instructor.setWorkPlaceName("HalkBank");
        instructor.setUserName("engindemirog");
        instructor.setPassWord("*********");

        //Register for all users
        registerUi.setRegister(new InstructorManager(), instructor);
        registerUi.setRegister(new StudentManager(), student);

        //Get profile info for users
        profileUI.getProfileInformation(new InstructorManager(), instructor);
        profileUI.getProfileInformation(new StudentManager(), student);
    }
}
