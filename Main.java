package application;
	



import java.awt.BorderLayout;


import javafx.scene.control.TextField;
import java.awt.GraphicsEnvironment;
import java.awt.font.TextAttribute;
import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.CharacterIterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import com.sun.javafx.scene.traversal.WeightedClosestCorner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;


public class Main extends Application {
	
	Button Plik=new Button("Plik");
	Pane root = new Pane();
	Scene scene;
	int plikklik=0;
	int narzedziaklik=0;
	int kolorklik=0;
	MaleOkienka Plikk;
	JFrame ramkaplik;
	JPanel pomocny;
	JButton nowy;
	JButton zapisz;
	JButton zapiszjako;
	JButton drukuj;
	JButton zakoncz;
	JButton ZamknijOkienko;
	
	MaleOkienka narzedziak;
	JFrame ramkanarzedzia;
	JPanel pomocnynarzedzia;	
	JButton zmienczcionke;
	JButton ZamknijOkienkoN;
	JButton rysuj;
	
	
	MaleOkienka kolork;
	JFrame ramkakolor;
	JPanel pomocnykolor;	
	JButton zmienkolor;
	JButton ZamknijOkienkoK;
	
	TextArea miejscenatekst;
	int bz=0;
	int iz=0;
	int uz=0;
	
	public void start(Stage primaryStage) {
		
		
		
			
			scene = new Scene(root,600,600);
			
		    
			
			zarzadzanieplikami();
			
			
			miejscenatekst=new TextArea();
			miejscenatekst.setTranslateY(35);
			miejscenatekst.setMinSize(600,565);
			root.getChildren().add(miejscenatekst);
			
			
			
			//FileChooser fileChooser = new FileChooser();
			//fileChooser.setTitle("Open Resource File");
			//fileChooser.showOpenDialog(primaryStage);
			
			
			
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
		
	}
	
