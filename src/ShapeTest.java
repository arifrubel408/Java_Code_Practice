
public class ShapeTest {
    
    public static void main(String[] args) {
        
        drawShape(new Square(4));
        drawShape(new Circle(5));
        drawShape(new Rectangle(3,5));
        System.out.println(" ");
        System.out.println("Area Of circle " +area(new Circle(4)));
        System.out.println("Area Of Square " +area(new Square(4)));
        System.out.println("Area Of Rectangle " +area(new Rectangle(3,4)));
        
        
        
        
        
//        Shape obj = new Circle(6);
//        drawShape(obj);
//        
        
        
//        Shape obj1 = new Square(8);
//        drawShape(obj1);
        


//        drawCircle();
//        drawSquare();
    }
    
    
    public static void  drawShape(Shape shape){
        shape.draw();
    }
    
     public static double  area(Shape shape){
       return  shape.getArea();
    }
    
//    public static void drawSquare(){
//        Square square = new Square(5);
//        square.draw();
//    }
    
//    public static void drawCircle(){
//        Circle circle = new Circle(3);
//        circle.draw();
//    }
    
//    public static void drawRectangle(){
//        Rectangle rectangle = new Rectangle(3);
//        rectangle.draw();
//    }
     
}


interface Shape {

    double getArea();

    void draw();
}


class Square implements Shape {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return Math.pow(this.a, 2);
    }

    @Override
    public void draw() {
        System.out.println("Drewing a Square");
    }
}

class Circle implements Shape {

    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        //return 3.1416*r*r;
       return Math.PI * Math.pow(r, 2);
    }

    @Override
    public void draw() {
        System.out.println("Drewing a Circle");
    }
}

class Rectangle implements Shape {

    private int w;
    private int h;

    public Rectangle(int w, int h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double getArea() {
        return w*h;
    }

    @Override
    public void draw() {
        System.out.println("Drewing a Rectangle");
    }
}

