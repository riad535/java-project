import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadSequentialFile
{
    private static ObjectInputStream input;

    public static void openFile()
    {
        try
        {
            input = new ObjectInputStream(
                Files.newInputStream(Paths.get("clients.ser")));
        }
        catch(IOException ioException)
        {
            System.out.println("Error opening file.");
            System.exit(1);
        }
    }

    public static void readRecords()
    {
        System.out.printf("%-10s%-12s%-12s%10s%n","Account","First Name","Last Name","Balance");
        

        try
        {
            while(true)
            {
                Accounts record = (Accounts) input.readObject();

                System.out.printf("%-10s%-12s%-12s%10.2f%n",record.getAccount(),record.getFirstName(),
                            record.getLastName(),record.getBalance());
            }
        }

        catch(EOFException end0EofException)
        {
            System.out.printf("%n No more records%n");
        }

        catch(ClassNotFoundException classNotFoundException)
        {
            System.out.println("Invalid object type.Terminating");
        }

        catch(IOException ioException)
        {
            System.err.println("Error reading from file.Terminating");
        }

    }

    public static void closeFile()
    {
        try
        {
            if(input != null)
            {
                input.close();
            }
        }

        catch(IOException ioException)
        {
            System.out.println("Error closing file.Terminating.");
            System.exit(1);
        }
    }

    public static void main(String[] args)
    {
        openFile();
        readRecords();
        closeFile();
    }
   
}
