public class Demo {
    public static void main(String[] args) {
        Rectangle.RectangleBuilder rb1 = new Rectangle.RectangleBuilder();
        Rectangle.RectangleBuilder rb2 = new Rectangle.RectangleBuilder();
        Circle.CircleBuilder cb = new Circle.CircleBuilder();

        rb1.setShapeId(1);
        rb1.setShapeName("Rectangle");
        rb1.setLength(1);
        rb1.setWidth(1);

        rb2.setShapeId(3);
        rb2.setShapeName("Box");
        rb2.setLength(20);
        rb2.setWidth(40);

        cb.setShapeId(2);
        cb.setShapeName("Circle");
        cb.setRadius(1);

        Shape r1 = rb1.build();
        Shape r2 = rb2.build();
        Shape c1 = cb.build();
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(c1);
    }
}
