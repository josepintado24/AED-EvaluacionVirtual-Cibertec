package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import arreglos.ArregloEquipos;
import clases.Equipo;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;

public class Principal extends JFrame implements ActionListener, KeyListener {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JButton btnAgregar;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnEliminarFinal;
	private JButton btnEliminarTodo;
	private JButton btnEliminarPorCdigo;
	private DefaultTableModel modelo;
	private int codigocont=100;

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
		
		txtCodigo = new JTextField(""+codigocont);
		txtCodigo.addKeyListener(this);
		txtCodigo.setBounds(31, 30, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(451, 29, 89, 23);
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
		btnEliminarFinal.setBounds(590, 80, 142, 23);
		contentPane.add(btnEliminarFinal);
		
		btnEliminarTodo = new JButton("Eliminar todo");
		btnEliminarTodo.addActionListener(this);
		btnEliminarTodo.setBounds(590, 114, 142, 23);
		contentPane.add(btnEliminarTodo);
		
		btnEliminarPorCdigo = new JButton("Eliminar por c\u00F3digo");
		btnEliminarPorCdigo.addActionListener(this);
		btnEliminarPorCdigo.setBounds(31, 61, 154, 23);
		contentPane.add(btnEliminarPorCdigo);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(131, 30, 86, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		txtPrecio = new JTextField("0");
		txtPrecio.setBounds(238, 30, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		txtUnidades = new JTextField("0");
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
		
		lblmensaje = new JLabel("");
		lblmensaje.setBounds(210, 63, 296, 14);
		contentPane.add(lblmensaje);
	}

	public void actionPerformed(ActionEvent e) {
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
	private JLabel lblmensaje;
	
	/*Implemente el método listar que muestre los datos completos de cada equipo.*/
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
	/*Implemente la pulsación del botón Adicionar que envíe al método adicionar un nuevo equipo
	 * creado, validando que el código no se repita.*/
	private Integer leer(){
		return Integer.parseInt(txtCodigo.getText());
	}
	  
	protected void actionPerformedBtnAgregar(ActionEvent e) {
		
		
		try{
			if (ae.buscar(leer())==null){
				String marca=txtMarca.getText();
				if(marca.length()!=0){
					
					if(txtPrecio.getText().length()!=0){
						double precio=Double.parseDouble(txtPrecio.getText());
						
						if(txtUnidades.getText().length()!=0){
							int unidad=Integer.parseInt(txtUnidades.getText());
							Equipo objetoEquipo=new Equipo(leer(),marca,precio,unidad);
							ae.adicionar(objetoEquipo);
							listar();
							codigocont++;
							txtCodigo.setText(""+codigocont);
						}
						else{
							lblmensaje.setText("Complete campo unidades");
						}
					}
					else{
						lblmensaje.setText("Complete campo precio");
					}
					
				
				}
				else{
					lblmensaje.setText("Complete campo Marca");
				}
				
			}
			
			else{
				lblmensaje.setText("Codigo ya existe");
			}
			
			
		}
		catch(Exception ag){
			lblmensaje.setText("Ingrese datos correctos");
		}
		
	}
	protected void actionPerformedBtnEliminarPorCdigo(ActionEvent e) {
		if (ae.buscar(leer())!=null){
			ae.eliminar(ae.buscar(leer()));
			listar();
		}
		else {
			lblmensaje.setText("No existe Codigo");
		}
	}
	/*mplemente la pulsación del botón Eliminar al final que elimine al último equipo.*/
	protected void actionPerformedBtnEliminarFinal(ActionEvent e) {
		try{
			
			
				//JOptionPane.showConfirmDialog(null, "Realmente desea salir de Hola Swing?", "Confirmar salida", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(JOptionPane.showConfirmDialog (null, new Object[]{"¿Quieres eliminar?"},"ALERTA", JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
					if(ae.tamano()>0){
						ae.eliminarAlFinal();
						listar();
					}
					else{
						lblmensaje.setText("ya no hay mas datos");
					}
				}
				else{
				 
				}
				
			
			
		}
		catch(Exception ag){
			
		}
		
		
	}
	protected void actionPerformedBtnEliminarTodo(ActionEvent e) {
		ae.eliminarTodo();
		listar();
		
	}
	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent arg0) {
	}
	public void keyTyped(KeyEvent arg0) {
		
	}
}
