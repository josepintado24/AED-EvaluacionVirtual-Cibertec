package gui;

import java.awt.BorderLayout;
import clases.Trabajador;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Ejercicio_1_1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtHoras;
	private JTextField txtTarifa;
	private JTextArea txtS;
	private JButton btnOk;
	private JTextField txtCodigo;
	private JLabel lblCodigo;
	private JLabel lblNombre;
	private JLabel lblHorasTrabajadas;
	private JLabel lblTarifaHoraria;
	private JTextField txtNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_1_1 frame = new Ejercicio_1_1();
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
	public Ejercicio_1_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(105, 70, 86, 20);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		txtTarifa = new JTextField();
		txtTarifa.setBounds(105, 101, 86, 20);
		contentPane.add(txtTarifa);
		txtTarifa.setColumns(10);
		
		txtS = new JTextArea();
		txtS.setBounds(27, 182, 363, 127);
		contentPane.add(txtS);
		
		btnOk = new JButton("ok");
		btnOk.addActionListener(this);
		btnOk.setBounds(285, 20, 89, 23);
		contentPane.add(btnOk);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(105, 11, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(10, 14, 46, 14);
		contentPane.add(lblCodigo);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 50, 46, 14);
		contentPane.add(lblNombre);
		
		lblHorasTrabajadas = new JLabel("Horas Trabajadas");
		lblHorasTrabajadas.setBounds(10, 77, 98, 14);
		contentPane.add(lblHorasTrabajadas);
		
		lblTarifaHoraria = new JLabel("Tarifa Horaria");
		lblTarifaHoraria.setBounds(10, 104, 98, 14);
		contentPane.add(lblTarifaHoraria);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(105, 42, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
			actionPerformedBtnOk(e);
		}
	}
	protected void actionPerformedBtnOk(ActionEvent e) {
		Trabajador objetoTrabajador=new Trabajador();
		objetoTrabajador.codigo=Integer.parseInt(txtCodigo.getText());
		objetoTrabajador.nombre=txtNombre.getText();
		objetoTrabajador.horasTrabajadas=Integer.parseInt(txtHoras.getText());
		objetoTrabajador.tarifaHoraria=Double.parseDouble(txtTarifa.getText());
		
		imprimir("DirMem : " + objetoTrabajador);
		imprimir("Nombre : " + objetoTrabajador.nombre);
		imprimir("Código : " + objetoTrabajador.codigo);
		imprimir("Sueldo Bruto : " + objetoTrabajador.sueldoBruto());
		imprimir("Descuento : " + objetoTrabajador.descuentosTabla());
		imprimir("sueldo Neto : " + objetoTrabajador.sueldoNeto());
	}	
	
	
	
		public void imprimir(String datos){
			txtS.append(datos+"\n");
		}
		
	
}
