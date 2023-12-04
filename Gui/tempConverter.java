package a;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class gui8 extends JFrame implements ActionListener{
	
	private JTextField celciusTextField;
	private JTextField farenheitTextField;
	gui8(){
		setTitle("Temperature converted");
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		// Create and add components
		JLabel celsiusLable = new JLabel("Celcius");
		celciusTextField = new JTextField();
		JLabel fahrenheit = new JLabel("Farenheit");
		farenheitTextField = new JTextField();
		farenheitTextField.setEditable(false);
		JButton convertButton = new JButton("convert");
		
		convertButton.addActionListener(this);
		panel.add(celsiusLable);
		panel.add(celciusTextField);
		panel.add(fahrenheit);
		panel.add(farenheitTextField);
		panel.add(new JLabel());
		panel.add(convertButton);
		
		add(panel);
	}
	public static void main(String []args) {
		gui8 converter = new gui8();
		converter.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e) {
		double celsius = Double.parseDouble(celciusTextField.getText());
		Double fahrenheit = (celsius*9/5)+32;
		farenheitTextField.setText(String.format("%.2f",fahrenheit));
	}
}
