import java.util.AbstractCollection;

import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest
{
    private static void printList(List<String> list)
    {
        System.out.printf("%nlist:%n");

        for(String color :list)
        {
            System.out.printf("%s ",color);
        }

        System.out.println();
    }
    
    private static void convertToUppercaseString(List<String> list)
    {
        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext())
        {
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    private static void removeItems(List<String> list,int start,int end)
    {
        list.subList(start, end).clear();
    }

    private static void printReversedList(List<String> list)
    {
        ListIterator<String> iterator = list.listIterator(list.size());

        System.out.printf("%nReverse List:%n");

        while(iterator.hasPrevious())
        {
            System.out.printf("%s ",iterator.previous());
        }
    }

    public static void main(String[] args)
    {
        String[] colors = {"black","yellow","blue","green","violet","silver"};

        List<String> list1 = new LinkedList<>();
    }
}
