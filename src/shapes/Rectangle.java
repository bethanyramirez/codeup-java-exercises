package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea(){
//        return this.length * this.width;
//    }
//
//    public int getPerimeter(){
//        return 2 * (this.length + this.width);
//    }

    Rectangle(int length, int width){
        super(length, width);
    }

    void setLength(int length) {
        this.length = length;
    }


    void setWidth(int width) {
        this.length = width;
    }


    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }


    public double getArea() {
        return this.length * this.width;
    }
}
