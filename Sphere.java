import java.util.Scanner;

public class Sphere extends Shape implements Volume{

    Scanner sc = new Scanner(System.in);
    double H = sc.nextDouble();
    System.out.println("Enter the Radius");
    double radius = sc.nextDouble();
    @Override
    public void calculateArea() {
        double radius = 20;
        double area = 4 * Math.PI * radius * radius;
        System.out.println("The surface area of the sphere is: " + area);

    }

    @Override
    public void calculateVolume() {
        double radius = 20;
        double volume = (4.0/ 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("The volume of the sphere is: " + volume);

    }
}
