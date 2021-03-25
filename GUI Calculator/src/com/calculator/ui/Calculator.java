package com.calculator.ui;

import java.awt.EventQueue;
import com.calculator.beans.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField txtResult;
    CalculatorModel model = new CalculatorModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 464, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setFont(new Font("Tahoma", Font.BOLD, 23));
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setBounds(12, 52, 421, 73);
		frame.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		JButton btnClear = new JButton("C");
		btnClear.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnClear.setForeground(Color.GREEN);
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResult.setText(null);
			}
		});
		btnClear.setBounds(12, 145, 97, 63);
		frame.getContentPane().add(btnClear);
		
		JButton btnBackspace = new JButton("B");
		btnBackspace.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnBackspace.setForeground(Color.RED);
		btnBackspace.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnBackspace.setBounds(121, 145, 97, 63);
		frame.getContentPane().add(btnBackspace);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setNum1(Double.parseDouble(txtResult.getText()));
				txtResult.setText(" ");
				model.setOperator("/");
			}
		});
		btnDivide.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDivide.setBounds(230, 145, 97, 63);
		frame.getContentPane().add(btnDivide);
		
		JButton btnMultiply = new JButton("X");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.setNum1(Double.parseDouble(txtResult.getText()));
				txtResult.setText(" ");
				model.setOperator("X");
			}
		});
		btnMultiply.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnMultiply.setBounds(339, 145, 97, 63);
		frame.getContentPane().add(btnMultiply);
		
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CalculatorModel model = new CalculatorModel();
				model.setNumber(txtResult.getText()+btnSeven.getText());
				txtResult.setText(model.getNumber());
			}
		});
		btnSeven.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnSeven.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnSeven.setBounds(12, 221, 97, 63);
		frame.getContentPane().add(btnSeven);
		
		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CalculatorModel model = new CalculatorModel();
				model.setNumber(txtResult.getText()+btnEight.getText());
				txtResult.setText(model.getNumber());
			}
		});
		btnEight.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnEight.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnEight.setBounds(121, 221, 97, 63);
		frame.getContentPane().add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CalculatorModel model = new CalculatorModel();
				model.setNumber(txtResult.getText()+btnNine.getText());
				txtResult.setText(model.getNumber());
			}
		});
		btnNine.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnNine.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNine.setBounds(230, 221, 97, 63);
		frame.getContentPane().add(btnNine);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				model.setNum1(Double.parseDouble(txtResult.getText()));
				txtResult.setText(" ");
				model.setOperator("+");
				
			}
		});
		btnAdd.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnAdd.setBounds(339, 221, 97, 63);
		frame.getContentPane().add(btnAdd);
		
		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CalculatorModel model = new CalculatorModel();
				model.setNumber(txtResult.getText()+btnFour.getText());
				txtResult.setText(model.getNumber());
			}
		});
		btnFour.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnFour.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnFour.setBounds(12, 297, 97, 63);
		frame.getContentPane().add(btnFour);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CalculatorModel model = new CalculatorModel();
				model.setNumber(txtResult.getText()+btnFive.getText());
				txtResult.setText(model.getNumber());
			}
		});
		btnFive.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnFive.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnFive.setBounds(121, 297, 97, 63);
		frame.getContentPane().add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CalculatorModel model = new CalculatorModel();
				model.setNumber(txtResult.getText()+btnSix.getText());
				txtResult.setText(model.getNumber());
			}
		});
		btnSix.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnSix.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnSix.setBounds(230, 297, 97, 63);
		frame.getContentPane().add(btnSix);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setNum1(Double.parseDouble(txtResult.getText()));
				txtResult.setText(" ");
				model.setOperator("-");
			}
		});
		btnSubtract.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnSubtract.setBounds(339, 297, 97, 63);
		frame.getContentPane().add(btnSubtract);
		
		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				String number = txtResult.getText()+btnOne.getText();
//				txtResult.setText(number);
				
				model.setNumber(txtResult.getText()+btnOne.getText());
				txtResult.setText(model.getNumber());
				
				
			}
		});
		btnOne.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnOne.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnOne.setBounds(12, 373, 97, 63);
		frame.getContentPane().add(btnOne);
		
		JButton btntwo = new JButton("2");
		btntwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				String number = txtResult.getText()+btntwo.getText();
//				txtResult.setText(number);
				// CalculatorModel model = new CalculatorModel();
				model.setNumber(txtResult.getText()+btntwo.getText());
				txtResult.setText(model.getNumber());
			}
		});
		btntwo.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btntwo.setFont(new Font("Tahoma", Font.BOLD, 22));
		btntwo.setBounds(121, 373, 97, 63);
		frame.getContentPane().add(btntwo);
		
		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.setNumber(txtResult.getText()+btnThree.getText());
				txtResult.setText(model.getNumber());
			}
		});
		btnThree.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnThree.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnThree.setBounds(230, 373, 97, 63);
		frame.getContentPane().add(btnThree);
		
		JButton btnModulus = new JButton("%");
		btnModulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setNum1(Double.parseDouble(txtResult.getText()));
				txtResult.setText(" ");
				model.setOperator("%");
			}
		});
		btnModulus.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnModulus.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnModulus.setBounds(339, 373, 97, 63);
		frame.getContentPane().add(btnModulus);
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double answer=0;
				// Storing value of num_2
				model.setNum2(Double.parseDouble(txtResult.getText()));
				// we have to .equals to check for string
				switch (model.getOperator()) {
				case "+":
					answer = model.getNum1()+model.getNum2();
					// converting ans to String
					txtResult.setText(String.valueOf(answer));
					break;
				case "-":
					answer = model.getNum1()-model.getNum2();
					txtResult.setText(String.valueOf(answer));
					break;
				case "/":
					answer = model.getNum1()/model.getNum2();
					txtResult.setText(String.valueOf(answer));
					break;
				case "%":
					answer= model.getNum1()%model.getNum2();
					txtResult.setText(String.valueOf(answer));
					break;
				case "X":
					answer= model.getNum1()*model.getNum2();
					txtResult.setText(String.valueOf(answer));
					break;
				default:
					break;
				}
				}
			}
	);
		btnEquals.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnEquals.setForeground(Color.BLUE);
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnEquals.setBounds(230, 444, 203, 63);
		frame.getContentPane().add(btnEquals);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setNumber(txtResult.getText()+btnZero.getText());
				txtResult.setText(model.getNumber());
				
			}
		});
		btnZero.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnZero.setBounds(121, 444, 97, 63);
		frame.getContentPane().add(btnZero);
		
		JLabel lblHeading = new JLabel("Simple Calculator");
		lblHeading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblHeading.setBounds(107, 13, 240, 26);
		frame.getContentPane().add(lblHeading);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setNumber(txtResult.getText()+btn_dot.getText());
				txtResult.setText(model.getNumber());
				
			}
		});
		btn_dot.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn_dot.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		btn_dot.setBounds(12, 444, 97, 63);
		frame.getContentPane().add(btn_dot);
	}
}
