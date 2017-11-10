package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.ArregloSueldo;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnOk;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 527, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnOk = new JButton("Listar");
		btnOk.addActionListener(this);
		btnOk.setBounds(10, 22, 89, 23);
		contentPane.add(btnOk);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 69, 480, 181);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setBounds(311, 22, 89, 23);
		contentPane.add(btnReportar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnReportar) {
			actionPerformedBtnReportar(e);
		}
		if (e.getSource() == btnOk) {
			actionPerformedBtnOk(e);
		}
	}
	ArregloSueldo objArregloSueldos=new ArregloSueldo();
	private JButton btnReportar;
	void imprimir(String data){
	textArea.append(data+"\n");
	}
	void listar(){
	for (int i=0;i<objArregloSueldos.tamano();i++){
	imprimir("sueldo "+i+"\t"+objArregloSueldos.obtener(i));
	}
	}
	protected void actionPerformedBtnOk(ActionEvent e) {
		textArea.setText("");
		listar();
	}
	protected void actionPerformedBtnReportar(ActionEvent e) {
		textArea.setText("");
		imprimir("cantidad de sueldos\t:"+objArregloSueldos.tamano());
		imprimir("sueldo promedio\t:"+objArregloSueldos.sueldoPromedio());
		imprimir("sueldo mayor\t:"+objArregloSueldos.sueldoMayor());
		imprimir("sueldo menor\t:"+objArregloSueldos.sueldoMenor());
		imprimir("cantidad de empleados cuyo sueldo es mayor al sueldo promedio\t:"+objArregloSueldos.cantMayoresSueldoPromedio());
		imprimir("cantidad de empleados cuyo sueldo es menor al sueldo promedio\t:"+objArregloSueldos.cantMenoresSueldoPromedio());
		imprimir("posición del primer sueldo mayor a 850.0\t:"+objArregloSueldos.buscarPrimerSueldoMayorAlMinimo());
		imprimir("posición del ultimo sueldo menor a 850.0\t:"+objArregloSueldos.buscarUltimoSueldoMenorAlMinimo());
		}
		}
