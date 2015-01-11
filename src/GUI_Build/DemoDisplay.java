package GUI_Build;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.util.Scanner;

public class DemoDisplay extends JFrame implements ActionListener 
{
	JButton on;
	JPanel content;
	JLabel message;
	
	
	
	public DemoDisplay()
	{
		content = new JPanel();
		on = new JButton("Show");
		on.addActionListener(this);
		on.setActionCommand("veiw");
		message = new JLabel("    ");
		content.add(on);
		content.add(message);
		add(content);
		setSize(100,100);
		setVisible(true);
	}
	public static void main(String[]args)
	{
		new DemoDisplay();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String what = e.getActionCommand();
		if(what.equals("veiw"))
		{
			on.setText("Hide");
			on.setActionCommand("hide");
			message.setText("2994");
		}
		else if (what.equalsIgnoreCase("hide"))
		{
			on.setText("Show");
			on.setActionCommand("veiw");
			message.setText("    ");
		}
	}

}
