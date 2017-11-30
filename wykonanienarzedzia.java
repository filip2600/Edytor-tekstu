package application;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.MouseInfo;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingUtilities;

public class wykonanienarzedzia extends JPanel {

	int obecnyx;
	int obecnyy;
	int i=0;
	int czykoniecklik=0;
	ArrayList<Integer> listax=new ArrayList<Integer>();
	ArrayList <Integer> listay=new ArrayList<Integer>();
	
	
	public void zmienczcionke (TextArea miejscenatekst)
	{
		JFrame ramkawybor=new JFrame();
		JButton zatwierz=new JButton("OK");
		JTextField ustawczcionke=new JTextField("Podaj rozmiar czcionki");
		kliknietyustawczcionke(ustawczcionke);
		JComboBox<String> pojstyle=new JComboBox<>();
		
		String fonts[] = 
			      GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

			    for ( int i = 0; i < fonts.length; i++ )
			    {
			      System.out.println(fonts[i]);
			      pojstyle.addItem(fonts[i]);
			    }
		System.out.println(pojstyle.getSelectedItem().toString());
			    
		zatwierz.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				klikOK(ustawczcionke,miejscenatekst,pojstyle.getSelectedItem().toString());
				
			}
		});
		
		
		ramkawybor.add(ustawczcionke,BorderLayout.NORTH);
		ramkawybor.add(pojstyle,BorderLayout.SOUTH);
		
		ramkawybor.add(zatwierz,BorderLayout.CENTER);
		ramkawybor.setSize(150, 120);
		ramkawybor.move(500, 150);
		
		ramkawybor.show();
  		
	}
	
	void rysuj()
	{
		
		obecnyx=0;
		obecnyy=0;
		JFrame ramka=new JFrame();
		ramka.add(this);
		ramka.setSize(450,450);	
	
		
		
		this.addMouseListener(new MouseAdapter() {
			
			public void mouseReleased(MouseEvent e)
			{
				System.out.println("x");
				wlaczruch();
				
				
				
				
				//musi dziedziczyc jFrame by wyszlo malowanie 
			}
			});
		
		
		
		
		
		
		
		
	
		
		
		
		ramka.show();
	}
	public void paint(Graphics g) {
	    super.paint(g);
	     
	     g.fillRect(obecnyx, obecnyy, 10, 20);
	     //po kliknieciu sie zaczyna 
	
	}
	
	void wlaczruch()
	{
		czykoniecklik++;
		
		

		
	if(czykoniecklik<2)
	{
		this.addMouseMotionListener(new MouseAdapter() {
			
			public void mouseMoved(MouseEvent e)
			{
				
				obecnyx=(int) MouseInfo.getPointerInfo().getLocation().getX();
				obecnyy=(int) MouseInfo.getPointerInfo().getLocation().getY();
			repaint();
				System.out.println(obecnyx);
				
				
				
				
				
				//musi dziedziczyc jFrame by wyszlo malowanie 
			}
			});
	}
		
		if(czykoniecklik==2)
		{
			//https://stackoverflow.com/questions/9172607/how-do-i-unregister-mouse-listener-of-jpanel
			MouseMotionListener[] mouseListeners = this.getMouseMotionListeners();
			for (MouseMotionListener mouseListener : mouseListeners) {
			   this.removeMouseMotionListener(mouseListener);
			}
			
		}
			
	}
	
	
	
	
	
	
	
	
	
	
	void kliknietyustawczcionke(JTextField wpis)
	{
		wpis.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e)
			{
				if(wpis.getText().contains("Podaj"))
				{
				wpis.setText("");
				}
			}
		});

	}
	void klikOK(JTextField ustawczcionke,TextArea miejscenatekst,String styl)
	{
		if(isNumeric(ustawczcionke.getText())==true)
		{
			miejscenatekst.setFont(Font.font(styl,Integer.parseInt(ustawczcionke.getText())));
		}
		
		
		
		
	}
	public boolean isNumeric(String s) {  
	    return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
	}  
	
	
	
	
}






//zrobic to za pomoca pixeli pojedynczych
//lub 
//nie dosiega na gore frame przy rysowaniu
