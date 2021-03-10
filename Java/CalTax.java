import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalTax extends JFrame implements ActionListener
{
    Container container = getContentPane();

    String items[] = { "Smart Phone - 15,000$", "Smart TV - 48,000$", "Monitor - 6,800$", "Laptop - 67,500$" };

    JComboBox itemsList;

    JLabel itemsLabel = new JLabel("Items List : ");
    JLabel text1 = new JLabel("Price    : ");
    JLabel text2 = new JLabel("Tax (%) : ");
    JLabel text3 = new JLabel("Result  : ");

    JTextField priceField  = new JTextField(10);
    JTextField taxField    = new JTextField(10);
    JTextField resultField = new JTextField(10);

    JButton calculate = new JButton("Calculate");

    public CalTax()
    {
        //Use to manage Rows and Colums
        GridBagConstraints constraints = new GridBagConstraints();

        JLabel header = new JLabel("Tax Calculator");

        container.setLayout(new GridBagLayout());

        itemsList = new JComboBox(items);

        header.setFont(new Font("Tahoma", Font.BOLD, 26));

        /*
            gridx = Colums
            gridy = Rows
            gridwidth = Merges Colums
            gridheight = Merges Rows
        */

        constraints.gridwidth = 2;

        constraints.gridx = 0;
        constraints.gridy = 0;
        container.add(header, constraints);

        constraints.gridwidth = 1;

        constraints.gridx = 0;
        constraints.gridy = 1;
        container.add(itemsLabel, constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        container.add(itemsList, constraints);

        //Space between items
        constraints.insets = new Insets(5, 5, 0, 0);

        constraints.gridx = 0;
        constraints.gridy = 2;
        container.add(text1, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 2;
        priceField.setEditable(false);
        container.add(priceField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        container.add(text2, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 3;
        container.add(taxField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        container.add(text3, constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 4;
        resultField.setEditable(false);
        container.add(resultField, constraints);

        constraints.gridwidth = 2;

        constraints.gridx = 0;
        constraints.gridy = 5;
        container.add(calculate, constraints);

        itemsList.addActionListener(this);
        calculate.addActionListener(this);

        super.setSize(500, 280);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == calculate)
        {
            if (!taxField.getText().equals(""))
            {
                double prices = Double.parseDouble(priceField.getText());
                double tax = Double.parseDouble(taxField.getText());

                tax /= 100;

                String result = String.valueOf(prices * tax);

                resultField.setText(result);
            }
        }
        else if (e.getSource() == itemsList)
        {
            if (itemsList.getSelectedIndex() == 0) //Smart Phone
            {
                priceField.setText("15000");
            }
            else if (itemsList.getSelectedIndex() == 1) //Smart TV
            {
                priceField.setText("48000");
            }
            else if (itemsList.getSelectedIndex() == 2) //Monitor
            {
                priceField.setText("6800");
            }
            else if (itemsList.getSelectedIndex() == 3) //Laptop
            {
                priceField.setText("67500");
            }
        }
    }

    public static void main(String[] args) 
    {
        new CalTax();
    }
}