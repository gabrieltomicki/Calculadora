package Calculadora;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class tela {
	
	private JFrame frmCalculadora;
	private JTextField txtField;
	double numero1;
	double numero2;
	double resultado;
	String operaçao;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela window = new tela();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.getContentPane().setBackground(new Color(64, 128, 128));
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 421, 463);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtField = new JTextField();
		txtField.setBackground(new Color(255, 255, 255));
		txtField.setHorizontalAlignment(SwingConstants.RIGHT);
		txtField.setFont(new Font("Arial Black", Font.BOLD, 14));
		txtField.setBounds(10, 11, 385, 37);
		frmCalculadora.getContentPane().add(txtField);
		txtField.setColumns(10);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
			
		});
		btnC.setBackground(new Color(255, 255, 255));
		btnC.setForeground(new Color(255, 0, 0));
		btnC.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnC.setBounds(335, 59, 60, 51);
		frmCalculadora.getContentPane().add(btnC);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operaçao="/";
			}
		});
		btnDiv.setBackground(new Color(255, 255, 255));
		btnDiv.setForeground(new Color(255, 0, 0));
		btnDiv.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnDiv.setBounds(335, 121, 60, 51);
		frmCalculadora.getContentPane().add(btnDiv);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operaçao="*";
			}
		});
		btnMulti.setForeground(new Color(255, 0, 0));
		btnMulti.setBackground(new Color(255, 255, 255));
		btnMulti.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnMulti.setBounds(335, 183, 60, 51);
		frmCalculadora.getContentPane().add(btnMulti);
		
		JButton btnSubt = new JButton("-");
		btnSubt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operaçao="-";
			}
		});
		btnSubt.setBackground(new Color(255, 255, 255));
		btnSubt.setForeground(new Color(255, 0, 0));
		btnSubt.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnSubt.setBounds(335, 245, 60, 51);
		frmCalculadora.getContentPane().add(btnSubt);
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = Double.parseDouble(txtField.getText());
				txtField.setText("");
				operaçao="+";
				
			}
		});
		btnSoma.setForeground(new Color(255, 0, 0));
		btnSoma.setBackground(new Color(255, 255, 255));
		btnSoma.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnSoma.setBounds(335, 307, 60, 51);
		frmCalculadora.getContentPane().add(btnSoma);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero2= Double.parseDouble(txtField.getText());
				if(operaçao.equals("+")) {
					resultado = numero1+numero2;
					txtField.setText(String.valueOf(resultado));
				}else if(operaçao.equals("-")) {
					resultado = numero1-numero2;
					txtField.setText(String.valueOf(resultado));	
				}else if(operaçao.equals("*")) {
					resultado = numero1*numero2;
					txtField.setText(String.valueOf(resultado));
				}else if(operaçao.equals("/")) {
					resultado = numero1/numero2;
					txtField.setText(String.valueOf(resultado));
				}
			}
		});
		btnIgual.setBackground(new Color(255, 255, 255));
		btnIgual.setForeground(new Color(255, 0, 0));
		btnIgual.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnIgual.setBounds(236, 307, 60, 51);
		frmCalculadora.getContentPane().add(btnIgual);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(255, 255, 255));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn3.getText());
			}
		});
		btn3.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn3.setBounds(236, 245, 60, 51);
		frmCalculadora.getContentPane().add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn6.getText());
			}
		});
		btn6.setBackground(new Color(255, 255, 255));
		btn6.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn6.setBounds(236, 183, 60, 51);
		frmCalculadora.getContentPane().add(btn6);
	
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(255, 255, 255));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn9.getText());
			}
		});
		btn9.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn9.setBounds(236, 121, 60, 51);
		frmCalculadora.getContentPane().add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn0.getText());
			}
		});
		btn0.setBackground(new Color(255, 255, 255));
		btn0.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn0.setBounds(138, 307, 60, 51);
		frmCalculadora.getContentPane().add(btn0);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(255, 255, 255));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn2.getText());
			}
		});
		btn2.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn2.setBounds(138, 245, 60, 51);
		frmCalculadora.getContentPane().add(btn2);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn5.getText());
			}
		});
		btn5.setBackground(new Color(255, 255, 255));
		btn5.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn5.setBounds(138, 183, 60, 51);
		frmCalculadora.getContentPane().add(btn5);
	
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(255, 255, 255));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn8.getText());
			}
		});
		btn8.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn8.setBounds(138, 121, 60, 51);
		frmCalculadora.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(255, 255, 255));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn7.getText());
			}
		});
		btn7.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn7.setBounds(51, 121, 60, 51);
		frmCalculadora.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn4.getText());
			}
		});
		btn4.setBackground(new Color(255, 255, 255));
		btn4.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn4.setBounds(51, 183, 60, 51);
		frmCalculadora.getContentPane().add(btn4);
		
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(new Color(255, 255, 255));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn1.getText());
			}
		});
		btn1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btn1.setBounds(51, 245, 60, 51);
		frmCalculadora.getContentPane().add(btn1);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText(txtField.getText()+btn.getText());
			}
		});
		btnPonto.setBackground(new Color(255, 255, 255));
		btnPonto.setForeground(new Color(255, 0, 0));
		btnPonto.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnPonto.setBounds(51, 307, 60, 51);
		frmCalculadora.getContentPane().add(btnPonto);
	}
}
