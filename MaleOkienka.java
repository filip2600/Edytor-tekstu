package application;

import java.awt.BorderLayout;




import javax.swing.JFrame;
import javax.swing.JRootPane;






public class MaleOkienka  {


	public JFrame  przyciskiplik()
	{
		JFrame panel=new JFrame();
		panel.setLayout(new BorderLayout());
	
		
		
	
		
		panel.setUndecorated(true);
		panel.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		
		
		
		panel.setSize(100,250);
		panel.move(970,305);
		
		return panel;
		
		
		
		// Jak to dodac?
		 // musi mi jakos zwrocic ta ramke do pliku main
       //dodac przycisk close
		
		
	}
	public JFrame  przyciskinarzedzia()
	{
		JFrame panel=new JFrame();
		panel.setLayout(new BorderLayout());
		
		
		
	
		
		panel.setUndecorated(true);
		panel.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		
		
		
		panel.setSize(100,250);
		panel.move(1015,305);
		
		return panel;
		
	}
	
	
	public JFrame  przyciskikolory()
	{
		JFrame panel=new JFrame();
		panel.setLayout(new BorderLayout());
		
		
		
	
		
		panel.setUndecorated(true);
		panel.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		
		
		
		panel.setSize(100,250);
		panel.move(1060,305);
		
		return panel;
		
	}
	
	
	
	
	
}
