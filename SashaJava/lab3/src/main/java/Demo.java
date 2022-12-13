import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Rectangle.RectangleBuilder rb1 = new Rectangle.RectangleBuilder();
        Rectangle.RectangleBuilder rb2 = new Rectangle.RectangleBuilder();
        Circle.CircleBuilder cb = new Circle.CircleBuilder();

        rb1.setShapeId(1);
        rb1.setShapeName("Rectangle");
        rb1.setLength(10);
        rb1.setWidth(20);

        rb2.setShapeId(3);
        rb2.setShapeName("Box");
        rb2.setLength(20);
        rb2.setWidth(40);

        cb.setShapeId(2);
        cb.setShapeName("Circle");
        cb.setRadius(10);

        Shape r1 = rb1.build();
        Shape r2 = rb2.build();
        Shape c1 = cb.build();


        System.out.println("Comperable Treeset");
        TreeSet<Shape> treeSet = new TreeSet<>();
        treeSet.add(r1);
        treeSet.add(r2);
        treeSet.add(c1);
        for(Shape s : treeSet)
        {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("Comparator");
        List<Shape> list1 = new ArrayList<>();
        list1.add(r1);
        list1.add(r2);
        list1.add(c1);
        Collections.sort(list1, new ShapeComparator());
        for(Shape s : list1)
        {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("Stream API comparator");
        List<Shape> list2 = new ArrayList<>();
        list2.add(r1);
        list2.add(r2);
        list2.add(c1);
        list2 = list2.stream().sorted(Comparator.comparing(Shape::getType)).collect(Collectors.toList());
        for(Shape s : list2)
        {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("getRectangles");
        ShapeService shapeService = new ShapeService(list2);
        for(Shape s : shapeService.getRectangles())
        {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("getCircles");
        for(Shape s : shapeService.getCircles())
        {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("getShapeByName");
        for(Shape s : shapeService.getShapeByName("Box"))
        {
            System.out.println(s);
        }
        System.out.println();
    }
}
