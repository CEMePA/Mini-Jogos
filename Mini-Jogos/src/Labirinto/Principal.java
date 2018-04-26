package Labirinto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal {

	private JFrame frmLabirinto;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel;
	private JTextField txtComeco;
	private JTextField txtChegada;
	private JPanel panel_5;
	private JPanel panel_6;
	private JLabel lblNewLabel;
	private JLabel lblTempo;
	int x = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frmLabirinto.setVisible(true);
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
		frmLabirinto = new JFrame();
		frmLabirinto.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent arg0) {
				perdeu();
			}
		});
		frmLabirinto.getContentPane().setBackground(SystemColor.activeCaption);
		frmLabirinto.setTitle("Labirinto");
		frmLabirinto.setBounds(100, 100, 450, 300);
		frmLabirinto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLabirinto.getContentPane().setLayout(null);
		
		txtComeco = new JTextField();
		txtComeco.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				x = 1;
				txtComeco.setBackground(new Color(30, 144, 255));
				txtComeco.setEnabled(false);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				if (txtComeco.isEnabled()) {
					txtComeco.setBackground(new Color(0,51,153));
				}
			}
		});
		txtComeco.setToolTipText("Clique para come\u00E7ar");
		txtComeco.setEditable(false);
		txtComeco.setFocusable(false);
		txtComeco.setHorizontalAlignment(SwingConstants.CENTER);
		txtComeco.setForeground(Color.WHITE);
		txtComeco.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtComeco.setBackground(new Color(30, 144, 255));
		txtComeco.setText("COME\u00C7O");
		txtComeco.setBounds(10, 111, 76, 55);
		frmLabirinto.getContentPane().add(txtComeco);
		txtComeco.setColumns(10);
		
		panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				perdeu();
			}
		});
		
		txtChegada = new JTextField();
		txtChegada.setBounds(316, 206, 86, 55);
		frmLabirinto.getContentPane().add(txtChegada);
		txtChegada.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if (x == 1) {
					JOptionPane.showMessageDialog(null, "Você ganhou!");
					txtComeco.setEnabled(true);
					x = 0;
				}
			}
		});
		txtChegada.setText("CHEGADA");
		txtChegada.setHorizontalAlignment(SwingConstants.CENTER);
		txtChegada.setForeground(Color.WHITE);
		txtChegada.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtChegada.setFocusable(false);
		txtChegada.setEditable(false);
		txtChegada.setColumns(10);
		txtChegada.setBackground(new Color(50, 205, 50));
		panel.setBounds(0, 0, 225, 136);
		frmLabirinto.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("Tempo:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 54, 19);
		panel.add(lblNewLabel);
		
		lblTempo = new JLabel("30.00");
		lblTempo.setForeground(Color.RED);
		lblTempo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTempo.setBounds(74, 11, 68, 19);
		panel.add(lblTempo);
		
		//========================\\
		
		panel_1 = new JPanel();
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				perdeu();
			}
		});
		panel_1.setLayout(null);
		panel_1.setBounds(0, 147, 355, 125);
		frmLabirinto.getContentPane().add(panel_1);
		
		//========================\\
		
		panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				perdeu();
			}
		});
		panel_2.setLayout(null);
		panel_2.setBounds(365, 0, 79, 272);
		frmLabirinto.getContentPane().add(panel_2);
		
		//========================\\
		
		panel_3 = new JPanel();
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				perdeu();
			}
		});
		panel_3.setLayout(null);
		panel_3.setBounds(205, 0, 173, 46);
		frmLabirinto.getContentPane().add(panel_3);
		
		//========================\\
		
		panel_4 = new JPanel();
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				perdeu();
			}
		});
		panel_4.setLayout(null);
		panel_4.setBounds(235, 57, 120, 97);
		frmLabirinto.getContentPane().add(panel_4);
		
		//========================\\
		
		panel_5 = new JPanel();
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				perdeu();
			}
		});
		panel_5.setLayout(null);
		panel_5.setBounds(0, 104, 27, 68);
		frmLabirinto.getContentPane().add(panel_5);
		
		panel_6 = new JPanel();
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				perdeu();
			}
		});
		panel_6.setLayout(null);
		panel_6.setBounds(324, 244, 76, 28);
		frmLabirinto.getContentPane().add(panel_6);
		frmLabirinto.setResizable(false);
		frmLabirinto.setLocationRelativeTo(null);
	}
	
	//========================\\
	
	public boolean perdeu() {
		boolean resposta = true;
		if(x == 1) {
			JOptionPane.showMessageDialog(null, "Você perdeu!");
			txtComeco.setEnabled(true);
			x = 0;
		}
		return resposta;
	}
	
}
