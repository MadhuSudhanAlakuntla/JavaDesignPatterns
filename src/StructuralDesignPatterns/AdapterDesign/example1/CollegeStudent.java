package StructuralDesignPatterns.AdapterDesign.example1;

///existing
public record CollegeStudent(String id, String name, String email) implements Student {

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
