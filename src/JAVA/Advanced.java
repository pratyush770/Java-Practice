package JAVA;
//Collection Framework
import java.util.*;
public class Advanced
{
    public static void main(String[] args)
    {
        //ArrayList in Java

        ArrayList<Integer> l1 = new ArrayList<>(); // generic (passing data type into the parameter helps to understand
                                                   // the type of ArrayList we are creating)
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(1);  // add method is used to add elements in the ArrayList
        l1.add(2);
        l1.add(3);
        l1.add(0,4);  // adds 4 to the 0 index i.e. first index
        l2.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l1.addAll(l2); // adds the elements of l2 to l1. It will add elements at the end of the list.
        //l1.addAll(0,l2);  // adds the elements from beginning of the list
        //l1.clear(); // clears all the contents of the ArrayList
        //System.out.println(l1.contains(10));  // returns true or false
        //l1.remove(4);  // removes the element according to the specified index
        l1.set(4,10);  // updates the element at the specified index
        for(int i = 0 ;i<l1.size();i++)   // size() is used for getting the size of the integer
        {
            System.out.print(l1.get(i));  // get() is used to get all the elements of the ArrayList
            System.out.print(", ");
        }
    }
}
