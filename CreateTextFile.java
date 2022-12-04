import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class CreateTextFile
{
    private static Formatter output;

    public static void openFile()
    {
        try
        {
            FileWriter fileWriter = new FileWriter("clients.txt",true);
            output = new Formatter(fileWriter);

        }
        catch(SecurityException securityException)
        {
            System.err.println("Write permission denied.Terminating.");
            System.exit(1);
        }
        catch(IOException ioException)
        {
            System.err.println("Error opeing file.Terminating.");
            System.exit(1);
        }
    }

    public static void addRecords()
    {
        Scanner input = new Scanner(System.in);

        System.out.printf("%s%n%s%n","Enter Account number,first name,last name and balance.",
                "Enter end-of-file indicator to end input.");

        while(input.hasNext())
        {
            try
            {
                output.format("%d %s %s %.2f%n",input.nextInt(),input.next(),input.next(),input.nextDouble());
            }

            catch(FormatterClosedException formatterClosedException)
            {
                System.err.println("Error writing to file.Terminating.");
                break;

            }
            catch(NoSuchElementException noSuchElementException)
            {
                System.err.println("Invalid input.please try again");
                input.nextLine();
            }

            System.out.print("?");
        }

    }

    public static void closeFile()
    {
        if(output != null)
        {
            output.close();
        }
    }

    public void create()
    {
        openFile();
        addRecords();
        closeFile();
    }

    
}
