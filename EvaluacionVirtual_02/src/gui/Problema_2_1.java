package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Celular;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema_2_1 extends JFrame implements ActionListener {

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
					Problema_2_1 frame = new Problema_2_1();
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
	public Problema_2_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(this);
		btnOk.setBounds(167, 38, 89, 23);
		contentPane.add(btnOk);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 67, 414, 183);
		contentPane.add(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnOk) {
			actionPerformedBtnOk(arg0);
		}
	}
	protected void actionPerformedBtnOk(ActionEvent arg0) {
		
		Celular objetoCelular = new Celular(123456,"Jose Luis Pintado",10,0.50 );
		listado(objetoCelular);
		objetoCelular.setPrecioSegundo(0.1-(0.1*0.50));
		objetoCelular.setSegundosConsumidos(50+20);
		listado(objetoCelular);
	}
	
	void listado(Celular dato){
		txtS.append("Codigo: "+dato.getNumero()+"\n");
		txtS.append("Nombre: "+dato.getUsuario()+"\n");
		txtS.append("Segundos consumidos: "+dato.getSegundosConsumidos()+"\n");
		txtS.append("Precio Segundos: "+dato.getPrecioSegundo()+"\n");
		txtS.append("Total a Pagar: "+dato.Total()+"\n");
		txtS.append("-----------------------------------------\n");
	}
	
	
}
