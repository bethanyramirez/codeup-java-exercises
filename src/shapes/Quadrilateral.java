package shapes;

abstract public class Quadrilateral extends Shape  { // this was supposed to implement Measurable, but you moved it to your java class assessment

    protected int length;
    protected int width;


    Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    abstract void setLength(int length);
    abstract void setWidth(int width);

}
