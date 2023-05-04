import java.math.*;
import java.util.Scanner;
public class Circle extends Shape {
    Scanner sc = new Scanner(System.in);

    @Override
    public void calculateArea() {
        Scanner sc=new Scanner(System.in);

        double R=31.1;
        double area = 2*Math.PI* Math.pow(R,2);
        System.out.print("Enter radius of circle ");
        R = sc.nextInt();


        System.out.println("The Area of the circle is "+area);

    }
}
