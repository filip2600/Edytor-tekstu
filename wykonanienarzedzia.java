package application;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import java.util.ArrayList;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import java.awt.MouseInfo;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import javafx.scene.control.TextArea;

import javafx.scene.text.Font;




public class wykonanienarzedzia extends JPanel {

	int obecnyx;
	int obecnyy;
	int i=0;
	int scieranie=0;
JFrame ramka;
	
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
	
	
	
	
	
	void rysuj()
	{
		
		obecnyx=0;
		obecnyy=0;
		ramka=new JFrame();
		ramka.add(this);
		ramka.setSize(450,450);	
		this.setBackground(Color.white);
	
		

		
	wlaczruch();
	scieraj();

		ramka.show();
	}
	 //@@ 
	public void paint(Graphics g) {
		
		  
	    super.paint(g);
	    listax.add(obecnyx);
	    listay.add(obecnyy);
	   for(int i=0;i<listax.size();i++)
	   {
		   g.drawRect(listax.get(i), listay.get(i)-15, 2, 2);
		   g.fillRect(listax.get(i), listay.get(i)-15, 2, 2);
	   }
	   g.drawRect(obecnyx, obecnyy-15, 2 ,2);	   
	  
	    
	    
	    System.out.println("niby");
	     
	
	}
	
	  
	//@@
	void wlaczruch()
	{
		
		this.addMouseMotionListener(new MouseAdapter() {
			
			public void mouseDragged(MouseEvent e)
			{
				
				obecnyx=(int) MouseInfo.getPointerInfo().getLocation().getX();
				obecnyy=(int) MouseInfo.getPointerInfo().getLocation().getY();
			repaint();
				
				
				
				
				
				
				//musi dziedziczyc jFrame by wyszlo malowanie 
			}
			});
		
	}
	//@@ 
	void ruchzakonczony()
	{
	MouseMotionListener[] x=	this.getMouseMotionListeners();
	for (MouseMotionListener mouseListener : x) {
	    this.removeMouseMotionListener(mouseListener);
	}
	}
	
	void scieraj()
	{
		JButton scierajcale=new JButton("Scieraj cale");
		JButton scierajczesc=new JButton("Scieraj ");
		this.add(scierajcale);
		this.add(scierajczesc);
		
		scierajcale.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				listax.clear();
				listay.clear();
				obecnyy=99999;
				repaint();
			}
		});
		
		scierajczesc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Scieraj");
				scieranie=1;
			
				
				
				
			}
		});
		
		
		
	}
	
	
	

	
}



//wprowadzic gumke
// b i u
//zaczac kolory
//zastanowic sie na scieraniem
