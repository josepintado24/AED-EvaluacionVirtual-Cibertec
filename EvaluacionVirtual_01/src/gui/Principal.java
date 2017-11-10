package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Ejecutivo;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(this);
		btnOk.setBounds(162, 25, 89, 23);
		contentPane.add(btnOk);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 73, 414, 177);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnOk) {
			actionPerformedBtnOk(arg0);
		}
	}
	protected void actionPerformedBtnOk(ActionEvent arg0) {
		Ejecutivo objetoEjecutivo =new Ejecutivo();
		objetoEjecutivo.codigo=123;
		objetoEjecutivo.horasTrabajadas=10;
		objetoEjecutivo.nombre="Jose Luis Pintado Vasquez";
		objetoEjecutivo.tarifaHorara=6;
		imprimir("Codigo del Trabajador:\t"+objetoEjecutivo.codigo);
		imprimir("Horas trabajadas:\t"+objetoEjecutivo.horasTrabajadas);
		imprimir("Nombre del trabajador:\t"+objetoEjecutivo.nombre);
		imprimir("Tarifa Horaria:\t\t"+objetoEjecutivo.tarifaHorara);
		imprimir("Sueldo Bruto:\t\t"+objetoEjecutivo.suledoBruto());
		imprimir("Descuento por AFP:\t"+objetoEjecutivo.descuentoAFP());
		imprimir("Descuento por ESP:\t"+objetoEjecutivo.descuentoEPS());
		imprimir("Sueldo NEto:\t\t"+objetoEjecutivo.sueldoNeto());
		}
		void imprimir (String data){
		textArea.append(data+"\n");
		}
}
