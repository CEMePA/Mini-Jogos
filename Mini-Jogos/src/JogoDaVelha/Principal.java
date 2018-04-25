package JogoDaVelha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Principal {

	private JFrame frmJogoDaVelha;
	private JButton btnPosicao1;
	private JButton btnPosicao2;
	private JButton btnPosicao3;
	private JButton btnPosicao4;
	private JButton btnPosicao5;
	private JButton btnPosicao6;
	private JButton btnPosicao7;
	private JButton btnPosicao8;
	private JButton btnPosicao9;
	private JButton btnMenu;
	private JLabel lblNewLabel;
	String sinal = "X";
	static String vencedor;
	private JLabel lblVez;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmJogoDaVelha.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJogoDaVelha = new JFrame();
		frmJogoDaVelha.setTitle("Jogo da Velha");
		frmJogoDaVelha.setBounds(100, 100, 256, 425);
		frmJogoDaVelha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJogoDaVelha.getContentPane().setLayout(null);
		
		JLabel lblJogoDaVelha = new JLabel("Jogo da Velha");
		lblJogoDaVelha.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblJogoDaVelha.setHorizontalAlignment(SwingConstants.CENTER);
		lblJogoDaVelha.setBounds(10, 11, 230, 37);
		frmJogoDaVelha.getContentPane().add(lblJogoDaVelha);
		
		//----------------\\
		
		btnPosicao1 = new JButton("");
		btnPosicao1.setForeground(Color.BLACK);
		btnPosicao1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPosicao1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if (btnPosicao1.getText().isEmpty()) {
					btnPosicao1.setBackground(Color.GREEN);
				}else {
					btnPosicao1.setBackground(Color.RED);
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ficaNormal();
			}
		});
		btnPosicao1.setBackground(Color.LIGHT_GRAY);
		btnPosicao1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnPosicao1.setText(sinal);
				btnPosicao1.setEnabled(false);
				btnPosicao1.setBackground(Color.LIGHT_GRAY);
				rodadas();
				alterarSinal();
				vencedor();
			}
		});
		btnPosicao1.setFocusable(false);
		btnPosicao1.setBounds(10, 111, 70, 70);
		frmJogoDaVelha.getContentPane().add(btnPosicao1);
		
		//----------------\\
		
		btnPosicao2 = new JButton("");
		btnPosicao2.setForeground(Color.BLACK);
		btnPosicao2.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPosicao2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (btnPosicao2.getText().isEmpty()) {
					btnPosicao2.setBackground(Color.GREEN);
				}else {
					btnPosicao2.setBackground(Color.RED);
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ficaNormal();
			}
		});
		btnPosicao2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnPosicao2.setText(sinal);
				btnPosicao2.setEnabled(false);
				btnPosicao2.setBackground(Color.LIGHT_GRAY);
				rodadas();
				alterarSinal();
				vencedor();
			}
		});
		btnPosicao2.setBackground(Color.LIGHT_GRAY);
		btnPosicao2.setFocusable(false);
		btnPosicao2.setBounds(90, 111, 70, 70);
		frmJogoDaVelha.getContentPane().add(btnPosicao2);
		
		//----------------\\
		
		btnPosicao3 = new JButton("");
		btnPosicao3.setForeground(Color.BLACK);
		btnPosicao3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (btnPosicao3.getText().isEmpty()) {
					btnPosicao3.setBackground(Color.GREEN);
				}else {
					btnPosicao3.setBackground(Color.RED);
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ficaNormal();
			}
		});
		btnPosicao3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPosicao3.setText(sinal);
				btnPosicao3.setEnabled(false);
				btnPosicao3.setBackground(Color.LIGHT_GRAY);
				rodadas();
				alterarSinal();
				vencedor();
			}
		});
		btnPosicao3.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPosicao3.setBackground(Color.LIGHT_GRAY);
		btnPosicao3.setFocusable(false);
		btnPosicao3.setBounds(170, 111, 70, 70);
		frmJogoDaVelha.getContentPane().add(btnPosicao3);
		
		//----------------\\
		
		btnPosicao4 = new JButton("");
		btnPosicao4.setForeground(Color.BLACK);
		btnPosicao4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (btnPosicao4.getText().isEmpty()) {
					btnPosicao4.setBackground(Color.GREEN);
				}else {
					btnPosicao4.setBackground(Color.RED);
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ficaNormal();
			}
		});
		btnPosicao4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPosicao4.setText(sinal);
				btnPosicao4.setEnabled(false);
				btnPosicao4.setBackground(Color.LIGHT_GRAY);
				rodadas();
				alterarSinal();
				vencedor();
			}
		});
		btnPosicao4.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPosicao4.setBackground(Color.LIGHT_GRAY);
		btnPosicao4.setFocusable(false);
		btnPosicao4.setBounds(10, 192, 70, 70);
		frmJogoDaVelha.getContentPane().add(btnPosicao4);
		
		//----------------\\
		
		btnPosicao5 = new JButton("");
		btnPosicao5.setForeground(Color.BLACK);
		btnPosicao5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (btnPosicao5.getText().isEmpty()) {
					btnPosicao5.setBackground(Color.GREEN);
				}else {
					btnPosicao5.setBackground(Color.RED);
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ficaNormal();
			}
		});
		btnPosicao5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPosicao5.setText(sinal);
				btnPosicao5.setEnabled(false);
				btnPosicao5.setBackground(Color.LIGHT_GRAY);
				rodadas();
				alterarSinal();
				vencedor();
			}
		});
		btnPosicao5.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPosicao5.setBackground(Color.LIGHT_GRAY);
		btnPosicao5.setFocusable(false);
		btnPosicao5.setBounds(90, 192, 70, 70);
		frmJogoDaVelha.getContentPane().add(btnPosicao5);
		
		//----------------\\
		
		btnPosicao6 = new JButton("");
		btnPosicao6.setForeground(Color.BLACK);
		btnPosicao6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (btnPosicao6.getText().isEmpty()) {
					btnPosicao6.setBackground(Color.GREEN);
				}else {
					btnPosicao6.setBackground(Color.RED);
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ficaNormal();
			}
		});
		btnPosicao6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPosicao6.setText(sinal);
				btnPosicao6.setEnabled(false);
				btnPosicao6.setBackground(Color.LIGHT_GRAY);
				rodadas();
				alterarSinal();
				vencedor();
			}
		});
		btnPosicao6.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPosicao6.setBackground(Color.LIGHT_GRAY);
		btnPosicao6.setFocusable(false);
		btnPosicao6.setBounds(170, 192, 70, 70);
		frmJogoDaVelha.getContentPane().add(btnPosicao6);
		
		//----------------\\
		
		btnPosicao7 = new JButton("");
		btnPosicao7.setForeground(Color.BLACK);
		btnPosicao7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (btnPosicao7.getText().isEmpty()) {
					btnPosicao7.setBackground(Color.GREEN);
				}else {
					btnPosicao7.setBackground(Color.RED);
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ficaNormal();
			}
		});
		btnPosicao7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPosicao7.setText(sinal);
				btnPosicao7.setEnabled(false);
				btnPosicao7.setBackground(Color.LIGHT_GRAY);
				rodadas();
				alterarSinal();
				vencedor();
			}
		});
		btnPosicao7.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPosicao7.setBackground(Color.LIGHT_GRAY);
		btnPosicao7.setFocusable(false);
		btnPosicao7.setBounds(10, 273, 70, 70);
		frmJogoDaVelha.getContentPane().add(btnPosicao7);
		
		//----------------\\
		
		btnPosicao8 = new JButton("");
		btnPosicao8.setForeground(Color.BLACK);
		btnPosicao8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (btnPosicao8.getText().isEmpty()) {
					btnPosicao8.setBackground(Color.GREEN);
				}else {
					btnPosicao8.setBackground(Color.RED);
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ficaNormal();
			}
		});
		btnPosicao8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPosicao8.setText(sinal);
				btnPosicao8.setEnabled(false);
				btnPosicao8.setBackground(Color.LIGHT_GRAY);
				rodadas();
				alterarSinal();
				vencedor();
			}
		});
		btnPosicao8.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPosicao8.setBackground(Color.LIGHT_GRAY);
		btnPosicao8.setFocusable(false);
		btnPosicao8.setBounds(90, 273, 70, 70);
		frmJogoDaVelha.getContentPane().add(btnPosicao8);
		
		//----------------\\
		
		btnPosicao9 = new JButton("");
		btnPosicao9.setForeground(Color.BLACK);
		btnPosicao9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (btnPosicao9.getText().isEmpty()) {
					btnPosicao9.setBackground(Color.GREEN);
				}else {
					btnPosicao9.setBackground(Color.RED);
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				ficaNormal();
			}
		});
		btnPosicao9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPosicao9.setText(sinal);
				btnPosicao9.setEnabled(false);
				btnPosicao9.setBackground(Color.LIGHT_GRAY);
				rodadas();
				alterarSinal();
				vencedor();
			}
		});
		btnPosicao9.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnPosicao9.setBackground(Color.LIGHT_GRAY);
		btnPosicao9.setFocusable(false);
		btnPosicao9.setBounds(170, 273, 70, 70);
		frmJogoDaVelha.getContentPane().add(btnPosicao9);
		
		//----------------\\
		
		btnMenu = new JButton("Menu");
		btnMenu.setFocusable(false);
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMenu.setBounds(140, 354, 100, 32);
		frmJogoDaVelha.getContentPane().add(btnMenu);
		
		lblNewLabel = new JLabel("Vez de:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 77, 130, 23);
		frmJogoDaVelha.getContentPane().add(lblNewLabel);
		
		lblVez = new JLabel("");
		lblVez.setForeground(Color.BLUE);
		lblVez.setHorizontalAlignment(SwingConstants.LEFT);
		lblVez.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblVez.setBounds(150, 77, 90, 23);
		frmJogoDaVelha.getContentPane().add(lblVez);
		frmJogoDaVelha.setResizable(false);
		frmJogoDaVelha.setLocationRelativeTo(null);
		
		//----------------\\
		
		sortearVez();
		alterarSinal();
	}
	
	//-------------------------------------------------------------\\
	
	public boolean ficaNormal() {
		boolean resposta = true;
		btnPosicao1.setBackground(Color.LIGHT_GRAY);
		btnPosicao2.setBackground(Color.LIGHT_GRAY);
		btnPosicao3.setBackground(Color.LIGHT_GRAY);
		btnPosicao4.setBackground(Color.LIGHT_GRAY);
		btnPosicao5.setBackground(Color.LIGHT_GRAY);
		btnPosicao6.setBackground(Color.LIGHT_GRAY);
		btnPosicao7.setBackground(Color.LIGHT_GRAY);
		btnPosicao8.setBackground(Color.LIGHT_GRAY);
		btnPosicao9.setBackground(Color.LIGHT_GRAY);
		return resposta;
	}
	
	//-------------------------------------------------------------\\
	
	public boolean rodadas() {
		boolean resposta = true;
		if (sinal == "X") {
			sinal = "O";
		}else {
			sinal = "X";
		}
		return resposta;
	}
	
	//-------------------------------------------------------------\\
	
	public boolean vencedor() {
		boolean resposta = true;
		String p1 = btnPosicao1.getText().toString();
		String p2 = btnPosicao2.getText().toString();
		String p3 = btnPosicao3.getText().toString();
		String p4 = btnPosicao4.getText().toString();
		String p5 = btnPosicao5.getText().toString();
		String p6 = btnPosicao6.getText().toString();
		String p7 = btnPosicao7.getText().toString();
		String p8 = btnPosicao8.getText().toString();
		String p9 = btnPosicao9.getText().toString();
		
		//----------------\\
		
		if (p1=="X" && p2=="X" && p3=="X") {
			vencedor = "X";
			Vencedor.main(null);
			frmJogoDaVelha.dispose();
		}
		if (p4=="X" && p5=="X" && p6=="X") {
			vencedor = "X";
			Vencedor.main(null);
			frmJogoDaVelha.dispose();
		}
		if (p7=="X" && p8=="X" && p9=="X") {
			vencedor = "X";
			Vencedor.main(null);
			frmJogoDaVelha.dispose();
		}
		if (p1=="X" && p4=="X" && p7=="X") {
			vencedor = "X";
			Vencedor.main(null);
			frmJogoDaVelha.dispose();
		}
		if (p2=="X" && p5=="X" && p8=="X") {
			vencedor = "X";
			Vencedor.main(null);
			frmJogoDaVelha.dispose();
		}
		if (p3=="X" && p6=="X" && p9=="X") {
			vencedor = "X";
			Vencedor.main(null);
			frmJogoDaVelha.dispose();
		}
		if (p1=="X" && p5=="X" && p9=="X") {
			vencedor = "X";
			Vencedor.main(null);
			frmJogoDaVelha.dispose();
		}
		if (p3=="X" && p5=="X" && p7=="X") {
			vencedor = "X";
			Vencedor.main(null);
			frmJogoDaVelha.dispose();
		}
		
		//----------------\\
		
		if (p1=="O" && p2=="O" && p3=="O") {
			vencedor = "O";
			Vencedor.main(null);
			frmJogoDaVelha.dispose();
		}
		if (p4=="O" && p5=="O" && p6=="O") {
			vencedor = "O";
			Vencedor.main(null);
			frmJogoDaVelha.dispose();
		}
		if (p7=="O" && p8=="O" && p9=="O") {
			vencedor = "O";
			Vencedor.main(null);
			frmJogoDaVelha.dispose();
		}
		if (p1=="O" && p4=="O" && p7=="O") {
			vencedor = "O";
			Vencedor.main(null);
			frmJogoDaVelha.dispose();
		}
		if (p2=="O" && p5=="O" && p8=="O") {
			vencedor = "O";
			Vencedor.main(null);
			frmJogoDaVelha.dispose();
		}
		if (p3=="O" && p6=="O" && p9=="O") {
			vencedor = "O";
			Vencedor.main(null);
			frmJogoDaVelha.dispose();
		}
		if (p1=="O" && p5=="O" && p9=="O") {
			vencedor = "O";
			Vencedor.main(null);
			frmJogoDaVelha.dispose();
		}
		if (p3=="O" && p5=="O" && p7=="O") {
			vencedor = "O";
			Vencedor.main(null);
			frmJogoDaVelha.dispose();
		}
		
		//----------------\\
		
		if (!(p1.isEmpty())) {
			if (!(p2.isEmpty())) {
				if (!(p3.isEmpty())) {
					if (!(p4.isEmpty())) {
						if (!(p5.isEmpty())) {
							if (!(p6.isEmpty())) {
								if (!(p7.isEmpty())) {
									if (!(p8.isEmpty())) {
										if (!(p9.isEmpty())) {
											vencedor = "Empate";
											Vencedor.main(null);
											frmJogoDaVelha.dispose();
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		//----------------\\
		
		return resposta;
	}
	
	//-------------------------------------------------------------\\
	
	public boolean sortearVez() {
		boolean resposta = true;
		int sinalSorteado;
		Random r = new Random();
		sinalSorteado = r.nextInt(2)+1;
		if (sinalSorteado == 1) {
			sinal = "X";
		}else {
			sinal = "O";
		}
		return resposta;
	}
	
	//-------------------------------------------------------------\\
	
	public boolean alterarSinal() {
		boolean resposta = true;
		if (sinal == "X") {
			lblVez.setText(sinal);
		}else {
			lblVez.setText(sinal);
		}
		return resposta;
	}
}
