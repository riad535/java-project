import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GUI  implements ActionListener
{

    int count = 0;
    private JLabel label,label1;
    private JButton button,button1,button2,button3;
    public void tasbi()
    {
        JFrame frame = new JFrame();

        JButton button = new JButton("COUNT");
        JButton button1 = new JButton("RESET");
        JButton button2 = new JButton("Yes");
        JButton button3 = new JButton("No");
        button.addActionListener(this);
        //button1.addWindowListener(this);
        //addWindowListener(this);

         label = new JLabel("Total Numbers: 0");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100,100,30,100));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(button1);
        panel.add(label);

       

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("TASBIH COUNTER");
        frame.pack();
        frame.setVisible(true);


        button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {

                //Reset reset = new Reset();
                JFrame frame1 = new JFrame();
                label1= new JLabel("Do You Want to Reset");

                JPanel panel1 = new JPanel();
                panel.setBorder(BorderFactory.createEmptyBorder(100,100,30,100));
                panel.setLayout(new GridLayout(0, 1));
                panel.add(button2);
                panel.add(button3);
                panel.add(label1);

            

                frame1.add(panel,BorderLayout.CENTER);
                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame1.setTitle("TASBIH COUNTER");
                frame1.pack();
                frame1.setVisible(true);

                button2.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        count = 0;
                        label.setText("Total Count: "+count);
                        
                    }
                });

                button3.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        count = count;
                        label.setText("Total Count: "+count);
                    
                    }
                });
            }
            
        });
    
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        count++;
        label.setText("Total Count: " + count);
        
    }

    




    
}
