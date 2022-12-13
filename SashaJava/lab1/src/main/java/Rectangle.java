import java.util.Objects;

/**
 * The type Rectangle.
 */
public class Rectangle extends Shape{
    private final int length;
    private final int width;

    /**
     * Instantiates a new Rectangle.
     *
     * @param rb the rb
     */
    public Rectangle(RectangleBuilder rb)
    {
        super(rb);//передає білдер в батьківський клас
        this.length = rb.length;
        this.width = rb.width;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", shapeId=" + shapeId +
                ", shapeName='" + shapeName + '\'' +
                '}';
    }

    /**
     * Gets length.
     *
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
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

    /**
     * The type Rectangle builder.
     */
    final static public class RectangleBuilder extends ShapeBuilder
    {
        private int length;
        private int width;

        /**
         * Sets length.
         *
         * @param length the length
         * @return the length
         */
        public RectangleBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        /**
         * Sets width.
         *
         * @param width the width
         * @return the width
         */
        public RectangleBuilder setWidth(int width) {
            this.width = width;
            return this;
        }
        public Shape build() {
            return new Rectangle(this);
        }
    }
}
