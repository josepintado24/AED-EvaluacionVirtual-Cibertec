package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import arreglos.ArregloNotas;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema_6_2 extends JFrame implements ActionListener {
	ArregloNotas objArregloNotas=new ArregloNotas();
	private JPanel contentPane;
	private JButton btnListar;
	private JButton btnAdicionar;
	private JButton btnEliminarFinal;
	private JButton btnEliminarTodo;
	private JTextField txtNota;
	private JScrollPane scrollPane;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_6_2 frame = new Problema_6_2();
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
	public Problema_6_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(140, 21, 89, 23);
		contentPane.add(btnListar);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(258, 21, 89, 23);
		contentPane.add(btnAdicionar);
		
		btnEliminarFinal = new JButton("Eliminar Final");
		btnEliminarFinal.addActionListener(this);
		btnEliminarFinal.setBounds(357, 21, 115, 23);
		contentPane.add(btnEliminarFinal);
		
		btnEliminarTodo = new JButton("Eliminar Todo");
		btnEliminarTodo.addActionListener(this);
		btnEliminarTodo.setBounds(502, 21, 107, 23);
		contentPane.add(btnEliminarTodo);
		
		txtNota = new JTextField();
		txtNota.setBounds(22, 22, 86, 20);
		contentPane.add(txtNota);
		txtNota.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 70, 607, 288);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEliminarTodo) {
			actionPerformedBtnEliminarTodo(e);
		}
		if (e.getSource() == btnEliminarFinal) {
			actionPerformedBtnEliminarFinal(e);
		}
		if (e.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	
	 int leer(){
			return Integer.parseInt(txtNota.getText());
		}
	void imprimir(String data){
		txtS.append(data+"\n");
	}
	
	void listar(){
		txtS.setText("");
		
		for (int i=0;i<objArregloNotas.tamano();i++)
			imprimir("Nº"+i+"\t"+objArregloNotas.obtener(i));
	}
	
	
	protected void actionPerformedBtnListar(ActionEvent e) {
		imprimir ("Ultima nota desaprobatoria \t"+objArregloNotas.buscarUltimaNotaDesaprobatoria());
		imprimir ("Decrementar  nota desaprobatoria \t"+objArregloNotas.decrementarUltimaNotaDesaprobatoria());
		imprimir ("Ultima nota desaprobatoria \t"+objArregloNotas.remplazarUltimaNotaDesaprobatoria());
		
		
	}
	protected void actionPerformedBtnAdicionar(ActionEvent e) {
		objArregloNotas.adicionar(leer());
		listar();
	}
	protected void actionPerformedBtnEliminarFinal(ActionEvent e) {
		objArregloNotas.eliminarAlFinal();
		listar();
	}
	protected void actionPerformedBtnEliminarTodo(ActionEvent e) {
		objArregloNotas.eliminarTodo();
		listar();
	}
}
