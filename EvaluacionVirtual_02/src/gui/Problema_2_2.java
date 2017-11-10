package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Computadora;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema_2_2 extends JFrame implements ActionListener {

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
					Problema_2_2 frame = new Problema_2_2();
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
	public Problema_2_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnOk = new JButton("ok");
		btnOk.addActionListener(this);
		btnOk.setBounds(172, 49, 89, 23);
		contentPane.add(btnOk);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 80, 414, 290);
		contentPane.add(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnOk) {
			actionPerformedBtnOk(arg0);
		}
	}
	protected void actionPerformedBtnOk(ActionEvent arg0) {
		Computadora objetoComputadora=new Computadora(123,"Lenovo","Black", 1000.0);
		listadoObjeto(objetoComputadora);
		objetoComputadora.setPrecioDolar(objetoComputadora.getPrecioDolar()-(objetoComputadora.getPrecioDolar()*0.10));
		listadoObjeto(objetoComputadora);
	}
	void listadoObjeto(Computadora dato){
		txtS.append("DETALLE DE LA COMPUTADORA\n");
		txtS.append("\nCodigo\t\t : "+dato.getCodigo());
		txtS.append("\nMarca\t\t : "+dato.getMarca());
		txtS.append("\nColor\t\t : "+dato.getColor());
		txtS.append("\nPrecio en Dolares\t : "+dato.getPrecioDolar());
		txtS.append("\nPrecio en soles\t\t : "+dato.precioSoles(dato.getPrecioDolar()));
		txtS.append("\nPrecio en Euros\t : "+dato.precioEuros(dato.getPrecioDolar()));
		txtS.append("\n--------------------------------------------\n");
	}
}
