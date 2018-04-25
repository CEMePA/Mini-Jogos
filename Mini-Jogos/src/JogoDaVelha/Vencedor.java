package JogoDaVelha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vencedor {

	private JFrame frmJogoDaVelha;
	private JButton btnNewButton;
	private JButton btnMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vencedor window = new Vencedor();
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
	public Vencedor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Principal obj = new Principal(); 
		
		frmJogoDaVelha = new JFrame();
		frmJogoDaVelha.setTitle("Jogo da Velha");
		frmJogoDaVelha.setBounds(100, 100, 250, 160);
		frmJogoDaVelha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJogoDaVelha.getContentPane().setLayout(null);
		
		JLabel lblVencedor = new JLabel("O vencedor \u00E9 !");
		lblVencedor.setHorizontalAlignment(SwingConstants.CENTER);
		lblVencedor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVencedor.setBounds(10, 11, 224, 67);
		frmJogoDaVelha.getContentPane().add(lblVencedor);
		
		btnNewButton = new JButton("Jogar");
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmJogoDaVelha.dispose();
				Principal.main(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(10, 89, 100, 32);
		frmJogoDaVelha.getContentPane().add(btnNewButton);
		
		btnMenu = new JButton("Menu");
		btnMenu.setFocusable(false);
		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMenu.setBounds(134, 89, 100, 32);
		frmJogoDaVelha.getContentPane().add(btnMenu);
		frmJogoDaVelha.setLocationRelativeTo(null);
		frmJogoDaVelha.setResizable(false);
		
		if (obj.vencedor == "Empate") {
			lblVencedor.setText("Deu velha!");
		}else {
			lblVencedor.setText("O vencedor é "+obj.vencedor+"!");
		}
	}
}
