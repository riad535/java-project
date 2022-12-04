import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest
{

    public static void main(String[] args)
    {
        String[] colors = {"MAGANTA","RED","BLUE","WHITE","CYAN"};

        List<String> list = new ArrayList<String> ();

        for(String color : colors)
        {
            list.add(color);
        }

        String[] removeColors = {"RED","WHITE","BLUE"};
        List<String>removeList = new ArrayList<String>();

        for(String color : removeColors)
        {
            removeList.add(color);
        }

        System.out.println("Array List: ");

        for(int count = 0;count <list.size();count++)
        {
            System.out.printf("%s ",list.get(count));
        }

        removeColors(list, removeList);

        System.out.println("%nArray List after calling removes Colors%n");

        for(String color :list)
        {
            System.out.printf("%s ",color);
        }
    }

    private static void removeColors(Collection<String> collection1,Collection<String>collection2)
    {
        Iterator<String> iterator = collection1.iterator();

        while(iterator.hasNext())
        {
            if(collection2.contains(iterator.next()))
                iterator.remove();
        }

    }
}

    

    
