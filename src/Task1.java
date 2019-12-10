import java.util.*;

public class Task1
{
    public static void main(String args[])
    {
        bubbleSorting();
    }
    private static void bubbleSorting()
    {
        int[] myArr = new int[6];
        for(int i=0; i<=myArr.length-1; i++)
        {
            myArr[i]=(int)(Math.random()*10);
        }

        System.out.println("Initial state: "+Arrays.toString(myArr));
        int swap = 0;
        int flag = 0;

        for(int j=0;j<=myArr.length-1;j++)
        {

            for (int i = 0; i < myArr.length - 1; i++) {
                if (myArr[i] > myArr[i + 1])
                {
                    swap = myArr[i];
                    myArr[i] = myArr[i + 1];
                    myArr[i + 1] = swap;
                    System.out.println("j = "+j+", i = "+i+", array = "+Arrays.toString(myArr));
                }

            }
        }
        System.out.println("Final result:"+Arrays.toString(myArr));

    }
}
