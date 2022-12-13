public class Variant3 {
    //Integer3*. Дан размер файла в байтах.Используя операцию деления нацело, найти количество полных килобайтов,
    //которые занимает данный файл (1 килобайт = 1024 байта).
    static int intTask(int size)//size - к-сть в байтах
    {
        return size / 1024; // к-сть в килобайтах
    }
    /*Boolean3. Дано целое число A. Проверить истинность высказывания: «Число A является четным».*/
    static boolean booleanTask(int a)
    {
        return a % 2 == 0;
    }
    /*If3. Дано целое число.
    Если оно является положительным, то прибавить к нему 1;
    если отрицательным, то вычесть из него 2;
    если нулевым, то заменить его на 10.
    Вывести полученное число.*/
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
    /*Case3. Дан номер месяца — целое число в диапазоне 1–12
    (1 — январь, 2 — февраль и т. д.).
    Вывести название соответствующего времени года («зима», «весна», «лето», «осень»).*/
    static String caseTask(int n)
    {
        switch (n)
        {
            case 1: return "Зима";
            case 2: return "Зима";
            case 3: return "Весна";
            case 4: return "Весна";
            case 5: return "Весна";
            case 6: return "Літо";
            case 7: return "Літо";
            case 8: return "Літо";
            case 9: return "Осінь";
            case 10: return "Осінь";
            case 11: return "Осінь";
            case 12: return "Зима";
        }
        return "not found";
    }
    /*For3. Даны два целых числа A и B (A < B).
    Вывести в порядке убывания все целые числа,
    расположенные между A и B (не включая числа A и B), а также количество N этих чисел.*/
    static int[] forTask(int a, int b)
    {
        int res[] = new int[b-a];
        int j = 0;
        for(int i = b-1; i > a; i--)
        {
            res[j] = i;
            j++;
        }
        res[j] = j;
        return res;
    }
    /*While3. Даны целые положительные числа N и K.
    Используя только операции сложения и вычитания,
    найти частное от деления нацело N на K, а также остаток от этого деления.*/
    static int[] whileTask(int n, int k)
    {
        int num = 0;
        while (n >= k) {
            n -= k;
            ++num;
        }
        return new int[]{num,n};
    }

    /*Array3. Дано целое число N (> 1),
    а также первый член A и разность D арифметической прогрессии.
    Сформировать и вывести массив размера N, содержащий N первых членов данной прогрессии:
    A,A + D,A + 2·D,A + 3·D,… .*/
    static int[] arrayTask(int n,int a,int d)
    {
        int res[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            res[i] = a+i*d;
        }
        return res;
    }
    /*Matrix3. Даны целые положительные числа M, N и набор из M чисел.
    Сформировать матрицу размера M ґ N, у которой в каждом столбце содержатся все числа из исходного набора (в том же порядке).*/
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