	public void zarzadzanieplikami()
	{
		
		
		
		

		
		Button plik=new Buttons.Plik().tworzplik(root);
	    Button narzedzia=new Buttons.Narzedzia().tworznarzedzia(root);
	    Button kolory=new Buttons.Kolory().tworzkolory(root);
	    Button B=new Buttons.Dodatki().B(root);
	   B.setOnAction(new EventHandler<ActionEvent>() {

		@Override
		public void handle(ActionEvent event) {
		
			String stext=miejscenatekst.getSelectedText();
			miejscenatekst.appendText(stext);
			if(bz==0)
			{
			miejscenatekst.setFont(Font.font("Times new Roman",FontWeight.BOLD,14));
			bz++;
			}
			else
			{
				miejscenatekst.setFont(Font.font("Times new Roman",FontWeight.NORMAL,14));
				bz--;
			}
			
		
			
			
		
			
			//cz�sc
			
			
			
		}
	});
	    
	    Button I=new Buttons.Dodatki().I(root);
	    
	    I.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				if(iz==0)
				{
				miejscenatekst.setFont(Font.font("Times new Roman",FontPosture.ITALIC,14));
				iz++;
				}
				else
				{
					miejscenatekst.setFont(Font.font("Times new Roman",FontWeight.NORMAL,14));
					iz--;
				}
				
				
			}
		});
	    Button U=new Buttons.Dodatki().U(root);
	    
	    U.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
		 
            
				if(uz==0)
				{
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			  uz++;
				}
				else
				{
					scene.getStylesheets().clear();
					uz--;
				}
				
			}
		});
	    
	    
	    
	    
	    
	    B.setTranslateX(450);
	    I.setTranslateX(480);
	    U.setTranslateX(510);
	    akcjerozwiniecielisty(plik,narzedzia,kolory);
		
		
		
		
		
	}
	public void akcjerozwiniecielisty(Button plik,Button narzedzia,Button kolory)
	{
		plik.setOnAction(new EventHandler<ActionEvent>() {		
			public void handle(ActionEvent event) {
				
				if(plikklik==0)
				{
					Plikk=new MaleOkienka();
					Plikk.przyciskiplik();
					ramkaplik=Plikk.przyciskiplik();
					pomocny=new JPanel();		
					nowy=new Buttons.Plik().Nowy(pomocny);
					zapisz=new Buttons.Plik().Zapisz(pomocny);
					zapiszjako=new Buttons.Plik().ZapiszJako(pomocny);
					drukuj=new Buttons.Plik().Drukuj(pomocny);
					zakoncz=new Buttons.Plik().Zakoncz(pomocny);
					ZamknijOkienko=new Buttons.Plik().ZamknijOkienko(pomocny);
				  ramkaplik.add(pomocny,BorderLayout.CENTER);
				  plikklik++;
				ustawakcjeklawiszyplik();
				  ramkaplik.show();
				  ramkaplik.toFront();
				  
				  
	  
				}
				else if(plikklik!=0)
				{
					if(ramkaplik.isVisible()==true)
					{
						ramkaplik.hide();
					}
					else if(ramkaplik.isVisible()==false)
					{
						ramkaplik.show();
						ramkaplik.toFront();
					}
				}
			}
		});
		
		narzedzia.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {

				  if(narzedziaklik==0)
					{
						narzedziak=new MaleOkienka();
						narzedziak.przyciskinarzedzia();
						ramkanarzedzia=narzedziak.przyciskinarzedzia();
						pomocnynarzedzia=new JPanel();	
						zmienczcionke=new Buttons.Narzedzia().Zmienczcionke(pomocnynarzedzia);
						rysuj=new Buttons.Narzedzia().Rysuj(pomocnynarzedzia);
						ZamknijOkienkoN=new Buttons.Narzedzia().ZamknijOkienko(pomocnynarzedzia);
					  ramkanarzedzia.add(pomocnynarzedzia,BorderLayout.CENTER);
					  narzedziaklik++;
					 ustawakcjeklawiszynarzedzia();
					  ramkanarzedzia.show();
	                 ramkanarzedzia.toFront();
					  
		  
					}
				  else if(narzedziaklik!=0)
					{
						if(ramkanarzedzia.isVisible()==true)
						{
							ramkanarzedzia.hide();
						}
						else if(ramkanarzedzia.isVisible()==false)
						{
							ramkanarzedzia.show();
							ramkanarzedzia.toFront();
						}
					}
			}
		});

		kolory.setOnAction(new EventHandler<ActionEvent>() {

			   
			public void handle(ActionEvent event) {
				
				if(kolorklik==0)
				{
					kolork=new MaleOkienka();
					kolork.przyciskikolory();
					ramkakolor=kolork.przyciskikolory();
					pomocnykolor=new JPanel();	
					zmienkolor=new Buttons.Kolory().Zmienkolor(pomocnykolor);
					ZamknijOkienkoK=new Buttons.Kolory().ZamknijOkienkoK(pomocnykolor);
				  ramkakolor.add(pomocnykolor,BorderLayout.CENTER);
				  kolorklik++;
				 ustawakcjeklawiszykolor();
				  ramkakolor.show();
                 ramkakolor.toFront();
                 
	  
				}
				  else if(kolorklik!=0)
					{
						if(ramkakolor.isVisible()==true)
						{
							ramkakolor.hide();
						}
						else if(ramkakolor.isVisible()==false)
						{
							ramkakolor.show();
							ramkakolor.toFront();
						}
					}
			}
		});
		
	}
	
	public void ustawakcjeklawiszyplik()
	{
		 AkcjeKlawiszy f=new AkcjeKlawiszy();
		 f.miejscenatekst=miejscenatekst;
		 f.ramkaplik=ramkaplik;
		 f.nowy(nowy);
		 f.zapisz(zapisz);
		 f.zapiszJako(zapiszjako);
		 f.drukuj(drukuj);
		 f.zakoncz(zakoncz);
		 f.ZamknijOkienko(ZamknijOkienko);
		
		
		 
	
		 
		  
	}
	
	public void ustawakcjeklawiszynarzedzia()
	{
		AkcjeKlawiszy n=new AkcjeKlawiszy();
		n.miejscenatekst=miejscenatekst;
		n.ramkanarzedzia=ramkanarzedzia;
		n.ZamknijOkienkoN(ZamknijOkienkoN);
		n.zmienczcionke(zmienczcionke);
		n.rysuj(rysuj);
		
	}
	public void ustawakcjeklawiszykolor()
	{
		AkcjeKlawiszy k=new AkcjeKlawiszy();
		k.ramkakolory=ramkakolor;
		k.ZamknijOkienkoK(ZamknijOkienkoK);
		k.zmienkolor(zmienkolor);
	}
	
	
	
	

	//dodac wszystkie funkcje z pierwszego
	
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}




//koncze na tym
