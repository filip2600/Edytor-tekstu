package application;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import javafx.scene.control.TextArea;

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
	
	
	void zapiszjako()
	{
		
	}
}
	


