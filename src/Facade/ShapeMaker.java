package Facade;

public class ShapeMaker {
    Shape circle, rectangular, square ;

    public ShapeMaker(){
        circle = new Circle() ;
        rectangular = new Rectangular() ;
        square = new Square() ;
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangular(){
        rectangular.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
