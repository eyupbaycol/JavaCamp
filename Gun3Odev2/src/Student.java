public class Student extends User{
       private String schoolName;
       private String schoolEmail;

        public String getSchoolName() {
                return schoolName;
        }

        public void setSchoolName(String schoolName) {
                this.schoolName = schoolName;
        }

        public String getSchoolEmail() {
                return schoolEmail;
        }

        public void setSchoolEmail(String schoolEmail) {
                this.schoolEmail = schoolEmail;
        }

        public String getDepartmentName() {
                return departmentName;
        }

        public void setDepartmentName(String departmentName) {
                this.departmentName = departmentName;
        }

        private String departmentName;
}
