public class Main {
    public static void main(String[] args) {

        Circle circle=new Circle();
        circle.showShape("Circle");
        circle.calculateArea();

        Rectangle rectangle=new Rectangle();
        rectangle.calculateArea();
        rectangle.showShape("Rectangle");

        Sphere sphere= new Sphere();
        sphere.calculateArea();
        sphere.showShape("Sphere");
        sphere.calculateVolume();
        sphere.showShape("Sphere");

        Cylinder cylinder=new Cylinder();
        cylinder.calculateArea();
        cylinder.showShape("cylinder");
        cylinder.calculateVolume();
        cylinder.showShape("cylinder");


    }
}