/*import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;

public class CreditInquiry
{
    private final static MenuOption[] choices = MenuOption.values();

    private static MenuOption  getRequest()
    {
        int request = 4;

        System.out.printf("%nEnter request%n%s%n%s%n%s%n%s%n",
            "1- List account with zero Balance",
            "2- List account with credit balance",
            "3- List account with debit balances",
            "4- Terminate program");

            try
            {
                Scanner input = new Scanner(System.in);

                do
                {
                    System.out.printf("%n? ");
                    request = input.nextInt();

                }while((request < 1)||(request > 4));

            }
            catch (NoSuchElementException noSuchElementException)
            {
                System.out.println("Invalid input.Terminating.");
            }
            return choices[request-1];
    }
    
    private static void readRecords(MenuOption accountType)
    {
        try(Scanner input = new Scanner(Paths.get("clients.txt")))
        {
            while(input.hasNext())
            {
                int accountNumberb=input.nextInt();
                String firstName = input.next();
                String lastName = input.next();
                double balance = input.nextDouble();

                if(shouldDisplay (accountType,balance))
                {
                    System.out.printf("")
                }
            }
        }
    }
}*/
