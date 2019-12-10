import java.util.*;

public class Task2
{
    public static void main(String args[])
    {
        boolean flag = false;
        List <Integer> myList = new ArrayList<>();
        for(int i = 100; i>=2; i--)
        {
            flag = false;
            for(int j=2; j<i; j++)
            {
                System.out.println("i = "+i+", j = "+j+", i%j = "+(i%j));
                if((i%j)==0)
                {
                    flag = true;
                    break;
                }
            }
            if(flag)
            {
                flag = false;

            }
            else
            {
                System.out.println("Looks like "+i+" is simple ");
                myList.add(i);
            }

        }

       System.out.println(Arrays.toString(myList.toArray()));

    }
}
