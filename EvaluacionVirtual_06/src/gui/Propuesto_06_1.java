package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import arreglos.ArregloTemperaturas;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Propuesto_06_1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtTemp;
	private JButton btnAgregar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Propuesto_06_1 frame = new Propuesto_06_1();
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
	public Propuesto_06_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTemp = new JTextField();
		txtTemp.setBounds(32, 23, 86, 20);
		contentPane.add(txtTemp);
		txtTemp.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(165, 22, 89, 23);
		contentPane.add(btnAgregar);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 107, 551, 267);
		contentPane.add(txtS);
		
		btnEliminarFinal = new JButton("eliminar Final");
		btnEliminarFinal.addActionListener(this);
		btnEliminarFinal.setBounds(279, 22, 125, 23);
		contentPane.add(btnEliminarFinal);
		
		btnEliminartodo = new JButton("EliminarTodo");
		btnEliminartodo.addActionListener(this);
		btnEliminartodo.setBounds(434, 22, 109, 23);
		contentPane.add(btnEliminartodo);
		
		btnRemplazarPrimeraTemperatura = new JButton("Remplazar primera temperatura normal");
		btnRemplazarPrimeraTemperatura.addActionListener(this);
		btnRemplazarPrimeraTemperatura.setBounds(42, 54, 272, 23);
		contentPane.add(btnRemplazarPrimeraTemperatura);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnRemplazarPrimeraTemperatura) {
			actionPerformedBtnRemplazarPrimeraTemperatura(arg0);
		}
		if (arg0.getSource() == btnEliminartodo) {
			actionPerformedBtnEliminartodo(arg0);
		}
		if (arg0.getSource() == btnEliminarFinal) {
			actionPerformedBtnEliminarFinal(arg0);
		}
		if (arg0.getSource() == btnAgregar) {
			actionPerformedBtnAgregar(arg0);
		}
	}
	//objeto
	ArregloTemperaturas at =new ArregloTemperaturas();
	private JTextArea txtS;
	private JButton btnEliminarFinal;
	private JButton btnEliminartodo;
	private JButton btnRemplazarPrimeraTemperatura;
	//imprimir
	void imprimir(String data){
		txtS.append(data+"\n");
	}
	//Implemente un método listar que visualice las temperaturas registradas hasta ese momento.
	void listar() {
		for(int i=0;i<at.tamano();i++){
			imprimir("N"+i+":\t"+at.obtener(i));
		}
	}
	/*A la pulsación del botón Adicionar lea una temperatura por GUI y adiciónela al 
	 * arreglo. Invoque luego al método listar.*/
	double  leer(){
		double n;
		return n=Double.parseDouble(txtTemp.getText());
	}
	protected void actionPerformedBtnAgregar(ActionEvent arg0) {
		txtS.setText("");
		at.adicionar(leer());
		listar();
		
	}
	/*A la pulsación del botón Eliminar al final invoque al método eliminarAlFinal e
	 *  invoque al método listar. En caso que el arreglo estè vacío muestre el mensaje respectivo.*/
	protected void actionPerformedBtnEliminarFinal(ActionEvent arg0) {
		txtS.setText("");
		at.eliminarAlFinal();
		listar();
	}
	
	
	/*A la pulsación del botón Eliminar todo invoque al método eliminarTodo. En caso que el arreglo 
	 * esté vacío muestre el mensaje respectivo.*/
	
	protected void actionPerformedBtnEliminartodo(ActionEvent arg0) {
		txtS.setText("");
		at.eliminarTodo();
		listar();
	}
	/*método remplazarPrimeraTemperaturaNormal. Visualice los cambios. En caso que no exista ninguna
	 *  temperatura normal visualice un mensaje al respecto.*/
		
	protected void actionPerformedBtnRemplazarPrimeraTemperatura(ActionEvent arg0) {
		txtS.setText("");
		at.remplazarPrimeraTemperaturaNormal();
		listar();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
