package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Factura;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema_3_1 extends JFrame implements ActionListener {

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
					Problema_3_1 frame = new Problema_3_1();
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
	public Problema_3_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 417);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(this);
		btnOk.setBounds(228, 21, 89, 23);
		contentPane.add(btnOk);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 77, 541, 290);
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
		Factura objFactura1 =new Factura("212121212", "MEGA PLAZA",20,10.0);
		Factura objFactura2 =new Factura("303030303", "MEGA PIZZA");
		Factura objFactura3 =new Factura();
		listado(objFactura1);
		listado(objFactura2);
		listado(objFactura3);
		imprimir ("Cantidad de Objetos :"+Factura.getCantidad());
		imprimir ("Importe Facturado :"+Factura.getSumaImporteFacturado());
		imprimir ("Importe  :"+Factura.constante);
	}
	void listado(Factura data){
		imprimir("RUC :"+data.getRuc());
		imprimir("Nombre :"+data.getEmpresa());
		imprimir("Precio Unidad :"+data.getUnidades());
		imprimir("Precio Unitario"+data.getUnitario());
		imprimir("------------------------------");
	}
	void imprimir(String data){
		textArea.append("\n"+data);
		//
		
	}
}
