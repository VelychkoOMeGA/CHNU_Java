package lab2;

import java.util.Objects;

final public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(int shapeId, String shapeName, int length, int width) {
        super(shapeId, shapeName);
        this.length = length;
        this.width = width;
        this.type = "rectangle";
    }

    public Rectangle(){
        super(1,"asd");
    };

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", shapeId=" + shapeId +
                ", shapeName='" + shapeName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return length == rectangle.length && width == rectangle.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, width);
    }

    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }

}
