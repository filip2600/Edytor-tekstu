package application;


import javax.swing.JButton;
import javax.swing.JPanel;

import javafx.scene.control.Button;
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
   public JButton Zapisz(JPanel pomocny)
   {
	   JButton Zapiszjb=new JButton("Zapisz");
	   pomocny.add(Zapiszjb);
	   return Zapiszjb;
	   
   }
   public JButton ZapiszJako(JPanel pomocny)
   {
	   JButton ZapiszJako=new JButton("ZapiszJako");
	   pomocny.add(ZapiszJako);
	   return ZapiszJako;
	   
   }
   public JButton Drukuj(JPanel pomocny)
   {
	   JButton Drukujjb=new JButton("Drukuj");
	   pomocny.add(Drukujjb);
	   return Drukujjb;
	   
   }
   public JButton Zakoncz(JPanel pomocny)
   {
	   JButton Zakonczjb=new JButton("Zakoncz");
	   pomocny.add(Zakonczjb);
	   return Zakonczjb;
	   
   }
   
   
   
   
   
   
   
   
   
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
   
   public JButton Zmienczcionke(JPanel pomocny)
   {
	   JButton zczcionka=new JButton("Zmien czcionke");
	   pomocny.add(zczcionka);
	   return zczcionka;
	   
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
   
   public JButton Zmienkolor(JPanel pomocny)
   {
	   JButton zkolor=new JButton("Zmien kolor");
	   pomocny.add(zkolor);
	   return zkolor;
	   
   }
   
   
   
   
   
   
   
   }
	
}



// nie warto budowac klawiszy w  ten sposob.





//dodac pozycje na 2 tab? ewentualnie x,y