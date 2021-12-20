package Shapes;

public abstract class Shape {
    abstract void Draw();
}
class Circle extends Shape{
    void Draw(){
        System.out.println("Draw The Circle Shape");
    }
}
class RectAngular extends Shape {
    void Draw(){
        System.out.println("Draw the RectAngular Shape");
    }
    public static void main(String args[]){
        Shape Show = new RectAngular(); // here we use Dynamic Method Dispatching only replace the Name of Class To Show the Result..
        Shape show = new Circle();
        Show.Draw();
        show.Draw();    // here Both are same but Dynamic Dispatching Method is To be Used Here.... Here Result will Be Different...
    }
}
