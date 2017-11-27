package application;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;



public class wykonanieplik {
	
	
	void nowy(TextArea miejscenatekst)
	{
		miejscenatekst.clear();
		
	
	}
	
	
	void zapisz(TextArea miejscenatekst)
	{
		Writer writer = null;

		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream("C:\\Users\\filip\\Desktop\\testowy\\filename.txt"), "utf-8"));
	  writer.write(miejscenatekst.getText());
		} catch (IOException ex) {
		  // report
		} finally {
		   try {writer.close();} catch (Exception ex) {/*ignore*/}
		}
	}
	
	void zapisjakwstep(TextArea miejscenatekst)
	{
		
		JFrame miejscenat=new JFrame("Podaj nazwe pliku !");
		miejscenat.setLayout(new BorderLayout());
		JTextField podajnazwe=new JTextField();
		JButton ok=new JButton("OK");
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pokazfilechooser(podajnazwe.getText().toString(), miejscenatekst);
				miejscenat.dispose();
				
			}
		});
		miejscenat.add(podajnazwe,BorderLayout.CENTER);
		miejscenat.add(ok,BorderLayout.EAST);
		miejscenat.setSize(250,65);
		miejscenat.move(500,250);
		miejscenat.show();
		
		

	}
	
	void pokazfilechooser(String nazwapliku,TextArea miejscenatekst)
	{	
		JFileChooser f = new JFileChooser();
    f.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
    f.showSaveDialog(null);
  		String s=f.getSelectedFile().toString();
  		Writer writer = null;

		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream(s+"\\"+nazwapliku+".txt"), "utf-8"));
	  writer.write(miejscenatekst.getText());
		} catch (IOException ex) {
		
		} finally {
		   try {writer.close();} catch (Exception ex) {/*ignore*/}
		}
		
	}
	
	
	
	
	
	
	
}
	


