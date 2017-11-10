package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import arreglos.Arreglo;
public class Ejemplo extends JFrame implements ActionListener {

	Arreglo miObjeto=new Arreglo();
	
	private JPanel contentPane;
	private JLabel lblIngresar;
	private JTextField txtIngresar;
	private JTextArea txtS;
	private JButton btnbuscarAdicionar;
	private JButton btnprimeroAlFinal;
	private JButton btnbuscarRezagar;
	private JButton btnultimoAlInicio;
	private JButton btnbuscarPriorizar;
	private JButton btninvertirArreglo;

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
		setBounds(100, 100, 578, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblIngresar = new JLabel("Ingresar");
		lblIngresar.setBounds(51, 34, 77, 14);
		contentPane.add(lblIngresar);
		
		txtIngresar = new JTextField();
		txtIngresar.setBounds(150, 31, 86, 20);
		contentPane.add(txtIngresar);
		txtIngresar.setColumns(10);
		
		txtS = new JTextArea();
		txtS.setBounds(51, 62, 300, 335);
		contentPane.add(txtS);
		
		btnbuscarAdicionar = new JButton("buscarAdicionar");
		btnbuscarAdicionar.addActionListener(this);
		btnbuscarAdicionar.setBounds(374, 76, 135, 23);
		contentPane.add(btnbuscarAdicionar);
		
		btnprimeroAlFinal = new JButton("Primero al Final");
		btnprimeroAlFinal.addActionListener(this);
		btnprimeroAlFinal.setBounds(371, 110, 138, 23);
		contentPane.add(btnprimeroAlFinal);
		
		btnbuscarRezagar = new JButton("Buscar Rezagar");
		btnbuscarRezagar.addActionListener(this);
		btnbuscarRezagar.setBounds(374, 154, 135, 23);
		contentPane.add(btnbuscarRezagar);
		
		btnultimoAlInicio = new JButton("Ultimo al inicio");
		btnultimoAlInicio.addActionListener(this);
		btnultimoAlInicio.setBounds(374, 188, 135, 23);
		contentPane.add(btnultimoAlInicio);
		
		btnbuscarPriorizar = new JButton("Buscar Priorizar");
		btnbuscarPriorizar.addActionListener(this);
		btnbuscarPriorizar.setBounds(374, 234, 135, 23);
		contentPane.add(btnbuscarPriorizar);
		
		btninvertirArreglo = new JButton("Invertir Arreglo");
		btninvertirArreglo.addActionListener(this);
		btninvertirArreglo.setBounds(374, 268, 135, 23);
		contentPane.add(btninvertirArreglo);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btninvertirArreglo) {
			actionPerformedBtninvertirArreglo(arg0);
		}
		if (arg0.getSource() == btnbuscarPriorizar) {
			actionPerformedBtnbuscarPriorizar(arg0);
		}
		if (arg0.getSource() == btnultimoAlInicio) {
			actionPerformedBtnultimoAlInicio(arg0);
		}
		if (arg0.getSource() == btnbuscarRezagar) {
			actionPerformedBtnbuscarRezagar(arg0);
		}
		if (arg0.getSource() == btnprimeroAlFinal) {
			actionPerformedBtnprimeroAlFinal(arg0);
		}
		if (arg0.getSource() == btnbuscarAdicionar) {
			actionPerformedBtnbuscarAdicionar(arg0);
		}
		limpiar();
	}
	protected void actionPerformedBtnbuscarAdicionar(ActionEvent arg0) {
		
		try{
			miObjeto.buscarAdicionar(leerIngreso());
			listar();
		}catch(Exception arr){
			mensaje("error de ingreso");
		}
		
	}
	
	void mensaje(String eee){
		JOptionPane.showMessageDialog(this,eee);
	}
	
	int leerIngreso(){
		return Integer.parseInt(txtIngresar.getText());
	}
	
	void  listar(){
		txtS.setText("");
		for(int i=0;i<miObjeto.tamano();i++){
			txtS.append("N"+i+ " = "+ miObjeto.obtner(i)+"\n");
		}
	}
	
	void limpiar(){
		txtIngresar.setText("");
		txtIngresar.requestFocus();
	}
	protected void actionPerformedBtnprimeroAlFinal(ActionEvent arg0) {
		miObjeto.primeroAlFinal();
		listar();
		
	}
	protected void actionPerformedBtnbuscarRezagar(ActionEvent arg0) {
		
		try{
			miObjeto.buscarRezagar(leerIngreso());
			listar();
		}catch(Exception ar){
			mensaje("Es un error");
		}
		

	
	}
	protected void actionPerformedBtnultimoAlInicio(ActionEvent arg0) {
		miObjeto.ultimoAlInicio();
		listar();
	
	}
	protected void actionPerformedBtnbuscarPriorizar(ActionEvent arg0) {
		try{
			miObjeto.buscarPriorizar(leerIngreso());
			listar();
		}catch(Exception aa){
			mensaje("Error de ingreso");
		}
		

	
	}
	protected void actionPerformedBtninvertirArreglo(ActionEvent arg0) {
	miObjeto.invertirArreglo();
	listar();
	
	}
}
