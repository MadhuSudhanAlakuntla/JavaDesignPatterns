package CreationalDesignPattren.BuilderDesign.Example1;

public class Phone {


    private final String os;
    private final String ram;
    private final String processor;
    private final String battery;

    public Phone(String os, String ram, String processor, String battery) {
        this.os = os;
        this.battery = battery;
        this.processor = processor;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}