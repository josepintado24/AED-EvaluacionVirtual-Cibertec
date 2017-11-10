package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import arreglos.ArregloEquipos;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Principal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JButton btnAgregar;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnEliminarFinal;
	private JButton btnEliminarTodo;
	private JButton btnEliminarPorCdigo;
	private DefaultTableModel modelo;

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
		setBounds(100, 100, 770, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(31, 30, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(602, 132, 89, 23);
		contentPane.add(btnAgregar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 100, 570, 266);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		modelo=new DefaultTableModel();
		modelo.addColumn("CODIGO");
		modelo.addColumn("MARCA");
		modelo.addColumn("PRECIO");
		modelo.addColumn("CANTIDAD");
		modelo.addColumn("CANTIDAD-PAGAR");
		table.setModel(modelo);
		
		listar();
		
		
		btnEliminarFinal = new JButton("Eliminar Final");
		btnEliminarFinal.addActionListener(this);
		btnEliminarFinal.setBounds(602, 192, 142, 23);
		contentPane.add(btnEliminarFinal);
		
		btnEliminarTodo = new JButton("Eliminar todo");
		btnEliminarTodo.addActionListener(this);
		btnEliminarTodo.setBounds(602, 226, 109, 23);
		contentPane.add(btnEliminarTodo);
		
		btnEliminarPorCdigo = new JButton("Eliminar por c\u00F3digo");
		btnEliminarPorCdigo.addActionListener(this);
		btnEliminarPorCdigo.setBounds(600, 166, 154, 23);
		contentPane.add(btnEliminarPorCdigo);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(131, 30, 86, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(238, 30, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtUnidades = new JTextField();
		txtUnidades.setBounds(351, 30, 86, 20);
		contentPane.add(txtUnidades);
		txtUnidades.setColumns(10);
		
		lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(30, 5, 46, 14);
		contentPane.add(lblCodigo);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setBounds(131, 5, 46, 14);
		contentPane.add(lblMarca);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(238, 5, 61, 14);
		contentPane.add(lblPrecio);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(351, 5, 61, 14);
		contentPane.add(lblCantidad);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(466, 5, 89, 23);
		contentPane.add(btnGrabar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(466, 66, 89, 23);
		contentPane.add(btnCancelar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(28, 61, 89, 23);
		contentPane.add(btnBuscar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancelar) {
			actionPerformedBtnCancelar(e);
		}
		if (e.getSource() == btnGrabar) {
			actionPerformedBtnGrabar(e);
		}
		if (e.getSource() == btnEliminarTodo) {
			actionPerformedBtnEliminarTodo(e);
		}
		if (e.getSource() == btnEliminarFinal) {
			actionPerformedBtnEliminarFinal(e);
		}
		if (e.getSource() == btnEliminarPorCdigo) {
			actionPerformedBtnEliminarPorCdigo(e);
		}
		if (e.getSource() == btnAgregar) {
			actionPerformedBtnAgregar(e);
		}
	}
	ArregloEquipos ae=new ArregloEquipos();
	private JTextField txtMarca;
	private JTextField txtPrecio;
	private JTextField txtUnidades;
	private JLabel lblCodigo;
	private JLabel lblMarca;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JButton btnGrabar;
	private JButton btnCancelar;
	private JButton btnBuscar;
	void listar(){
		modelo.setRowCount(0);
		
		for(int i=0;i<ae.tamano();i++){
			Object[]fila={
					ae.obtener(i).getCodigo(),
					ae.obtener(i).getMarca(),
					ae.obtener(i).getPrecioUnitario(),
					ae.obtener(i).getUnidades(),
					ae.obtener(i).aPagar()
			};
			modelo.addRow(fila);
		}
		
	}
	protected void actionPerformedBtnAgregar(ActionEvent e) {
	}
	protected void actionPerformedBtnEliminarPorCdigo(ActionEvent e) {
	}
	protected void actionPerformedBtnEliminarFinal(ActionEvent e) {
	}
	protected void actionPerformedBtnEliminarTodo(ActionEvent e) {
	}
	protected void actionPerformedBtnGrabar(ActionEvent e) {
	}
	protected void actionPerformedBtnCancelar(ActionEvent e) {
	}
}
