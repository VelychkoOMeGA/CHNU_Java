import java.util.Objects;

/**
 * The type Shape.
 */
abstract public class Shape
{
    /**
     * The Shape id.
     */
    protected final int shapeId;
    /**
     * The Shape name.
     */
    protected final String shapeName;

    /**
     * Gets shape id.
     *
     * @return the shape id
     */
    public int getShapeId() {
        return shapeId;
    }

    /**
     * Gets shape name.
     *
     * @return the shape name
     */
    public String getShapeName() {
        return shapeName;
    }

    /**
     * Instantiates a new Shape.
     *
     * @param sb the sb
     */
    public Shape(ShapeBuilder sb)
    {
        this.shapeId = sb.shapeId;
        this.shapeName = sb.shapeName;
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

    /**
     * The type Shape builder.
     */
    static abstract class ShapeBuilder//передає данні в конструктор Shape
    {
        /**
         * The Shape id.
         */
        protected int shapeId;
        /**
         * The Shape name.
         */
        protected String shapeName;

        /**
         * Sets shape id.
         *
         * @param shapeId the shape id
         * @return the shape id
         */
        public ShapeBuilder setShapeId(int shapeId) {
            this.shapeId = shapeId;
            return this;
        }

        /**
         * Sets shape name.
         *
         * @param shapeName the shape name
         * @return the shape name
         */
        public ShapeBuilder setShapeName(String shapeName) {
            this.shapeName = shapeName;
            return this;
        }

        /**
         * Instantiates a new Shape builder.
         */
        ShapeBuilder(){};

        /**
         * Build shape.
         *
         * @return the shape
         */
        abstract public Shape build();//абстрактний метод build
    }
}
