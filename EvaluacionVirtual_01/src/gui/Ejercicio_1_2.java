package gui;

import java.awt.BorderLayout;
import clases.Filmacion;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio_1_2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JLabel lblCdigo;
	private JLabel lblTitulo;
	private JTextField txtTitulo;
	private JLabel lblDuracin;
	private JTextField txtTiempo;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JTextArea txtS;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_1_2 frame = new Ejercicio_1_2();
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
	public Ejercicio_1_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(130, 26, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(23, 29, 46, 14);
		contentPane.add(lblCdigo);
		
		lblTitulo = new JLabel("Titulo");
		lblTitulo.setBounds(23, 73, 46, 14);
		contentPane.add(lblTitulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(130, 70, 86, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		lblDuracin = new JLabel("Duraci\u00F3n en minutos");
		lblDuracin.setBounds(23, 120, 97, 14);
		contentPane.add(lblDuracin);
		
		txtTiempo = new JTextField();
		txtTiempo.setBounds(130, 117, 86, 20);
		contentPane.add(txtTiempo);
		txtTiempo.setColumns(10);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(23, 165, 46, 14);
		contentPane.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(130, 162, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtS = new JTextArea();
		txtS.setBounds(22, 205, 402, 142);
		contentPane.add(txtS);
		
		btnOk = new JButton("ok");
		btnOk.addActionListener(this);
		btnOk.setBounds(291, 25, 89, 23);
		contentPane.add(btnOk);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
			actionPerformedBtnOk(e);
		}
	}
	protected void actionPerformedBtnOk(ActionEvent e) {
		Filmacion ObjetoFilmacion= new Filmacion(); 
		ObjetoFilmacion.codigo=Integer.parseInt(txtCodigo.getText());
		ObjetoFilmacion.titulo=txtTitulo.getText();
		ObjetoFilmacion.minutosFilmacion=Integer.parseInt(txtTiempo.getText());
		ObjetoFilmacion.precioSoles=Double.parseDouble(txtPrecio.getText());
		
		mostrar("Codigo: "+ObjetoFilmacion.codigo);
		mostrar("Titulo: "+ObjetoFilmacion.titulo);
		mostrar("Minutos de Filmacion: "+ObjetoFilmacion.minutosFilmacion);
		mostrar("Precio Dolares: "+ObjetoFilmacion.cambioDolares());
		
		
	}
		void mostrar (String datos){
			txtS.append(datos+"\n");
		}
}
