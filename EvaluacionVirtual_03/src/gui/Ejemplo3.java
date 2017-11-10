package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Alumno;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnOk;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo3 frame = new Ejemplo3();
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
	public Ejemplo3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 354);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(this);
		btnOk.setBounds(174, 30, 89, 23);
		contentPane.add(btnOk);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 95, 414, 209);
		contentPane.add(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnOk) {
			actionPerformedBtnOk(arg0);
		}
	}
	protected void actionPerformedBtnOk(ActionEvent arg0) {
		Alumno objAlumno =new Alumno(123,15,15,"Jose Luis Pintado"); 
		listado(objAlumno);
		imprimir("Cantidad de objetos: "+Alumno.getCantidad());
		//imprimir("Numero pi: "+Libreria.pi);
	}
	 void listado (Alumno dato){
		 txtS.append("\nNombre :"+dato.getNombre());
		 txtS.append("\nCodigo :"+dato.getCodigo());
		 txtS.append("\nNota1 :"+dato.getnota1());
		 txtS.append("\nNota2 :"+dato.getNota2());
		 
	 }
	 
	 void imprimir (String dato){
		 txtS.append("\n"+dato+"\n");
	 }
}
