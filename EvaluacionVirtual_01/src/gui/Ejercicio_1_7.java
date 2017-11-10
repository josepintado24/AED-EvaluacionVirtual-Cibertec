package gui;

import java.awt.BorderLayout;
import clases.Numeros;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio_1_7 extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField num3;
	private JButton btnOk;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio_1_7 frame = new Ejercicio_1_7();
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
	public Ejercicio_1_7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero = new JLabel("Numero 1");
		lblNumero.setBounds(31, 35, 46, 14);
		contentPane.add(lblNumero);
		
		JLabel lblNumero_1 = new JLabel("Numero 2");
		lblNumero_1.setBounds(31, 77, 46, 14);
		contentPane.add(lblNumero_1);
		
		JLabel lblNumero_2 = new JLabel("Numero 3");
		lblNumero_2.setBounds(31, 120, 46, 14);
		contentPane.add(lblNumero_2);
		
		num1 = new JTextField();
		num1.setBounds(103, 32, 86, 20);
		contentPane.add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setBounds(103, 74, 86, 20);
		contentPane.add(num2);
		num2.setColumns(10);
		
		num3 = new JTextField();
		num3.setBounds(103, 117, 86, 20);
		contentPane.add(num3);
		num3.setColumns(10);
		
		btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnOk(arg0);
			}
		});
		btnOk.setBounds(284, 31, 89, 23);
		contentPane.add(btnOk);
		
		txtS = new JTextArea();
		txtS.setBounds(31, 176, 351, 150);
		contentPane.add(txtS);
	}
	protected void actionPerformedBtnOk(ActionEvent arg0) {
		Numeros objetoNumero = new Numeros();
		objetoNumero.numero1= Integer.parseInt(num1.getText());
		objetoNumero.numero2= Integer.parseInt(num2.getText());
		objetoNumero.numero3= Integer.parseInt(num3.getText());
		imprimir("Numero Mayor: "+objetoNumero.numeroMayor());
		imprimir("Numero Menor: "+objetoNumero.numeroMenor());
		imprimir("Numero Medio: "+objetoNumero.numeroMedio());
		
	}
	public void imprimir (String data){
		txtS.append(data+"\n");
		
	}
}
