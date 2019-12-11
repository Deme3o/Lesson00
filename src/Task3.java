import javax.swing.plaf.basic.BasicListUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3
{
    private static Integer[] myArr = {1,7,5,8,7,3,12,0,3,4,4,0,0,1,0,7};

    public static void main(String args[])
    {

        int num = 7;
        System.out.println("Array before deletion is: "+Arrays.toString(myArr)+", symbol to be deletes is: "+num);
        List<Integer> aList = new ArrayList<>(Arrays.asList(myArr));
        aList.removeAll(Arrays.asList(num));
        myArr = aList.toArray(new Integer[aList.size()]);
        //System.out.println(aList);

        //int myInd = -1;

        //moveArray(num);
        /*
        while(true)
        {
            myInd = aList.lastIndexOf(7);
            System.out.println("Debug myInd = "+myInd);
            if(myInd!=-1)
            {
                aList.remove(myInd);
                counter++;
            }
            else
                break;
        }*/


        System.out.println("Array after deletion is : "+Arrays.toString(myArr)+", symbol "+num+" was deleted.");
    }

}
