package ejer15;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;


public class Formulario extends JFrame implements ActionListener{
	
	private JLabel label1,label2,label3;
	private JComboBox<String>combo1,combo2,combo3;
	private JButton boton1;
	
	public Formulario() {
		setLayout(null);
		label1=new JLabel("Rojo");
		label1.setBounds(10,10,100,30);
		add(label1);
		label2=new JLabel("Verde");
		label2.setBounds(10,50,100,30);
		add(label2);
		label3=new JLabel("Azul");
		label3.setBounds(10,90,100,30);
		add(label3);
		
		combo1=new JComboBox<String>();
		combo1.setBounds(120,10,50,30);
		for(int f=0;f<255;f++) {
			combo1.addItem(String.valueOf(f));
		}
		add(combo1);
		
		combo2=new JComboBox<String>();
		combo2.setBounds(120,50,50,30);
		for(int f=0;f<255;f++) {
			combo2.addItem(String.valueOf(f));
		}
		add(combo2);
		
		
		combo3=new JComboBox<String>();
		combo3.setBounds(120,90,50,30);
		for(int f=0;f<255;f++) {
			combo3.addItem(String.valueOf(f));
		}
		add(combo3);
		
		boton1=new JButton("Fijar color");
		boton1.setBounds(10,130,100,30);
		add(boton1);
		boton1.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton1) {
			
			String cad1=(String)combo1.getSelectedItem();
			String cad2=(String)combo2.getSelectedItem();
			String cad3=(String)combo3.getSelectedItem();
			
			int rojo=Integer.parseInt(cad1);
			int verde=Integer.parseInt(cad2);
			int azul=Integer.parseInt(cad3);
			
			Color color1 = new Color(rojo,verde,azul);
			boton1.setBackground(color1);
		}
		
	}
	
	
	
	
	
	
	
	public static void main(String[]args){
		
		Formulario fm1=new Formulario();
		fm1.setBounds(0,0,400,300);
		fm1.setVisible(true);
		fm1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	
	
	
	
	

}
