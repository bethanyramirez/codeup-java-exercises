package shapes;

public class Square extends Quadrilateral{


    Square(int side){
        super(side, side);
    }



    protected void setLength(int length) {
        this.length = length;
    }

    protected void setWidth(int width) {
        this.width = width;
    }

    public double getPerimeter() {
        return 4 * this.length;
    }

    public double getArea() {
        return this.length * this.length;
    }
}
