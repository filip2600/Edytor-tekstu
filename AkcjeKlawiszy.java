package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AkcjeKlawiszy {
	int plikklik;
	JFrame ramkaplik;
	JFrame ramkanarzedzia;
	JFrame ramkakolory;
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
		wykonanieplik zapis=new wykonanieplik();
		zapis.zapisz(miejscenatekst);
		
	}
});
return zapiszJB;
	
	}
	
	
	public JButton zapiszJako(JButton zapiszjakoJB)
	{	
zapiszjakoJB.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		wykonanieplik zapisj=new wykonanieplik();
		zapisj.zapisjak(miejscenatekst);
		
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
	
	
	public JButton ZamknijOkienkoN(JButton zamknijokienkoNJB)
	{	
		
   zamknijokienkoNJB.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{   
		System.out.println("abc");
			ramkanarzedzia.hide();	
	}
});
return  zamknijokienkoNJB;
	
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
	public JButton ZamknijOkienkoK(JButton zamknijokienkoKJB)
	{	
		
   zamknijokienkoKJB.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{   
		System.out.println("abc");
			ramkakolory.hide();	
	}
});
return  zamknijokienkoKJB;
	
	}
	
	
	
}
