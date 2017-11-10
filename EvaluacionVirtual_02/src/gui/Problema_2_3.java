package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clases.Edificio;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Problema_2_3 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnOk;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_2_3 frame = new Problema_2_3();
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
	public Problema_2_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnOk = new JButton("ok");
		btnOk.addActionListener(this);
		btnOk.setBounds(174, 65, 89, 23);
		contentPane.add(btnOk);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 117, 414, 281);
		contentPane.add(txtS);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
			actionPerformedBtnOk(e);
		}
	}
	protected void actionPerformedBtnOk(ActionEvent e) {
		Edificio objetoEdificio=new Edificio(1234,15,5,500);
		listar(objetoEdificio);
		objetoEdificio.setPrecioDolares(objetoEdificio.getPrecioDolares()+(objetoEdificio.getPrecioDolares()*0.20));
		listar(objetoEdificio);
	}
	
	void listar(Edificio dato){
		txtS.append("DATOS\n");
		txtS.append("\nCódigo\t\t: "+dato.getCodigo());
		txtS.append("\nNumero de departamentos\t: "+dato.getNumDepartamentos());
		txtS.append("\nCantidad de pisos \t: "+dato.getCantidadPisos());
		txtS.append("\nPrecio en Dolares \t: "+dato.getPrecioDolares());
		txtS.append("\nMonto a pagar en Dolares \t: "+dato.precioDolaresOperador(2));
		txtS.append("\n--------------------------------------\n");
		
	}
}
