package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Asistente;

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
		btnOk.setBounds(164, 24, 89, 23);
		contentPane.add(btnOk);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 63, 414, 187);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
			actionPerformedBtnOk(e);
		}
	}
	protected void actionPerformedBtnOk(ActionEvent e) {
		//int codigo, int dni, String nombre, double sueldoSoles
		Asistente objetoAsistente=new Asistente(1234,70469002,"Jose Luis Pintado",1500);
			listado(objetoAsistente);
			imprimir("Cantidad de Objetos \t:"+Asistente.getCantidad());
			imprimir("Suma de Sueldos de objetos \t:"+Asistente.getSumaSueldo());
		}
		void listado(Asistente datos){
			imprimir("DATOS:");
			imprimir("Código \t\t:"+datos.getCodigo());
			imprimir("DNI \t\t:"+datos.getDni());
			imprimir("Nombre \t\t:"+datos.getNombre());
			imprimir("Sueldo \t\t:"+datos.getSueldoSoles());
			imprimir("Mensaje \t\t:"+datos.sueldoMayor());
		}
		void imprimir (String datos){
			textArea.append("\n"+datos);
		}
}
