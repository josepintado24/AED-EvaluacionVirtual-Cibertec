package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import arreglos.ArregloTiempos;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Principal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnAgregar;
	private JButton btnIncrementarTiempo;
	private JButton btnListar;

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
		setBounds(100, 100, 592, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(395, 11, 89, 23);
		contentPane.add(btnAgregar);
		
		btnIncrementarTiempo = new JButton("Incrementar Tiempo");
		btnIncrementarTiempo.addActionListener(this);
		btnIncrementarTiempo.setBounds(395, 45, 151, 23);
		contentPane.add(btnIncrementarTiempo);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(395, 78, 89, 23);
		contentPane.add(btnListar);
		
		txtIngresar = new JTextField();
		txtIngresar.setBounds(34, 46, 86, 20);
		contentPane.add(txtIngresar);
		txtIngresar.setColumns(10);
		
		lblMensaje1 = new JLabel("");
		lblMensaje1.setBounds(34, 82, 316, 23);
		contentPane.add(lblMensaje1);
		
		lblIngresar = new JLabel("Ingresar");
		lblIngresar.setBounds(34, 15, 66, 14);
		contentPane.add(lblIngresar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 133, 512, 213);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAgregar) {
			actionPerformedBtnAgregar(e);
		}
		if (e.getSource() == btnIncrementarTiempo) {
			actionPerformedBtnIncrementarTiempo(e);
		}
		if (e.getSource() == btnListar) {
			actionPerformedBtnListar(e);
		}
	}
	ArregloTiempos objArregloTiempos =new ArregloTiempos();
	private JLabel lblMensaje;
	private JTextField txtIngresar;
	private JLabel lblMensaje1;
	private JLabel lblIngresar;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	int leer(){
	return Integer.parseInt(txtIngresar.getText());
	}
	void listar (){
		txtS.setText("");
		lblMensaje1.setText("");
		for(int i=0;i<objArregloTiempos.tamano();i++){
			txtS.append("n° "+objArregloTiempos.obtener(i)+"\n");
		}
	}
	void limpiar(){
		txtIngresar.requestFocus();
		txtIngresar.setText("");
	}
	
	protected void actionPerformedBtnListar(ActionEvent e) {
		listar ();
	}
	protected void actionPerformedBtnIncrementarTiempo(ActionEvent e) {
		objArregloTiempos.incrementarTiempos();
		listar ();
	}
	protected void actionPerformedBtnAgregar(ActionEvent e) {
		try{
			objArregloTiempos.adicionar(leer());
			listar ();
			}catch(Exception arr){
			lblMensaje1.setText("Error,ingrese numeros");
			}
	}
}
