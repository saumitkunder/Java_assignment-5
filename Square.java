import java.math.*;
public class Square extends Shape{
    @Override
    public void calculateArea() {
        double s =10 ;
        double area = Math.pow(s,2);

        System.out.println("The area of the square is "+area);
    }
}
