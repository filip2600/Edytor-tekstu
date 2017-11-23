package application;
	


import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

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
			 System.out.println("Rozwin liste 1");
			MaleOkienka plik=new MaleOkienka();
			plik.przyciskiplik();
			JFrame ramkaplik=plik.przyciskiplik();
			JPanel pomocny=new JPanel();		
			JButton nowy=new Buttons.Plik().Nowy(pomocny);
		  ramkaplik.add(pomocny,BorderLayout.CENTER);
			
			
			//nowy.setText("abc");
			
			
			//f=plik.przyciskiplik();
			
			
			 
			 //tworzy nowe oknko z jakims layoutem
			 // ponowne klik =zamkniecie
			//Wstepny plan:w  maleokienko  dowoluje sie do buttons tworzac tam klawisze 
			//musze zrobic tak by klawisze pojawily sie tutaj w main .
			//gdy zakoncze ten problem to wrzuta na git
			 
			}
		});
		
		narzedzia.setOnAction(new EventHandler<ActionEvent>() {

		   
			public void handle(ActionEvent event) {
				 System.out.println("l2");
			}
		});
		
		
		kolory.setOnAction(new EventHandler<ActionEvent>() {

			   
			public void handle(ActionEvent event) {
				 System.out.println("l3");
			}
		});
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
