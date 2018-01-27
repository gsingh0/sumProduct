import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class sumProduct extends JPanel {
	
	private JTextField txt, txt2;
	private JLabel label, label2, sumLabel, sumLabel2, productLabel, productLabel2;
	private JButton button;
	
	sumProduct()
	{
	txt = new JTextField(10);
	txt2 = new JTextField(10);
	label = new JLabel("Enter first number here ");
	label2 = new JLabel("Enter second number here ");
	sumLabel = new JLabel("The sum: ");
	sumLabel2 = new JLabel("---");
	productLabel = new JLabel("The product: ");
	productLabel2 = new JLabel("---");
	button = new JButton("Calculate");
	
	calculate listener = new calculate();
	txt.addActionListener(listener);
    txt2.addActionListener(listener);
    button.addActionListener(listener);
    
    add(label);
    add(txt);
    add(label2);
    add(txt2);
    add(button);
    add(sumLabel);
    add(sumLabel);
    add(sumLabel2);
    add(productLabel);
    add(productLabel2);
    
    setBackground(Color.cyan);
    setPreferredSize(new Dimension(300,100));
    
	
	

	
	
	}
	
	private class calculate implements ActionListener
	{

		
		public void actionPerformed(ActionEvent event) 
		{
			int num;
			int num2;
			
			String text = txt.getText();
			String text2 = txt2.getText();
			
			num = Integer.parseInt(text);
			num2 = Integer.parseInt(text2);
			
		    sumLabel2.setText(Integer.toString(num + num2));
		    productLabel2.setText(Integer.toString(num * num2));
			
		}
		
	}
	

}
