public class Variant3 {
    static int intTask(int size)//size - к-сть в байтах
    {
        return size / 1024; // к-сть в килобайтах
    }
    static boolean booleanTask(int a)
    {
        return a % 2 == 0;
    }
    static int ifTask(int a)
    {
        if(a > 0)
        {
            return a+1;
        }
        else if(a < 0)
        {
            return a - 2;
        }
        return 10;
    }
    static String caseTask(int n)
    {
        switch (n)
        {
            case 1: return "January";
            case 2: return "February";
            case 3: return "March";
            case 4: return "April";
            case 5: return "May";
            case 6: return "June";
            case 7: return "July";
            case 8: return "August";
            case 9: return "September";
            case 10: return "October";
            case 11: return "November";
            case 12: return "December";
        }
        return "dont found";
    }
    static int[] forTask(int a, int b)
    {
        int res[] = new int[b-a-1];
        int j = 0;
        for(int i = b-1; i > a; i--)
        {
            res[j] = i;
            j++;
        }
        return res;
    }
    static int[] whileTask(int n, int k)
    {
        int num = 0;
        while (n >= k) {
            n -= k;
            ++num;
        }
        return new int[]{num,n};
    }
    static int[] arrayTask(int n,int a,int d)
    {
        int res[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            res[i] = a+i*d;
        }
        return res;
    }
    static int[][] matrixTask(int m,int n, int arrM[])
    {
        int res[][] = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                res[i][j] = arrM[j];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("intTask:");
        System.out.println(intTask(2048));
        System.out.println("booleanTask:");
        System.out.println(booleanTask(2));
        System.out.println("ifTask:");
        System.out.println(ifTask(-2));
        System.out.println("caseTask:");
        System.out.println(caseTask(12));
        System.out.println("forTask:");
        int forTask[] = forTask(1,5);
        for(int i : forTask)
        {
            System.out.println(i);
        }
        System.out.println("whileTask:");
        int whileTask[] = whileTask(53,5);
        System.out.println(whileTask[0] + " " + whileTask[1]);
        System.out.println("arrayTask:");
        int arrayTask[] = arrayTask(10,1,3);
        for(int i : arrayTask)
        {
            System.out.println(i);
        }
        System.out.println("matrixTask:");
        int matrixTask[][] = matrixTask(4,4,new int[]{1,2,3,4});
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                System.out.print(matrixTask[i][j] + " ");
            }
            System.out.println();
        }
    }
}
