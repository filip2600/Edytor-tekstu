package application;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;


public class Buttons {
	
   
	public static class Plik
	{
   public Button tworzplik(Pane root)
   {
	   Button plik =new Button("Plik");
	   root.getChildren().add(plik);
	   return plik;

   }
   public JButton Nowy(JPanel pomocny)
   {
	   JButton nowyjb=new JButton("Nowy");
	   pomocny.add(nowyjb);
	   return nowyjb;
	   
   }
  // public Button Nowy(Pane root)
   
   
   
   
   
   
   
   
   
	}
   public static class Narzedzia
   {
   public Button tworznarzedzia(Pane root)
   {
	   Button narzedzia=new Button("Narzedzia");
	   root.getChildren().add(narzedzia);
	   narzedzia.setTranslateX(37);
	   return narzedzia;
   }
   }
   
   
   
   
   
   
   public static class Kolory
   {
   public Button tworzkolory(Pane root)
   {
	   Button kolory=new Button("Kolory");
	   root.getChildren().add(kolory);
	   kolory.setTranslateX(107);
	   return kolory;
   }
   
   
   
   
   
   
   
   }
	
}



// nie warto budowac klawiszy w  ten sposob.





//dodac pozycje na 2 tab? ewentualnie x,y