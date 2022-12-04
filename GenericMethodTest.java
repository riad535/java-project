public class GenericMethodTest
{
    public static <T> void printArray(T[] inputArray)
    {
        for(T element : inputArray)
        {
            System.out.printf("%s ",element);
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Integer[] integerArray = {10,20,30,40,50};
        Double[] doubleArray = {2.5,3.5,4.5,5.5,7.5};
        Character[] characterArray ={'A','B','C','D','E'};

        System.out.printf("Array integerArray contains%n");
        printArray(integerArray);

        System.out.printf("Array doubleArray contains%n");
        printArray(doubleArray);

        System.out.printf("Array characterArray contains%n");
        printArray(characterArray);
    }   
    
}
