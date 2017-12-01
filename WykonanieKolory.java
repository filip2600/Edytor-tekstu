package application;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

 class WykonanieKolory {

	
	public void ustaw()
	{
		
		JFrame ramkakolory=new JFrame();
		JButton czerwony =new JButton();
		czerwony.setBackground(Color.RED);
		JButton niebieski =new JButton();
		czerwony.setBackground(Color.blue);
		JButton zolty =new JButton();
		czerwony.setBackground(Color.yellow);
		JButton zielony =new JButton();
		czerwony.setBackground(Color.green);
		ramkakolory.add(czerwony);
		ramkakolory.add(niebieski);
		ramkakolory.add(zolty);	
		ramkakolory.add(zielony);
		
		ramkakolory.setSize(250,250);
		ramkakolory.show();
		
	}
}
