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


public class Reset
{
    private int count = 0;
    private JLabel label1;
    public void yesOrNo()
    {
        JLabel label1 = new JLabel();
        JFrame frame1 = new JFrame();
        JButton button2 = new JButton("Yes");
        JButton button3 = new JButton("No");

        label1= new JLabel("Do You Want to Reset");

        JPanel panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createEmptyBorder(100,100,30,100));
        panel1.setLayout(new GridLayout(0, 1));
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(label1);

    

        frame1.add(panel1,BorderLayout.CENTER);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setTitle("TASBIH COUNTER");
        frame1.pack();
        frame1.setVisible(true);

        button2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                count = 0;
                //label1.setText("Total Count: "+count);
                return ;
            }
        });

        button3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                count = count;
                //label1.setText("Total Count: "+count);
                return ;
            }
        });
    }
    
}
