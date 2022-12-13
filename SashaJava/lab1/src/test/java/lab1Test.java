import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Objects;

import static org.testng.Assert.assertEquals;
public class lab1Test
{
    @Test(dataProvider = "equalShape")
    public void equalShapeTest(Shape obj1,Shape obj2,boolean res)
    {
        assertEquals(Objects.equals(obj1,obj2),res);
    }
    @DataProvider
    public Object[][] equalShape()
    {
        Rectangle.RectangleBuilder rb1 = new Rectangle.RectangleBuilder();
        Rectangle.RectangleBuilder rb2 = new Rectangle.RectangleBuilder();
        rb1.setShapeId(1);
        rb1.setShapeName("Rectangle");
        rb1.setLength(10);
        rb1.setWidth(20);
        rb2.setShapeId(3);
        rb2.setShapeName("Rectangle");
        rb2.setLength(20);
        rb2.setWidth(40);

        Circle.CircleBuilder cb = new Circle.CircleBuilder();
        cb.setShapeId(2);
        cb.setShapeName("Circle");
        cb.setRadius(10);

        Shape r1 = rb1.build();
        Shape r2 = rb2.build();
        Shape c1 = cb.build();
        return new Object[][]{{r1,r1,true},{r2,r1,false},{c1,c1,true},{c1,r1,false}};
    }

    @Test(dataProvider = "hashEqualShapes")
    public void hashEqualShapesTest(Shape obj1,Shape obj2)
    {
        assertEquals(obj1.hashCode(),obj2.hashCode());
    }
    @DataProvider
    public Object[][] hashEqualShapes()
    {
        Rectangle.RectangleBuilder rb1 = new Rectangle.RectangleBuilder();
        rb1.setShapeId(1);
        rb1.setShapeName("Rectangle");
        rb1.setLength(10);
        rb1.setWidth(20);
        Circle.CircleBuilder cb = new Circle.CircleBuilder();
        cb.setShapeId(2);
        cb.setShapeName("Circle");
        cb.setRadius(10);
        Shape r1 = rb1.build();
        Shape c1 = cb.build();
        return new Object[][]{{r1,r1},{c1,c1}};
    }
}
