package CreationalDesignPattren.BuilderDesign.Example1;

public class Shop {
    public static void main(String[] args) {
        Phone phone= new PhoneBuilder().setRam("30").setBattery("3000").getPhone();
        System.out.println(phone);

    }
}
