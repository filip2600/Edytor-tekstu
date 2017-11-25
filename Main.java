package application;
	


import java.awt.BorderLayout;
import javafx.scene.control.TextField;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

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
	JButton ZamknijOkienko;
	
	MaleOkienka narzedziak;
	JFrame ramkanarzedzia;
	JPanel pomocnynarzedzia;	
	JButton zmienczcionke;
	
	
	MaleOkienka kolork;
	JFrame ramkakolor;
	JPanel pomocnykolor;	
	JButton zmienkolor;
	
	TextArea miejscenatekst;
	
	public void start(Stage primaryStage) {
		
		
		
			
			Scene scene = new Scene(root,600,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		 
			
			zarzadzanieplikami();
			
			
			miejscenatekst=new TextArea();
			miejscenatekst.setTranslateY(35);
			miejscenatekst.setMinSize(600,565);
			root.getChildren().add(miejscenatekst);
			
			//FileChooser fileChooser = new FileChooser();
			//fileChooser.setTitle("Open Resource File");
			//fileChooser.showOpenDialog(primaryStage);
			//skorzystac z tego
			
			
			
			
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
					ZamknijOkienko=new Buttons.Plik().ZamknijOkienko(pomocny);
				  ramkaplik.add(pomocny,BorderLayout.CENTER);
				  plikklik++;
				ustawakcjeklawiszy();
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
					  ramkanarzedzia.add(pomocnynarzedzia,BorderLayout.CENTER);
					  narzedziaklik++;
					  ustawakcjeklawiszy();
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
				  ramkakolor.add(pomocnykolor,BorderLayout.CENTER);
				  kolorklik++;
				 ustawakcjeklawiszy();
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
	
	public void ustawakcjeklawiszy()
	{
		 AkcjeKlawiszy f=new AkcjeKlawiszy();
		 f.miejscenatekst=miejscenatekst;
		 f.plikklik=plikklik;
		 f.ramkaplik=ramkaplik;
		 f.nowy(nowy);
		 f.ZamknijOkienko(ZamknijOkienko);
	
		 
		  
	}
	
	
	
	
	

	// naprawic blad
	//stworzyc caly plik
	// popatrzec na stary projekt w qt.
	
	//jako zwykly button dodac zamknij w kazdej z tabel
	
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
