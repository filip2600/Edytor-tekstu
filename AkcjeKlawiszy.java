package application;

import java.awt.event.ActionEvent;
import javafx.event.*;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AkcjeKlawiszy {
	int plikklik;
	JFrame ramkaplik;
	JFrame ramkanarzedzia;
	JFrame ramkakolory;
	JButton f;

TextArea miejscenatekst;
public Button x(Button f)
{
	return f;
}

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
		zapisj.zapisjakwstep(miejscenatekst);
		
	}
});
return zapiszjakoJB;
	
	}
	
	
	public JButton drukuj(JButton drukujJB)
	{	
drukujJB.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		wykonanieplik druk=new wykonanieplik();
		druk.drukuj(miejscenatekst);
		
	}
});
return  drukujJB;
	
	}
	
	public JButton zakoncz(JButton zakonczJB)
	{	
zakonczJB.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		wykonanieplik wylacz=new wykonanieplik();
		wylacz.zakoncz();
		
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
		
		wykonanienarzedzia zmianaczcionki=new wykonanienarzedzia();
		zmianaczcionki.zmienczcionke(miejscenatekst);
		
	}
});
return  zmienczcionkeJB;
	
	}
	
	public JButton rysuj(JButton rysujJB)
	{	
rysujJB.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e)
	{
		
		wykonanienarzedzia rysuj=new wykonanienarzedzia();
		rysuj.rysuj();
		
		
	}
});
return  rysujJB;
	
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
		WykonanieKolory wk=new WykonanieKolory();
		wk.ustaw();
		
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
