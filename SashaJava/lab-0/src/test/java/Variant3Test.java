import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Variant3Test {
    @Test(dataProvider = "integerProvider")
    public void integerProviderTest(int n,int res)
    {
        assertEquals(new Variant3().intTask(n), res);
    }
    @DataProvider
    public Object[][] integerProvider()
    {
        return new Object[][] {{2048,2},{1024,1},{4096,4}};
    }

    @Test(dataProvider = "booleanProvider")
    public void booleanProviderTest(int n, boolean res)
    {
        assertEquals(new Variant3().booleanTask(n),res);
    }
    @DataProvider
    public Object[][] booleanProvider()
    {
        return new Object[][]{{2,true},{3,false},{10,true}};
    }
    @Test(dataProvider = "ifProvider")
    public void ifProviderTest(int n,int res)
    {
        assertEquals(new Variant3().ifTask(n),res);
    }
    @DataProvider
    public Object[][] ifProvider()
    {
        return new Object[][]{{2,3},{-2,-4},{10,11}};
    }
    @Test(dataProvider = "caseProvider")
    public void caseProviderTest(int n, String res)
    {
        assertEquals(new Variant3().caseTask(n),res);
    }
    @DataProvider
    public Object[][] caseProvider()
    {
        return new Object[][]{{12,"Зима"},{1,"Зима"},{10,"Осінь"}};
    }
    @Test(dataProvider = "forProvider")
    public void forProviderTest(int a,int b, int[] res)
    {
        assertEquals(new Variant3().forTask(a,b),res);
    }
    @DataProvider
    public Object[][] forProvider()
    {
        return new Object[][]{{1,5,new int[]{4,3,2,3}},{1,10,new int[]{9,8,7,6,5,4,3,2,8}}};
    }
    @Test(dataProvider = "whileProvider")
    public void whileProviderTest(int a, int b, int[] res)
    {
        assertEquals(new Variant3().whileTask(a,b),res);
    }
    @DataProvider
    public Object[][] whileProvider()
    {
        return new Object[][]{{53,5,new int[]{10,3}}, {100,10,new int[]{10,0}}};
    }
    @Test(dataProvider = "arrayProvider")
    public void arrayProviderTest(int n,int a, int d, int[]res)
    {
        assertEquals(new Variant3().arrayTask(n,a,d),res);
    }
    @DataProvider
    public Object[][] arrayProvider()
    {
        return new Object[][]{{10,1,1,new int[]{1,2,3,4,5,6,7,8,9,10}},{5,2,1,new int[]{2,3,4,5,6}}};
    }
    @Test(dataProvider = "matrixProvider")
    public void matrixProviderTest(int n,int m,int[] arrM, int[][] res)
    {
        assertEquals(new Variant3().matrixTask(m,n,arrM),res);
    }
    @DataProvider
    public Object[][] matrixProvider()
    {
        return new Object[][]{{4,4,new int[]{1,2,3,4},new int[][]{{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}}}};
    }
}
