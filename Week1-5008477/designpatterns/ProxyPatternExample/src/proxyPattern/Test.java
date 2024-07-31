package proxyPattern;

public class Test{
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Load and display the first image
        image1.display();
        System.out.println("");

        // Load and display the first image again
        image1.display();
        System.out.println("");

        // Load and display the second image
        image2.display();
        System.out.println("");

        // Load and display the second image again
        image2.display();
    }
}
