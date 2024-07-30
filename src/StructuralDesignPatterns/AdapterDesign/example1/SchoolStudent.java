package StructuralDesignPatterns.AdapterDesign.example1;

//not compatible
public class SchoolStudent {

        private final String stu_id;
        private final String stu_name;
        private final String stu_email;
        

        public SchoolStudent( String stu_id,String stu_name , String stu_email) {
            this.stu_email=stu_email;
            this.stu_id=stu_id;
            this.stu_name=stu_name;

        }

    public String getStu_id() {
        return stu_id;
    }

    public String getStu_name() {
        return stu_name;
    }

    public String getStu_email() {
        return stu_email;
    }

    @Override
    public String toString() {
        return "SchoolStudent{" +
                "stu_id='" + stu_id + '\'' +
                ", stu_name='" + stu_name + '\'' +
                ", stu_email='" + stu_email + '\'' +
                '}';
    }
}
