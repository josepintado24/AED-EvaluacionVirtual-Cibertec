package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Obrero;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema_2_4 extends JFrame implements ActionListener {

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
					Problema_2_4 frame = new Problema_2_4();
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
	public Problema_2_4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 508);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnOk = new JButton("Ok");
		btnOk.addActionListener(this);
		btnOk.setBounds(223, 45, 89, 23);
		contentPane.add(btnOk);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 75, 546, 371);
		contentPane.add(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
			actionPerformedBtnOk(e);
		}
	}
	protected void actionPerformedBtnOk(ActionEvent e) {
		Obrero objObrero=new Obrero(123,20, "Jose Luis Pintado", 30.0);
		listado(objObrero);
		objObrero.sethTrabajada(objObrero.gethTrabajada()+8);
		objObrero.sethTarifa(objObrero.gethTarifa()-(objObrero.gethTarifa()*0.015));
		listado(objObrero);
		
	}
	void listado(Obrero dato){
		txtS.append("\nMOSTRANDO DATOS\n");
		txtS.append("\nCódigo\t\t: "+dato.getCodigo());
		txtS.append("\nHoras trabajadas\t: "+dato.gethTrabajada());
		txtS.append("\nNombre\t\t: "+dato.getNombres());
		txtS.append("\nTarifa Horaria\t\t: "+dato.gethTarifa());
		txtS.append("\nSueldo Bruto\t\t: "+dato.sueldoBruto());
		txtS.append("\nDescuento AFP\t\t: "+dato.descuentoAFP());
		txtS.append("\nDescuento EPS\t\t: "+dato.descuentoEPS());
		txtS.append("\nSueldo Neto\t\t: "+dato.sueldoNeto());
		
	}
}
