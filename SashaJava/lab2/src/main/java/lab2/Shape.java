package lab2;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.Objects;

//даємо інформацію jackson`у
@JsonTypeInfo( use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Circle.class, name = "circle"),
        @JsonSubTypes.Type(value = Rectangle.class, name = "rectangle")
})
abstract public class Shape
{
    protected int shapeId;
    protected String shapeName;
    protected String type;

    //конструктор
    public Shape(int shapeId, String shapeName) {
        this.shapeId = shapeId;
        this.shapeName = shapeName;
        this.type = "shapeType";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape)) return false;
        Shape shape = (Shape) o;
        return shapeId == shape.shapeId && Objects.equals(shapeName, shape.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeId, shapeName);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "shapeId=" + shapeId +
                ", shapeName='" + shapeName + '\'' +
                '}';
    }

    //геттери та сеттери
    public void setShapeId(int shapeId) {this.shapeId = shapeId;}
    public void setShapeName(String shapeName) {this.shapeName = shapeName;}
    public void setType(String type) {this.type = type;}
    public String getType() {return type;}
    public int getShapeId() {return shapeId;}
    public String getShapeName() {return shapeName;}

}
