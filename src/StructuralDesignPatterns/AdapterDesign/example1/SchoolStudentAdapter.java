package StructuralDesignPatterns.AdapterDesign.example1;

public class SchoolStudentAdapter implements Student {

    private final SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent){
        this.schoolStudent=schoolStudent;
    }


    @Override
    public String id() {
        return this.schoolStudent.getStu_id();
    }

    @Override
    public String name() {
        return this.schoolStudent.getStu_name();
    }

    @Override
    public String email() {
        return this.schoolStudent.getStu_email();
    }

    @Override
    public String toString() {
        return "SchoolStudentAdapter{" +
                "schoolStudent=" + schoolStudent +
                '}';
    }
}
