import javax.swing.JFrame;


public class sumProductClient {
	public static void main(String [] args)
	{
	   JFrame frame = new JFrame("sumProduct");
	   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   sumProduct panel = new sumProduct();
	   
	   frame.getContentPane().add(panel);
	   
	   frame.pack();
	   frame.setVisible(true);
	   
	}
}
