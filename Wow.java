import java.awt.Color;
import java.util.Scanner;

import javax.swing.JFrame;

public class Wow
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter 1 or 2\n1-TASBIH COUNTER\n2-WOW");

            int var = input.nextInt();

            if(var == 1)
            {
                GUI gui = new GUI();
                gui.tasbi();
                break;
            }

            else if(var == 2)
            {
                Draw_Wow wow = new Draw_Wow();

                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(wow);
                frame.setSize(240,300);
                frame.setTitle("Wow Face");
                frame.setLocationRelativeTo(null);

                wow.setBackground(Color.WHITE);
                frame.setVisible(true);
                break;

            }

            else
            {
                System.out.println("Your inpur is not valid! Please try again.");
            }
        }

    }
    
}
