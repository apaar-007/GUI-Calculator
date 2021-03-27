package com.calculator.ui;

import java.awt.EventQueue;
import com.calculator.beans.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.ComponentOrientation;
import java.awt.SystemColor;

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
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 464, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setFont(new Font("Tahoma", Font.BOLD, 23));
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtResult.setBounds(12, 89, 421, 47);
		frame.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnClear.setForeground(Color.BLACK);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtResult.setText(null);
			}
		});
		Image btclr = new ImageIcon(this.getClass().getResource("/c.png")).getImage();
		btnClear.setIcon(new ImageIcon(btclr));
		btnClear.setBounds(12, 145, 97, 63);
		frame.getContentPane().add(btnClear);
		
		JButton btnBackspace = new JButton("B");
		btnBackspace.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnBackspace.setForeground(Color.BLACK);
		Image btBack = new ImageIcon(this.getClass().getResource("/b.png")).getImage();
		btnBackspace.setIcon(new ImageIcon(btBack));
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
		Image btDvd = new ImageIcon(this.getClass().getResource("/dvd.png")).getImage();
		btnDivide.setIcon(new ImageIcon(btDvd));
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
		btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 22));
		Image btMlt = new ImageIcon(this.getClass().getResource("/mlt.png")).getImage();
		btnMultiply.setIcon(new ImageIcon(btMlt));
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
		btnSeven.setFont(new Font("Tahoma", Font.BOLD, 22));
		Image btSeven = new ImageIcon(this.getClass().getResource("/num7.png")).getImage();
		btnSeven.setIcon(new ImageIcon(btSeven));
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
		btnEight.setFont(new Font("Tahoma", Font.BOLD, 22));
		Image btEight = new ImageIcon(this.getClass().getResource("/num8.png")).getImage();
		btnEight.setIcon(new ImageIcon(btEight));
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
		btnNine.setFont(new Font("Tahoma", Font.BOLD, 22));
		Image btNine = new ImageIcon(this.getClass().getResource("/num9.png")).getImage();
		btnNine.setIcon(new ImageIcon(btNine));
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
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 22));
		Image btPls = new ImageIcon(this.getClass().getResource("/pls.png")).getImage();
		btnAdd.setIcon(new ImageIcon(btPls));
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
		btnFour.setFont(new Font("Tahoma", Font.BOLD, 22));
		Image btFour = new ImageIcon(this.getClass().getResource("/num4.png")).getImage();
		btnFour.setIcon(new ImageIcon(btFour));
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
		btnFive.setFont(new Font("Tahoma", Font.BOLD, 22));
		Image btFive = new ImageIcon(this.getClass().getResource("/num5.png")).getImage();
		btnFive.setIcon(new ImageIcon(btFive));
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
		btnSix.setFont(new Font("Tahoma", Font.BOLD, 22));
		Image btSix = new ImageIcon(this.getClass().getResource("/num6.png")).getImage();
		btnSix.setIcon(new ImageIcon(btSix));
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
		btnSubtract.setFont(new Font("Tahoma", Font.BOLD, 22));
		Image btSub = new ImageIcon(this.getClass().getResource("/sub.png")).getImage();
		btnSubtract.setIcon(new ImageIcon(btSub));
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
		btnOne.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnOne.setBounds(12, 373, 97, 63);
		Image btOne = new ImageIcon(this.getClass().getResource("/num1.png")).getImage();
		btnOne.setIcon(new ImageIcon(btOne));
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
		btntwo.setFont(new Font("Tahoma", Font.BOLD, 22));
		Image btTwo = new ImageIcon(this.getClass().getResource("/num2.png")).getImage();
		btntwo.setIcon(new ImageIcon(btTwo));
		btntwo.setBounds(121, 373, 97, 63);
		frame.getContentPane().add(btntwo);
		
		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.setNumber(txtResult.getText()+btnThree.getText());
				txtResult.setText(model.getNumber());
			}
		});
		btnThree.setFont(new Font("Tahoma", Font.BOLD, 22));
		Image btThree = new ImageIcon(this.getClass().getResource("/num3.png")).getImage();
		btnThree.setIcon(new ImageIcon(btThree));
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
		Image btMod = new ImageIcon(this.getClass().getResource("/mod.png")).getImage();
		btnModulus.setIcon(new ImageIcon(btMod));
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
		btnEquals.setForeground(Color.BLUE);
		btnEquals.setFont(new Font("Tahoma", Font.BOLD, 22));
		Image btEql = new ImageIcon(this.getClass().getResource("/eql.png")).getImage();
		btnEquals.setIcon(new ImageIcon(btEql));
		btnEquals.setBounds(230, 444, 203, 63);
		frame.getContentPane().add(btnEquals);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setNumber(txtResult.getText()+btnZero.getText());
				txtResult.setText(model.getNumber());
				
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.BOLD, 22));
		Image btZero = new ImageIcon(this.getClass().getResource("/num0.png")).getImage();
		btnZero.setIcon(new ImageIcon(btZero));
		btnZero.setBounds(121, 444, 97, 63);
		frame.getContentPane().add(btnZero);
		
		JLabel lblHeading = new JLabel("");
		Image cal = new ImageIcon(this.getClass().getResource("/cal.gif")).getImage();
		lblHeading.setIcon(new ImageIcon(cal));
		lblHeading.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblHeading.setBounds(12, 0, 421, 87);
		frame.getContentPane().add(lblHeading);
		
		JButton btn_dot = new JButton(".");
		btn_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setNumber(txtResult.getText()+btn_dot.getText());
				txtResult.setText(model.getNumber());
				
			}
		});
		btn_dot.setFont(new Font("Tahoma", Font.BOLD, 22));
		Image btDot = new ImageIcon(this.getClass().getResource("/dot.png")).getImage();
		btn_dot.setIcon(new ImageIcon(btDot));
		btn_dot.setBounds(12, 444, 97, 63);
		frame.getContentPane().add(btn_dot);
		
		
	}
}
