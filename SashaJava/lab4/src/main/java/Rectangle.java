import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Set;

public class Rectangle extends Shape{

    private final int length;
    private final int width;

    public Rectangle(RectangleBuilder rb)
    {
        super(rb);//передає білдер в батьківський клас
        this.length = rb.length;
        this.width = rb.width;
        this.type = "rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", shapeId=" + shapeId +
                ", shapeName='" + shapeName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
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

    @Override
    public int compareTo(Shape o) {
        return this.getShapeName().compareTo(o.getShapeName());
    }

    final static public class RectangleBuilder extends ShapeBuilder
    {
        @NotNull
        @Min(value = 1, message = "min value = 1")
        private int length;
        @NotNull
        @Min(value = 1, message = "min value = 1")
        private int width;

        public RectangleBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public RectangleBuilder setWidth(int width) {
            this.width = width;
            return this;
        }
        public Shape build() {
            Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
            Set<ConstraintViolation<RectangleBuilder>> constraintViolations = validator.validate(this);
            StringBuilder exceptions = new StringBuilder("\n");
            for(ConstraintViolation constraintViolation : constraintViolations) {
                String fieldName = constraintViolation.getPropertyPath().toString().toUpperCase();
                exceptions.append(fieldName).append(" ").append(constraintViolation.getMessage()).append("\n");
            }
            if(constraintViolations.size() > 0)throw new IllegalArgumentException(String.valueOf(exceptions));
            return new Rectangle(this);
        }
    }
}
