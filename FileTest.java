import java.util.Scanner;

public class FileTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 

        while(true)
        {
            System.out.println("Enter 1 or 2\n1-Write File\n2-Read File\n3-Exit\n");
            int a = input.nextInt();

            if(a == 1)
            {
                CreateTextFile createTextFile = new CreateTextFile();
                createTextFile.create();
        

            }
            else if(a == 2)
            {
                ReadTextFile readTextFile = new ReadTextFile();
                readTextFile.read();
            
            }
            else if(a == 3)
            {
                break;
            }
            else
            {
                System.out.println("Your enter is not valid.Please enter 1 or 2\n");
            }

        }

    }
    
}
