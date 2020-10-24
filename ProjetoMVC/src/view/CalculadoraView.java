package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.Color;

public class CalculadoraView extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtResultado;
	private JButton btnCalcular;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraView frame = new CalculadoraView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public int getTxtNumero1() {
		return Integer.parseInt(txtNumero1.getText());
		
	}
	
	public int getTxtNumero2() {
		return Integer.parseInt(txtNumero2.getText());
	}
	
	public int getTxtResultado() {
		return Integer.parseInt(txtResultado.getText());
	}
	
	public void setTxtResultado(int resultado) {
		txtResultado.setText(Integer.toString(resultado));
	}
	
	public void CalculadoraListener(ActionListener eventoBotaoCalcular) {
		btnCalcular.addActionListener(eventoBotaoCalcular);
	}
	
	public void displayErrorMessage(String mensagem) {
		JOptionPane.showMessageDialog(null,mensagem);
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(47, 85, 94, 27);
		contentPane.add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(278, 85, 100, 27);
		contentPane.add(txtNumero2);
		txtNumero2.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(155, 213, 111, 37);
		contentPane.add(btnCalcular);
		
		JLabel lblNewLabel = new JLabel("+");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(197, 95, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(155, 147, 111, 27);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
	}
}
