package gui
;
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

public class Ejemplo extends JFrame implements ActionListener {

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
					Ejemplo frame = new Ejemplo();
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
	public Ejemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnOk = new JButton("ok");
		btnOk.addActionListener(this);
		btnOk.setBounds(164, 11, 89, 23);
		contentPane.add(btnOk);
		
		txtS = new JTextArea();
		txtS.setBounds(25, 50, 376, 200);
		contentPane.add(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnOk) {
			actionPerformedBtnOk(arg0);
		}
	}
	protected void actionPerformedBtnOk(ActionEvent arg0) {
		Alumno a = new Alumno();
		a.codigo = 12345;
		a.nombre = "Juan";
		a.nota1 = 13;
		a.nota2 = 15;
		imprimir("DirMem : " + a);
		imprimir("código : " + a.codigo);
		imprimir("nombre : " + a.nombre);
		imprimir("nota 1 : " + a.nota1);
		imprimir("nota 2 : " + a.nota2);
		imprimir("promedio : " + a.promedio());
		}
		// Métodos tipo void con parámetros
		void imprimir(String s) {
			txtS.append(s + "\n");
		}
	
}
