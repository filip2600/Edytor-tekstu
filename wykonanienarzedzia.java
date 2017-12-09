package application;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import java.util.ArrayList;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.MouseInfo;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import javafx.scene.control.TextArea;

import javafx.scene.text.Font;




public class wykonanienarzedzia extends JPanel {

	static int czerwony=0;
	static int zmianaczer=0;
	static int niebieski=0;
static	int zolty=0;
static 	int zielony=0;


	int petlawhile=0;
	int obecnyx;
	int obecnyy;
	int i=0;
	int x=2;
	int scieranie=0;
	int nrobrazka=0;
JFrame ramka;
JFrame dodatki;
	
	int czykoniecklik=0;
	ArrayList<Integer> listax=new ArrayList<Integer>();//czarny
	ArrayList <Integer> listay=new ArrayList<Integer>();
	
	ArrayList<Integer> listaxc=new ArrayList<Integer>();//czerw
	ArrayList <Integer> listayc=new ArrayList<Integer>();
	
	ArrayList<Integer> listaxn=new ArrayList<Integer>();//nieb
	ArrayList <Integer> listayn=new ArrayList<Integer>();
	
	
	ArrayList<Integer> listaxzo=new ArrayList<Integer>();//zolty
	ArrayList <Integer> listayzo=new ArrayList<Integer>();
	
	ArrayList<Integer> listaxzi=new ArrayList<Integer>();//zielony
	ArrayList <Integer> listayzi=new ArrayList<Integer>();
	

	
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
			     
