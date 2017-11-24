package application;
	


import java.awt.BorderLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;

public class Main extends Application {
	
	Button Plik=new Button("Plik");
	Pane root = new Pane();
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
	
	MaleOkienka narzedziak;
	JFrame ramkanarzedzia;
	JPanel pomocnynarzedzia;	
	JButton zmienczcionke;
	
	
	MaleOkienka kolork;
	JFrame ramkakolor;
	JPanel pomocnykolor;	
	JButton zmienkolor;
	
	
	
	public void start(Stage primaryStage) {
		
		
		
			
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		   
			
			zarzadzanieplikami();
			
			
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
		
	}
	
	public void zarzadzanieplikami()
	{
		
		Button plik=new Buttons.Plik().tworzplik(root);
	    Button narzedzia=new Buttons.Narzedzia().tworznarzedzia(root);
	    Button kolory=new Buttons.Kolory().tworzkolory(root);
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
				  ramkaplik.add(pomocny,BorderLayout.CENTER);
				 // ustawakcjeklawiszy();
				  ramkaplik.show();
				  ramkaplik.toFront();
				  plikklik=2;
				  
	  
				}
				else if(plikklik==2)
				  {
				
					  ramkaplik.hide();
					  System.out.println("hide"+plikklik);
					  plikklik--;
				  }
				  else if(plikklik==1)
				  {     System.out.println("show"+plikklik);
					  ramkaplik.show();
					  ramkaplik.toFront();
					  
					  plikklik++;
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
					  ramkanarzedzia.add(pomocnynarzedzia,BorderLayout.CENTER);
					 // ustawakcjeklawiszy();
					  ramkanarzedzia.show();
	                 ramkanarzedzia.toFront();
					  narzedziaklik=2;
		  
					}
					else if(narzedziaklik==2)
					  {
					
						  ramkanarzedzia.hide();
						 
						  narzedziaklik--;
					  }
					  else if(narzedziaklik==1)
					  {
						  ramkanarzedzia.show();
						  ramkanarzedzia.toFront();
						  narzedziaklik++;
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
				  ramkakolor.add(pomocnykolor,BorderLayout.CENTER);
				 // ustawakcjeklawiszy();
				  ramkakolor.show();
                 ramkakolor.toFront();
                 kolorklik=2;
	  
				}
				else if(kolorklik==2)
				  {
				
					ramkakolor.hide();
					 
					
					  kolorklik--;
				  }
				  else if(kolorklik==1)
				  {
					  ramkakolor.show();
					  ramkakolor.toFront();
					  kolorklik++;
				  }
			}
		});
		
	}
	
	public void ustawakcjeklawiszy()
	{
		 //AkcjeKlawiszy f=new AkcjeKlawiszy();
		 // f.nowy(nowy);
		  
	}
	
	
	
	
	//stworzyc pustke akcje na wszystkie
	//stworzyc dzialajace na trzy z pliku
	
	public static void main(String[] args) {
		launch(args);
	}
}
