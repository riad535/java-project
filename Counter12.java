import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.*;
import java.lang.Runnable;
import java.nio.file.attribute.GroupPrincipal;

public class Counter12 extends JFrame
{
    private JPanel contentPane;
    private JTextField textField;
    private int count = 0;

    public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable()
        {
            public  void run ()
            {
                try{
                    Counter12 frame = new Counter12();
                    frame.setVisible(true);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
            
    }

    public Counter12()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        contentPane.setLayout(new BorderLayout(0,0));
        contentPane.setLayout(null);

        JLabel lblCounter = new JLabel("Counter");
        lblCounter.setBounds(10,24,69,14);
        contentPane.add(lblCounter);

        JRadioButton rdbUp = new JRadioButton("UP");
        rdbUp.setBounds(6,73,109,23);
        contentPane.add(rdbUp);

        JRadioButton rdbDown = new JRadioButton("Down");
        rdbDown.setBounds(6,73,109,23);
        contentPane.add(rdbDown);

        ButtonGroup group = new ButtonGroup();
        group.add(rdbUp);
        group.add(rdbDown);

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(313,58,54,20);
        contentPane.add(comboBox);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(80,21,86,20);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblStep = new JLabel("Step");
        lblStep.setBounds(257,61,46,14);
        contentPane.add(lblStep);
        contentPane.add(comboBox);
        comboBox.addItem("1");
        comboBox.addItem("2");
        comboBox.addItem("3");
        comboBox.addItem("4");
        comboBox.addItem("5");
        comboBox.addItem("6");

        JButton btnCount = new JButton("Count");
        btnCount.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                int count =0;
                if(rdbUp.isSelected()&&comboBox.getSelectedItem().equals("1"))
                {
                    count += 1;
                    textField.setText(count+"");

                }

                if(rdbUp.isSelected()&&comboBox.getSelectedItem().equals("2"))
                {
                    count += 2;
                    textField.setText(count+"");

                }

                if(rdbUp.isSelected()&&comboBox.getSelectedItem().equals("3"))
                {
                    count += 3;
                    textField.setText(count+"");

                }

                if(rdbUp.isSelected()&&comboBox.getSelectedItem().equals("4"))
                {
                    count += 4;
                    textField.setText(count+"");

                }

                if(rdbUp.isSelected()&&comboBox.getSelectedItem().equals("5"))
                {
                    count += 5;
                    textField.setText(count+"");

                }

                if(rdbUp.isSelected()&&comboBox.getSelectedItem().equals("6"))
                {
                    count += 6;
                    textField.setText(count+"");

                }

                if(rdbDown.isSelected())
                {
                    --count;
                    textField.setText(count+"");
                }
            }

        });

        btnCount.setBounds(257,114,89,23);
        contentPane.add(btnCount);


    }

    
}
 