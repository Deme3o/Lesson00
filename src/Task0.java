import java.lang.reflect.Array;
import java.util.*;
public class Task0
{
    private static int[] myArray;
    private static int myArraySize = 0;
    private static int sumOfValues = 0;
    public static void main(String args[])
    {
        fillArray();
        //bubbleSorting();
    }

    private static void fillArray()
    {
        System.out.print("Input the length of the array (number 1-10):");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println("You entered string "+s);
        if(!isNumber(s))
        {
            fillArray();
        }
        else
        {
            myArraySize = Integer.parseInt(s);
            if(myArraySize<0)
                myArraySize=-myArraySize;
            else if(myArraySize==0)
                myArraySize=1;
            if(myArraySize>10)
            {
                System.out.println("Array length must be (1-10) and will be reduced to 10!");
            }
            System.out.println("My array size is " + myArraySize);

            myArray = new int[myArraySize];
            int lowest = 0;
            int highest = 10;
            for(int i = 0; i<myArraySize-1;i++)
            {
                myArray[i]=lowest+(int)(Math.random()*highest);
                sumOfValues+=myArray[i];
            }
            System.out.println(Arrays.toString(myArray));
            int[] myNewArray = Arrays.copyOf(myArray,myArray.length);
            Arrays.sort(myNewArray);
            System.out.println("Minimal value is: "+myNewArray[0]);
            System.out.println("Maximal value is: "+myNewArray[myNewArray.length-1]);
            System.out.println("Average value is: "+(double)sumOfValues/myArraySize);


        }
    }

    private static boolean isNumber(String sInput)
    {
        boolean flag = true;
        for (char ch: sInput.toCharArray())
        {
            System.out.println("Symbol is: "+ch+", code is: "+(int)ch);
            if((int)ch<48||(int)ch>57)
            {
                flag = false;
                break;
            }
        }
        return flag;
    }

}
