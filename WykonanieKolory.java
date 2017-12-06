package application;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

 class WykonanieKolory extends JPanel {

	
	public void ustaw()
	{
		
		JFrame ramkakolory=new JFrame();
		 BoxLayout boxLayout = new BoxLayout(ramkakolory.getContentPane(), BoxLayout.Y_AXIS);
		ramkakolory.setLayout(boxLayout);
		
		JButton czerwony =new JButton("");
		Dimension d=new Dimension(200,70);
		czerwony.setMaximumSize(d);
		czerwony.setBackground(Color.red);
		JButton niebieski =new JButton();
		niebieski.setMaximumSize(d);
		niebieski.setBackground(Color.blue);
		JButton zolty =new JButton();
		zolty.setMaximumSize(d);
		zolty.setBackground(Color.yellow);
		JButton zielony =new JButton();
		zielony.setMaximumSize(d);
		zielony.setBackground(Color.green);
		
		ramkakolory.add(czerwony);
		ramkakolory.add(niebieski);
		ramkakolory.add(zolty);
		ramkakolory.add(zielony);
		wykonanienarzedzia w=new wykonanienarzedzia();
		dodajakcje(czerwony,niebieski,zolty,zielony,w);
		
		
		ramkakolory.setSize(250,250);
		ramkakolory.show();
		
        
		
		//na numerki w funcji paint
		//pozniej zajac sie scieraniem
	}
	void dodajakcje(JButton c,JButton n,JButton zo,JButton zi,wykonanienarzedzia w)
	{
	   
		c.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				w.czerwony=1;
				w.zolty=0;
				w.zielony=0;
				w.niebieski=0;
				ArrayList<Integer> listaxt=new ArrayList<Integer>();
				ArrayList <Integer> listayt=new ArrayList<Integer>();
		
			 
		  
				
			}
		});
		n.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				w.niebieski=1;
				w.czerwony=0;
				w.zolty=0;
				w.zielony=0;
				
				
			}
		});
		
		zo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			   w.zolty=1;
			   w.niebieski=0;
				w.czerwony=0;
				w.zielony=0;
				
			}
		});
		
		zi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				w.zielony=1;
				w.niebieski=0;
				w.czerwony=0;
				w.zolty=0;
				
			}
		});
		
	}
	
	
	//pomyslec o repaincie jak wywolac
	//po zmianie koloru nowy array
	
}
