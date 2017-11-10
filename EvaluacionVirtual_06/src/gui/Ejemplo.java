package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import arreglos.Arreglo;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo extends JFrame implements ActionListener {
	Arreglo objArreglo=new Arreglo();
	private JPanel contentPane;
	private JTextField txtCan;
	private JButton btnAdd;
	private JButton btnEliminar;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
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
		
		txtCan = new JTextField();
		txtCan.setBounds(10, 11, 86, 20);
		contentPane.add(txtCan);
		txtCan.setColumns(10);
		
		btnAdd = new JButton("add");
		btnAdd.addActionListener(this);
		btnAdd.setBounds(117, 10, 89, 23);
		contentPane.add(btnAdd);
		
		btnEliminar = new JButton("eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(216, 10, 89, 23);
		contentPane.add(btnEliminar);
		
		btnNewButton = new JButton("elim final");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(326, 10, 98, 23);
		contentPane.add(btnNewButton);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 53, 414, 197);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(arg0);
		}
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnAdd) {
			actionPerformedBtnAdd(arg0);
		}
	}
	int leerNumero(){
		return Integer.parseInt(txtCan.getText());
	}
	void imprimir(String dato){
		txtS.append(dato+"");
	}
	void  listar(){
		for(int i=0;i>objArreglo.tamano();i++){
			imprimir("N° "+i+":\t"+objArreglo.obtener(i));
		}
	}
	protected void actionPerformedBtnAdd(ActionEvent arg0) {
		objArreglo.adicionar(leerNumero());
		listar();
	}
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
		
	}
	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
	}
}
