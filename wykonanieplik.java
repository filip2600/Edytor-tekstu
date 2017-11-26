package application;

import java.io.BufferedWriter;



import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

import javafx.scene.control.TextArea;

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
		          new FileOutputStream("filename.txt"), "utf-8"));
	  writer.write(miejscenatekst.getText());
		} catch (IOException ex) {
		  // report
		} finally {
		   try {writer.close();} catch (Exception ex) {/*ignore*/}
		}
	}
	
	void zapisjak(TextArea miejscenatekst)
	{
		JFrame ramka=new JFrame();
		ramka.setSize(300,300);
		ramka.setVisible(false);
      	final	JFileChooser  fc = new JFileChooser();
         	fc.showOpenDialog(ramka);
         	
      	fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
      	String x=fc.getCurrentDirectory().toString();
      	System.out.println(x);
      	
      	
      	//zapisz tam gdzie x
    	Writer writer = null;

		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream(x+"filename.txt"), "utf-8"));
	  writer.write(miejscenatekst.getText());
		} catch (IOException ex) {
		  // report
		} finally {
		   try {writer.close();} catch (Exception ex) {/*ignore*/}
		}
      
		
	}
	
}
	


