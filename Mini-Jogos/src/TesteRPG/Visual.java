package TesteRPG;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

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
	int socao = 10;
	int chapuletada = 15;
	int bica = 20;
	int voadora = 25;
	

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
		frame.setBounds(100, 100, 657, 608);
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
		
		btnSoco = new JButton("Soc\u00E3o");
		btnSoco.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSoco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rodada == 0) {
					vida2 = vida2 - socao;
				}else {
					vida1 = vida1 - socao;
				}
				mudarVida();
				mudarVez();
			}
		});
		btnSoco.setBounds(167, 475, 203, 41);
		frame.getContentPane().add(btnSoco);
		
		btnChapuletada = new JButton("Chapuletada");
		btnChapuletada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rodada == 0) {
					vida2 = vida2 - chapuletada;
				}else {
					vida1 = vida1 - chapuletada;
				}
				mudarVida();
				mudarVez();
			}
		});
		btnChapuletada.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnChapuletada.setBounds(387, 475, 203, 41);
		frame.getContentPane().add(btnChapuletada);
		
		btnBica = new JButton("Bica");
		btnBica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rodada == 0) {
					vida2 = vida2 - bica;
				}else {
					vida1 = vida1 - bica;
				}
				mudarVida();
				mudarVez();
			}
		});
		btnBica.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBica.setBounds(167, 527, 203, 41);
		frame.getContentPane().add(btnBica);
		
		btnVoadora = new JButton("Voadora de 2 p\u00E9");
		btnVoadora.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rodada == 0) {
					vida2 = vida2 - voadora;
				}else {
					vida1 = vida1 - voadora;
				}
				mudarVida();
				mudarVez();
			}
		});
		btnVoadora.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnVoadora.setBounds(387, 527, 203, 41);
		frame.getContentPane().add(btnVoadora);
		
		lblVez = new JLabel("Vez de: ");
		lblVez.setHorizontalAlignment(SwingConstants.CENTER);
		lblVez.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblVez.setBounds(10, 11, 631, 41);
		frame.getContentPane().add(lblVez);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 115, 241, 349);
		frame.getContentPane().add(lblNewLabel);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		sortearVez();
	}
	
	public boolean sortearVez() {
		boolean resposta = true;
		Random r = new Random();
		rodada = r.nextInt(2);
		if(rodada == 0) {
			lblVez.setText("Vez de: Esquerdo");
		}else {
			lblVez.setText("Vez de: Direito");
		}
		return resposta;
	}
	
	public boolean mudarVez() {
		boolean resposta = true;
		if (rodada == 0) {
			lblVez.setText("Vez de: Direito");
			rodada = 1;
		}else {
			lblVez.setText("Vez de: Esquerdo");
			rodada = 0;
		}
		return resposta;
	}
	
	public boolean mudarVida() {
		boolean resposta = true;
		if (vida1 <= 0) {
			lblVida1.setText("0 / 100");
			JOptionPane.showMessageDialog(null, "Direito ganhou!");
		}
		if (vida2 <= 0) {
			lblVida2.setText("0 / 100");
			JOptionPane.showMessageDialog(null, "Esquerdo ganhou!");
			
		}else {
			lblVida1.setText(String.valueOf(vida1) + " / 100");
			lblVida2.setText(String.valueOf(vida2) + " / 100");
		}
		return resposta;
	}
}
