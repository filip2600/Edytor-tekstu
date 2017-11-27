package application;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import javafx.scene.control.TextArea;

public class wykonanienarzedzia {

	public void zmienczcionke (TextArea miejscenatekst)
	{
		String wstepnyfont="Arial";
		JFrame ramkawybor=new JFrame();
		JButton zatwierz=new JButton("OK");
		JTextField ustawczcionke=new JTextField("Podaj rozmiar czcionki");
		kliknietyustawczcionke(ustawczcionke);
		Font ustawionaczcionka=new Font(wstepnyfont,12, 12);
		miejscenatekst.setFont(ustawczcionke);
		ramkawybor.add(ustawczcionke,BorderLayout.NORTH);
		ramkawybor.add(zatwierz,BorderLayout.EAST);
		ramkawybor.setSize(150, 220);
		ramkawybor.move(500, 150);
		ramkawybor.show();
  		
	}
	void kliknietyustawczcionke(JTextField wpis)
	{
		wpis.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e)
			{
				if(wpis.getText().contains("Podaj"))
				{
				wpis.setText("");
				}
			}
		});

			
			
		
	}
}



//Tworze okienko gdzie sa 2 opcje opcja wielkosci czcionki
//i opcja stylu
//klikniety ustawczcionke to odrazu kasuje tekst
// dodaje jeszcze b i u po prawo
