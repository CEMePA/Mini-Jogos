package TesteRPG;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Visual {

	private JFrame frame;
	private JLabel lblVida1;
	private JLabel lblVida2;
	private JButton btnSoco;
	private JButton btnChapuletada;
	private JButton btnBica;
	private JButton btnVoadora;
	private JLabel lblVez;
	int vida1 = 100;
	int vida2 = 100;
	int rodada = 0;
	int socao = 7;
	int chapuletada = 15;
	int bica = 20;
	int voadora = 25;
	int cowlOn = 0; 
	int x;
	public JLabel lblExplosion1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Visual window = new Visual();
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
	public Visual() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 657, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblVida1 = new JLabel(vida1 + " / 100");
		lblVida1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblVida1.setHorizontalAlignment(SwingConstants.CENTER);
		lblVida1.setBounds(10, 63, 307, 41);
		frame.getContentPane().add(lblVida1);
		
		lblVida2 = new JLabel(vida2 + " / 100");
		lblVida2.setHorizontalAlignment(SwingConstants.CENTER);
		lblVida2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblVida2.setBounds(334, 63, 307, 41);
		frame.getContentPane().add(lblVida2);
		
		btnSoco = new JButton("Smash");
		btnSoco.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSoco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rodada == 0) {
					smash();
				}else {
					Random r = new Random();
					int i = r.nextInt(10)+1;
					if(i>2) {
						vida1 = vida1 - socao;
					}else if(i==2) {
						vida1 -= 10;
					}else {
						JOptionPane.showMessageDialog(null, "Bakugo Errou");
					}
				}
				mudarVida();
				mudarVez();
			}
		});
		btnSoco.setBounds(10, 364, 203, 41);
		frame.getContentPane().add(btnSoco);
		
		btnChapuletada = new JButton("Delaware");
		btnChapuletada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rodada == 0) {
					delaware();
					//attackAnimation();
				}else {
					Random r = new Random();
					int i = r.nextInt(10)+1;
					if(i>3) {
						vida1 = vida1 - chapuletada;
						//vida2 = vida2 - chapuletada;
						//attackAnimation();
					}else if(i==3) {
						vida1 -= 12;
					}else {
						JOptionPane.showMessageDialog(null, "Bakugo Errou");
					}
				}
				mudarVida();
				mudarVez();
			}
		});
		btnChapuletada.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChapuletada.setBounds(223, 364, 203, 41);
		frame.getContentPane().add(btnChapuletada);
		
		btnBica = new JButton("Full Cowl");
		btnBica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(cowlOn == 1 && rodada == 0) {
					btnBica.setBackground(Color.RED);
				}if(cowlOn == 0 && rodada == 0){
					btnBica.setBackground(Color.GREEN);
				}else if(rodada == 1) {
					btnBica.setBackground(UIManager.getColor("Button.background"));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBica.setBackground(UIManager.getColor("Button.background"));
			}
		});
		btnBica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rodada == 0) {
					if(cowlOn == 0) {
						cowlOn = 1;
					}else {
						cowlOn = 0;
					}
				}else {
					Random r = new Random();
					int i = r.nextInt(10)+1;
					if(i>4) {
						vida1 = vida1 - bica;
					}else if(i==4) {
						vida1 -= 22;
					}else {
						JOptionPane.showMessageDialog(null, "Bakugo Errou");
					}
					
				}
				mudarVida();
				mudarVez();
			}
		});
		btnBica.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBica.setBounds(10, 416, 203, 41);
		frame.getContentPane().add(btnBica);
		
		btnVoadora = new JButton("Detroit");
		btnVoadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rodada == 0) {
					detroit();
				}else {
					Random r = new Random();
					int i = r.nextInt(10)+1;
					if(i>5) {
						vida1 = vida1 - voadora;
					}else if(i==5) {
						vida1 -= 26;
					}else {
						JOptionPane.showMessageDialog(null, "Bakugo Errou");
					}
					
				}
				mudarVida();
				mudarVez();
			}
		});
		btnVoadora.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnVoadora.setBounds(223, 416, 203, 41);
		frame.getContentPane().add(btnVoadora);
		
		lblVez = new JLabel("Vez de: ");
		lblVez.setHorizontalAlignment(SwingConstants.CENTER);
		lblVez.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblVez.setBounds(10, 11, 631, 41);
		frame.getContentPane().add(lblVez);
		
		JLabel lblIzuku = new JLabel("");
		lblIzuku.setVerticalAlignment(SwingConstants.TOP);
		lblIzuku.setIcon(new ImageIcon(Visual.class.getResource("/Imgs/Student Imgs/ClassA imgs/Izuku Imgs/izk_1c3.png")));
		lblIzuku.setBounds(51, 115, 241, 220);
		frame.getContentPane().add(lblIzuku);
		
		JLabel lblBakugo = new JLabel("");
		lblBakugo.setIcon(new ImageIcon(Visual.class.getResource("/Imgs/Student Imgs/ClassA imgs/Bakugo Imgs/bkg_pos_c.png")));
		lblBakugo.setVerticalAlignment(SwingConstants.TOP);
		lblBakugo.setBounds(355, 115, 241, 220);
		frame.getContentPane().add(lblBakugo);
		
		JLabel lblExplosion1 = new JLabel("");
		lblExplosion1.setVisible(false);
		lblExplosion1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblExplosion1.setIcon(new ImageIcon("C:\\Users\\User\\Desktop\\explosion2.2.gif"));
		lblExplosion1.setBounds(148, 85, 348, 250);
		frame.getContentPane().add(lblExplosion1);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		sortearVez();
	}
	
	public int sortearVez() {
		Random r = new Random();
		rodada = r.nextInt(2);
		if(rodada == 0) {
			lblVez.setText("Vez de: Izuku");
			btnSoco.setText("Smash");
			btnChapuletada.setText("Delaware Smash");
			btnBica.setText("Full Cowl");
			btnVoadora.setText("Detroit Smash");
		}else {
			lblVez.setText("Vez de: Bakugo");
			btnSoco.setText("Punch");
			btnChapuletada.setText("Blast");
			btnBica.setText("AP Shot");
			btnVoadora.setText("Howitzer Blast");
		}
		return rodada;
	}
	
	public int mudarVez() {
		if (rodada == 0) {
			lblVez.setText("Vez de: Direito");
			rodada = 1;
			btnSoco.setText("Punch");
			btnChapuletada.setText("Blast");
			btnBica.setText("AP Shot");
			btnVoadora.setText("Howitzer Blast");
		}else {
			lblVez.setText("Vez de: Esquerdo");
			rodada = 0;
			btnSoco.setText("Smash");
			btnChapuletada.setText("Delaware Smash");
			btnBica.setText("Full Cowl");
			btnVoadora.setText("Detroit Smash");
		}
		return rodada;
	}
	
	public void mudarVida() {
		if (vida1 <= 0) {
			lblVida1.setText("0 / 100");
			JOptionPane.showMessageDialog(null, "Bakugo ganhou!");
			int dnv = JOptionPane.showConfirmDialog(null, "Deseja Jogar De Novo?", "Saída", JOptionPane.YES_NO_OPTION);
			if(dnv == JOptionPane.YES_OPTION) {
				vida1 = 100;
				vida2 = 100;
				cowlOn = 0;
				sortearVez();
				lblVida1.setText(String.valueOf(vida1) + " / 100");
				lblVida2.setText(String.valueOf(vida2) + " / 100");
			}else {
				frame.dispose();
			}
		}
		if (vida2 <= 0) {
			lblVida2.setText("0 / 100");
			JOptionPane.showMessageDialog(null, "Izuku ganhou!");
			int dnv = JOptionPane.showConfirmDialog(null, "Deseja Jogar De Novo?", "Saída", JOptionPane.YES_NO_OPTION);
			if(dnv == JOptionPane.YES_OPTION) {
				vida1 = 100;
				vida2 = 100;
				cowlOn = 0;
				rodada = 0;
				sortearVez();
				lblVida1.setText(String.valueOf(vida1) + " / 100");
				lblVida2.setText(String.valueOf(vida2) + " / 100");
			}else {
				frame.dispose();
			}
		}else {
			lblVida1.setText(String.valueOf(vida1) + " / 100");
			lblVida2.setText(String.valueOf(vida2) + " / 100");
		}
	}
	
	/*public void attackAnimation() {
		lblExplosion1.setVisible(true);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lblExplosion1.setVisible(false);
	}*/
	
	public void fullCowlOn() {
		cowlOn = 1; 
	}
	
	public void fullCowlOff() {
		cowlOn = 0;
	}
	
	public void smash() {
		Random r = new Random();
		int i = r.nextInt(10)+1;
		if(cowlOn == 1) {
			vida2 -= 10;
		}else {
			if(i>2) {
				vida1 -= 5;
				vida2 -= 15;
			}else if(i==2) {
				vida1 -= 5;
				vida2 -= 18;
			}else {
				JOptionPane.showMessageDialog(null, "Izuku Errou");
			}
		}
		
	}
	
	public void delaware() {
		Random r = new Random();
		int i = r.nextInt(10)+1;
		if(cowlOn == 1) {
			vida2 -= 7;
		}else {
			if(i>1) {
				vida1 -= 5;
				vida2 -= 10;
			}else if(i==1) {
				vida1 -= 5;
				vida2 -= 13;
			}
		}
	}
	
	public void detroit() {
		Random r = new Random();
		int i = r.nextInt(10)+1;
		if(cowlOn == 1) {
			vida2 -= 15;
		}else {
			if(i>3) {
				vida1 -= 10;
				vida2 -= 20;
			}else if(i==3) {
				vida1 -= 10;
				vida2 -= 23;
			}else {
				JOptionPane.showMessageDialog(null, "Izuku Errou");
			}
			
		}
	}
	
}