			      pojstyle.addItem(fonts[i]);
			    }
		
			    
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
		ramka.addWindowListener(new WindowAdapter()
		{
		    public void windowClosing(WindowEvent e)
		    {
		     dodatki.dispose();
		    }
		});
		
		
		dodatki=new JFrame();
		dodatki.setSize(560,80);
		dodatki.move((ramka.getX())/2,ramka.getY()+420);
		
		dodatki.show();
		
		wlaczruch();
		scieraj(dodatki);
		this.setBackground(Color.white);
		ramka.add(this);
		ramka.setSize(450,450);	
	
	
		

		
	

		ramka.show();
	}
	 //@@ 
 public void paint(Graphics g) {
		
	 
	 if(czerwony==0&&zielony==0&&niebieski==0&&zolty==0)
	 {
	 // super.paintComponent(g);
		 
		 int c=x;
		 if(scieranie==1)
		 {
			
			 for(int i=0;i<listax.size();i++)
			   {
				 for(int j=0;j<10;j++)
				 {
				 if(listay.get(i)+(j*x/2)==obecnyy-15&&listax.get(i)+(j*x/2)==obecnyx)
				 {				
					 listax.remove(i);
					 listay.remove(i);
					 
					 c=x;
					 while(c>2)
					 {
						 listax.remove(i+c);
						 listay.remove(i+c);
						 c--;
					 }
					 }
					 
				 
				 if(listay.get(i)-(j*x/2)==obecnyy-15&&listax.get(i)-(j*x/2)==obecnyx)
				 {				 
					 listax.remove(i);
					 listay.remove(i);
					 
					 c=x;
					 while(c>2)
					 {
						 listax.remove(i+c);
						 listay.remove(i+c);
						 c--;
					 }
					 				 
				 }
				 }
				 
			   }
			 //moze jakas funkcja na to ?
			 
		 }
		
		 
		 if(scieranie==0)
		 {
		 
	    listax.add(obecnyx);
	    listay.add(obecnyy);
		 }
		 
	 
	//   g.drawRect(obecnyx, obecnyy-15, 2 ,2);	   
	  
	    
	    
	    
	    
	 }
	 
	 
		  if(czerwony==1)
		  {

			  
	    		//super.paintComponent(g);
				  //maluje to komponenty  
				    listaxc.add(obecnyx);
				    listayc.add(obecnyy);
				 
				   
				   //jak kliknie sie czerwony to zaczyna liczyc x i y
				 //  g.drawRect(obecnyx, obecnyy-15, 2 ,2);	
				//   ustawienia.setPaint(Color.BLACK);
				
		  }
		  else if(niebieski==1)
		  {
			 listaxn.add(obecnyx);
			 listayn.add(obecnyy);
		  }
		  else if(zolty==1)
		  {
			  listaxzo.add(obecnyx);
				 listayzo.add(obecnyy);
			 
		 
		  }
		  else if(zielony==1)
		  {
			  
			  listaxzi.add(obecnyx);
				 listayzi.add(obecnyy);
		  }
		  
		  
		  
			super.paintComponent(g);
			
			  for(int i=0;i<listax.size();i++)
			   {
				 g.setColor(Color.black);
				   g.drawRect(listax.get(i), listay.get(i)-15, 2, 2);
				   g.fillRect(listax.get(i), listay.get(i)-15, 2, 2);
			   }
			   
			  //maluje to komponenty  
			   for(int i=0;i<listaxc.size();i++)
			   {
				   g.setColor(Color.red);
				
				   g.drawRect(listaxc.get(i), listayc.get(i)-15, 2, 2);
				   g.fillRect(listaxc.get(i), listayc.get(i)-15, 2, 2);
				  
			   }
			   
			   for(int i=0;i<listaxn.size();i++)
			   {
				   g.setColor(Color.blue);
				
				   g.drawRect(listaxn.get(i), listayn.get(i)-15, 2, 2);
				   g.fillRect(listaxn.get(i), listayn.get(i)-15, 2, 2);
				  
			   }
			   for(int i=0;i<listaxzo.size();i++)
			   {
				   g.setColor(Color.yellow);
				
				   g.drawRect(listaxzo.get(i), listayzo.get(i)-15, 2, 2);
				   g.fillRect(listaxzo.get(i), listayzo.get(i)-15, 2, 2);
				  
			   }
			   for(int i=0;i<listaxzi.size();i++)
			   {
				   g.setColor(Color.green);
				
				   g.drawRect(listaxzi.get(i), listayzi.get(i)-15, 2, 2);
				   g.fillRect(listaxzi.get(i), listayzi.get(i)-15, 2, 2);
				  
			   }
			   
			   
			   
			   
			   
			   
		  
		  
			 
		
		
		
	    //Dodac scieraj calosc lecz do kolory 
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
	
	void scieraj(JFrame dodatki)
	{
		JButton scierajcale=new JButton("Scieraj caly");
		JButton gumka=new JButton("Gumka");
		JButton powiekszgumke=new JButton("gumka +");
		JButton zmniejszgumke=new JButton("gumka -");
		JButton screen=new JButton("Screen");
		JButton olowek=new JButton("Olowek");
		JPanel klawisze=new JPanel();
		klawisze.add(gumka);
		klawisze.add(scierajcale);
		klawisze.add(powiekszgumke);
		klawisze.add(zmniejszgumke);
		klawisze.add(screen);
		klawisze.add(olowek);
		dodatki.add(klawisze,BorderLayout.WEST);
		scierajcale.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				listax.clear();
				listay.clear();
				listaxc.clear();
				listayc.clear();
				listaxn.clear();
				listayn.clear();
				listaxzo.clear();
				listayzo.clear();
				listaxzi.clear();
				listayzi.clear();
				obecnyy=99999;
				repaint();
			}
		});
		
		
		
	
	gumka.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			scieranie=1;
			
			
		}
	});
	
		
		powiekszgumke.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				x++;
			}
		});
		
		zmniejszgumke.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				x--;
				
			}
		});
		
		screen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				BufferedImage img = new BufferedImage(ramka.getWidth(),ramka.getHeight(), BufferedImage.TYPE_INT_RGB);
				ramka.paint(img.getGraphics());
				while(petlawhile==0)
				{
				File wyjsciowy=new File("Rysunek"+nrobrazka+".png");
				if(!wyjsciowy.exists() && !wyjsciowy.isDirectory())
				{
				
				try {
					ImageIO.write(img,"png", wyjsciowy);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			}
				
				else
				{
					nrobrazka++;
				}
				}
			}
		});
		
		olowek.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				scieranie=0;
				
			}
		});
		
		
		
		
		
		
	}
	
	


}
	

	




// b i u
//zapis obrazu


