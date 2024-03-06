package academic.cse110.Rectangle;

class Rectangle {
    private final double WIDTH;
    private final double HEIGHT;
    
    public Rectangle() {
        WIDTH = 1.0;
        HEIGHT = 1.0;
    }
    
    public Rectangle(double width, double height) {
        this.WIDTH = width;
        this.HEIGHT = height;
    }
    
    public double getWidth() {
        return WIDTH;
    }
    
    public double getHeight() {
        return HEIGHT;
    }
    
    public double getArea() {
        return WIDTH * HEIGHT;
    }
    
    public double getPerimeter() {
        return 2 * (WIDTH + HEIGHT);
    }
}

public class App {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        
        System.out.println("Rectangle 1:");
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        
        System.out.println();
        
        System.out.println("Rectangle 2:");
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}
