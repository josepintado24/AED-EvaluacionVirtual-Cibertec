package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import arreglos.Arreglo;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Ejemplo extends JFrame implements ActionListener {

	Arreglo miObjeto=new Arreglo();
	
	private JPanel contentPane;
	private JTextField txtIngresar;
	private JTextArea txtS;
	private JLabel lblIngresar;
	private JButton btnBuscaradicionar;
	private JButton btnBuscareliminar;
	private JButton btnbuscarIntercambiar;

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
		
		txtIngresar = new JTextField();
		txtIngresar.setBounds(136, 22, 86, 20);
		contentPane.add(txtIngresar);
		txtIngresar.setColumns(10);
		
		txtS = new JTextArea();
		txtS.setBounds(37, 72, 235, 178);
		contentPane.add(txtS);
		
		lblIngresar = new JLabel("Ingresar");
		lblIngresar.setBounds(37, 25, 60, 14);
		contentPane.add(lblIngresar);
		
		btnBuscaradicionar = new JButton("Buscar/Adicionar");
		btnBuscaradicionar.addActionListener(this);
		btnBuscaradicionar.setBounds(282, 73, 128, 23);
		contentPane.add(btnBuscaradicionar);
		
		btnBuscareliminar = new JButton("BuscarEliminar");
		btnBuscareliminar.addActionListener(this);
		btnBuscareliminar.setBounds(292, 107, 118, 23);
		contentPane.add(btnBuscareliminar);
		
		btnbuscarIntercambiar = new JButton("buscarIntercambiar");
		btnbuscarIntercambiar.addActionListener(this);
		btnbuscarIntercambiar.setBounds(285, 141, 125, 23);
		contentPane.add(btnbuscarIntercambiar);
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
			txtS.append("N"+i+ " = "+ miObjeto.obtener(i)+"\n");
		}
	}
	
	void limpiar(){
		txtIngresar.setText("");
		txtIngresar.requestFocus();
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnbuscarIntercambiar) {
			actionPerformedBtnbuscarIntercambiar(arg0);
		}
		if (arg0.getSource() == btnBuscareliminar) {
			actionPerformedBtnBuscareliminar(arg0);
		}
		if (arg0.getSource() == btnBuscaradicionar) {
			actionPerformedBtnBuscaradicionar(arg0);
		}
		limpiar();
	}
	protected void actionPerformedBtnBuscaradicionar(ActionEvent arg0) {
		try{
			miObjeto.buscarAdicionar(leerIngreso());
			listar();
		}catch(Exception arr){
			mensaje("error de ingreso");
		}
	
	}
	protected void actionPerformedBtnBuscareliminar(ActionEvent arg0) {
		miObjeto.buscarEliminar(leerIngreso());
		listar();
	
	}
	protected void actionPerformedBtnbuscarIntercambiar(ActionEvent arg0) {
		miObjeto.buscarIntercambiar(leerIngreso());
		listar();
	}
}
