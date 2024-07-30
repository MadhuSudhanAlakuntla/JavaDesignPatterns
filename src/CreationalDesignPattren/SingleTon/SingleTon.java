package CreationalDesignPattren.SingleTon;

public class SingleTon {

    private static SingleTon instance;

    private SingleTon(){}

    public static SingleTon getInstance(){

        if(instance==null){
            instance=  new SingleTon();
        }
        return instance;

        }
    private void someMethod() {
    }




    public static void main(String[] args) {
        // Usage
        SingleTon singleton1 = SingleTon.getInstance();
        SingleTon singleton2 = SingleTon.getInstance();

        // Both objects refer to the same instance
        System.out.println(singleton1 == singleton2); // true

        singleton1.someMethod(); // Outputs: Some method of the Singleton class
        singleton2.someMethod(); // Outputs: Some method of the Singleton class
    }


}
