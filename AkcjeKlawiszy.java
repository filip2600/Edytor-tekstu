package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javafx.scene.control.TextArea;

public class AkcjeKlawiszy {
	int plikklik;
	JFrame ramkaplik;
TextArea miejscenatekst;
	public JButton nowy(JButton nowyJB)
	{	
nowyJB.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		wykonanieplik a=new wykonanieplik();
		a.nowy(miejscenatekst);
		
	}
});
return nowyJB;
	
	}
	public JButton zapisz(JButton zapiszJB)
	{	
zapiszJB.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
});
return zapiszJB;
	
	}
	
	
	public JButton zapiszJako(JButton zapiszjakoJB)
	{	
zapiszjakoJB.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
});
return zapiszjakoJB;
	
	}
	
	
	public JButton drukuj(JButton drukujJB)
	{	
drukujJB.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
});
return  drukujJB;
	
	}
	
	public JButton zakoncz(JButton zakonczJB)
	{	
zakonczJB.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
});
return  zakonczJB;
	
	}
	public JButton ZamknijOkienko(JButton zamknijokienkoJB)
	{	
		
   zamknijokienkoJB.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{   
			ramkaplik.hide();	
	}
});
return  zamknijokienkoJB;
	
	}
	//TERAZ DOTYCZACE NARZEDZI
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	
	public JButton zmienczcionke(JButton zmienczcionkeJB)
	{	
zmienczcionkeJB.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
});
return  zmienczcionkeJB;
	
	}
	
	//TERAZ DOTYCZACE KOLOROW
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	public JButton zmienkolor(JButton zmienkolorJB)
	{	
zmienkolorJB.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
});
return  zmienkolorJB;
	
	}
	
	
}
