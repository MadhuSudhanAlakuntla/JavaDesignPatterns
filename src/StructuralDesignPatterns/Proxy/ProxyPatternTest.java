package StructuralDesignPatterns.Proxy;

//the client can use the ProxyImage to interact with the image:
public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        // Image will be loaded from disk and displayed
        image.display();
        System.out.println("");

        // Image will not be loaded from disk, only displayed
        image.display();
    }
}

