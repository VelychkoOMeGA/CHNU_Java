package lab2;

import java.util.Objects;

final public class Circle extends Shape
{
    private int radius;

    public int getRadius() {return radius;}
    public void setRadius(int radius) {this.radius = radius;}

    public Circle(int shapeId, String shapeName, int radius) {
        super(shapeId, shapeName);
        this.radius = radius;
        this.type = "circle";
    }
    public Circle(){
        super(1,"asd");
    };
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", shapeId=" + shapeId +
                ", shapeName='" + shapeName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius);
    }

}
