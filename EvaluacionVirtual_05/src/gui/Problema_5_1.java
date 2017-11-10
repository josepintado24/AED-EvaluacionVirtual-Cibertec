package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.ArregloEdades;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema_5_1 extends JFrame implements ActionListener {
	ArregloEdades objArregloEdades =new ArregloEdades();

	private JPanel contentPane;
	private JButton btnListar;
	private JButton btnReportar;
	private JButton btnGenerar;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_5_1 frame = new Problema_5_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_5_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(77, 34, 89, 23);
		contentPane.add(btnListar);
		
		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setBounds(213, 34, 89, 23);
		contentPane.add(btnReportar);
		
		btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(this);
		btnGenerar.setBounds(357, 34, 89, 23);
		contentPane.add(btnGenerar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 86, 504, 257);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnGenerar) {
			actionPerformedBtnGenerar(arg0);
		}
		if (arg0.getSource() == btnReportar) {
			actionPerformedBtnReportar(arg0);
		}
		if (arg0.getSource() == btnListar) {
			actionPerformedBtnListar(arg0);
		}
	}
	void imprimir (String data){
		txtS.append(data+"\n");
	}
	
	protected void actionPerformedBtnListar(ActionEvent arg0) {
		txtS.setText("");
		for (int i=0;i<objArregloEdades.tamano();i++){
			imprimir("N"+i+" ="+objArregloEdades.obtener(i));
;		}
		
	}
	protected void actionPerformedBtnReportar(ActionEvent arg0) {
		/*visualice: cantidad de edades, edad promedio, edad mayor,
		 * edad menor, cantidad de personas mayores de edad, 
		 * cantidad de personas menores de edad, posición de
		 *  la primera edad adolescente y posición de la última edad adolescente.*/
		imprimir("Cantidad de Edades= "+objArregloEdades.tamano());
		imprimir("Edad Promedio = "+objArregloEdades.edadPromedio());
		imprimir("Edad Mayor= "+objArregloEdades.edadMayor());
		imprimir("Edad Menor= "+objArregloEdades.edadMenor());
		imprimir("cantidad de personas mayores de edad= "+objArregloEdades.cantMayoresEdad());
		imprimir("cantidad de personas mayores de edad= "+objArregloEdades.cantMenoresEdad());
		imprimir("posición de la primera edad adolescente= "+objArregloEdades.buscarPrimeraEdadAdolescente());
		imprimir("posición de la última edad adolescente= "+objArregloEdades.buscarUltimaEdadAdolescente());
			
	}
	protected void actionPerformedBtnGenerar(ActionEvent arg0) {
		objArregloEdades.generarEdades();
	}





























}
