public class Rectangle extends Shape{
    @Override
    public void calculateArea() {
        double len=12;
        double bread=14.32;
        double area= len *bread;

        System.out.println("The area of the rectangle is "+area);
    }
}
