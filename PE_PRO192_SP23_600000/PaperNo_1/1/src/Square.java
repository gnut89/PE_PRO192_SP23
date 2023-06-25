
public class Square extends Rectangle {
    private String unit;
    
    public Square(int side) {
        super(side, side);
        this.unit = "cm";
    }
    
    public void setSquare(int side) {
        if (side > 0) {
            setLength(side);
            setWidth(side);
        }
    }

    public int getPerimeter() {
        return (getLength() + getWidth()) * 2;
    }
    
    public void output() {
        System.out.println("the side of the square=" + getLength() + "(" + unit + ")");
        System.out.println();
        System.out.println("the perimeter of the square=" + getPerimeter() + "(" + unit + ")");
    }
    
}