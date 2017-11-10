package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Arreglos;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo5 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnListar;
	private JButton btnGenerar;
	private JButton btnReportar;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo5 frame = new Ejemplo5();
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
	public Ejemplo5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 518, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnListar = new JButton("Listar ");
		btnListar.addActionListener(this);
		btnListar.setBounds(49, 29, 89, 23);
		contentPane.add(btnListar);
		
		btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(this);
		btnGenerar.setBounds(189, 29, 89, 23);
		contentPane.add(btnGenerar);
		
		btnReportar = new JButton("Reportar");
		btnReportar.addActionListener(this);
		btnReportar.setBounds(345, 29, 89, 23);
		contentPane.add(btnReportar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 86, 482, 246);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnReportar) {
			actionPerformedBtnReportar(e);
		}
		if (e.getSource() == btnGenerar) {
			actionPerformedBtnGenerar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	
	Arreglos objArreglo =new Arreglos();
	void imprimir (String data){
		textArea.append(data+"\n");
	}
		
	protected void actionPerformedBtnListar(ActionEvent e) {
		textArea.setText("");
		for (int i=0;i<objArreglo.tamano();i++){
			imprimir("N"+i+" ="+objArreglo.obtener(i));
;		}
		
	}
	protected void actionPerformedBtnGenerar(ActionEvent e) {
		objArreglo.generar();
	}
	protected void actionPerformedBtnReportar(ActionEvent e) {
		imprimir("La capacidad maxima del arreglo \t"+objArreglo.tamano());
		imprimir("La suma de todos losnumeroes \t"+objArreglo.sumaNum());
		imprimir("La posición del primer numeromayor a 25 \t"+objArreglo.posPrimerNumeromenorA25());
	}
}
