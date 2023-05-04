import java.util.Scanner;

public class Cylinder extends Shape implements Volume{

    System.out.println("Enter the Height: ");
    Scanner sc= new Scanner(System.in);
    double H = sc.nextDouble();
    System.out.println("Enter the Radius");
    double radius = sc.nextDouble();

    @Override
    public void calculateArea() {
        double area = (2* Math.PI * radius * H)+(2*Math.PI*Math.pow(radius,2));
        System.out.println("The surface area of the Cylinder is: " + area);
    }

    @Override
    public void calculateVolume() {
        double volume = (Math.PI * Math.pow(radius, 2)*H);
        System.out.println("The volume of the sphere is: " + volume);

    }
}
