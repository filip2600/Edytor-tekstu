package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AkcjeKlawiszy {

	public JButton nowy(JButton nowy)
	{
		
nowy.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent e) {
		
		System.out.println("tworzy");
	}
});
return nowy;
	
	}
}
