package application;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;


import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.Button;
import java.awt.BorderLayout;
import java.awt.GridLayout;
/*from w  w w . j  a  v  a 2  s  . c o  m*/
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class MaleOkienka  {


	public JFrame  przyciskiplik()
	{
		JFrame panel=new JFrame();
		panel.setLayout(new BorderLayout());
		//JPanel pomocny=new JPanel();
		
		//JButton p1=new JButton("ABC");
		//JButton p2=new JButton("2ABC");
		//pomocny.add(p1);
		//pomocny.add(p2);
		
		
	
		
		panel.setUndecorated(true);
		panel.getRootPane().setWindowDecorationStyle(JRootPane.NONE);
		//panel.add(pomocny,BorderLayout.CENTER);
		
		
		panel.setSize(50,250);
		panel.move(970,305);
		panel.show();
		return panel;
		
		
		
		// Jak to dodac?
		 // musi mi jakos zwrocic ta ramke do pliku main
       //dodac przycisk close
		
		
	};
	
	
	
	
}
