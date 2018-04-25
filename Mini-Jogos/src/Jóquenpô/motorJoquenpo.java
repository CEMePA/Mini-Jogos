package Jóquenpô;

import java.awt.Color;
import java.awt.EventQueue;
import java.nio.channels.ShutdownChannelGroupException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class motorJoquenpo {

private JFrame frmRPS;
int escolha = 0;
int winsCpu = 0;
int winsUser = 0;
int ties = 0;
int round = 1;

String log = " Bem-Vindo ao Jokenpô\n "+showStandings(winsCpu, winsUser, ties, round);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					motorJoquenpo window = new motorJoquenpo();
					window.frmRPS.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		game();
		
	}

	/**
	 * Create the application.
	 */
	public motorJoquenpo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		frmRPS = new JFrame();
		frmRPS.setTitle("Mini Games - J\u00F3quenp\u00F4");
		frmRPS.setBounds(100, 100, 313, 354);
		frmRPS.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmRPS.setLocationRelativeTo(null);
		frmRPS.setResizable(false);
		frmRPS.getContentPane().setLayout(null);
		
		JButton btnPedra = new JButton("Pedra");
		btnPedra.setBackground(Color.LIGHT_GRAY);
		btnPedra.setFocusable(false);
		btnPedra.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnPedra.setBounds(10, 201, 89, 79);
		frmRPS.getContentPane().add(btnPedra);
		btnPedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				escolha = 1;
				log = log+"\nJO";
				try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
				log = log+"KEN";
				try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
				log = log+"PÔ";
			}
		});
		
		JButton btnPapel = new JButton("Papel");
		btnPapel.setBackground(Color.LIGHT_GRAY);
		btnPapel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnPapel.setFocusable(false);
		btnPapel.setBounds(109, 201, 89, 79);
		frmRPS.getContentPane().add(btnPapel);
		
		JButton btnTesoura = new JButton("Tesoura");
		btnTesoura.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnTesoura.setBackground(Color.LIGHT_GRAY);
		btnTesoura.setFocusable(false);
		btnTesoura.setBounds(208, 201, 89, 79);
		frmRPS.getContentPane().add(btnTesoura);
		
		JButton btnMenu = new JButton("Menu");
		btnMenu.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnMenu.setBackground(Color.LIGHT_GRAY);
		btnMenu.setFocusable(false);
		btnMenu.setBounds(10, 291, 287, 24);
		frmRPS.getContentPane().add(btnMenu);
		
		JTextPane tpLog = new JTextPane();
		tpLog.setForeground(Color.BLACK);
		tpLog.setBackground(Color.LIGHT_GRAY);
		tpLog.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		tpLog.setFocusable(false);
		tpLog.setEditable(false);
		tpLog.setText(log);
		tpLog.setBounds(10, 11, 287, 179);
		frmRPS.getContentPane().add(tpLog);

	}
		
		//Picks CPU's Move
		static int cpuPick(){
			Random cpuPickGenerator = new Random();
			return cpuPickGenerator.nextInt(3)+1; //1 to 3
		}
		
		//Shows Game Information
		static String showStandings(int winsCpu, int winsUser, int ties, int round) {
			String standing = "\n\n Your Wins: "+winsUser
					+"\n CPU Wins: "+winsCpu
					+"\n Ties: "+ties
					+"\n Round: "+round+"\n";
			return standing;
		}
		
		static int playAgain() {
			//Continue Condition
			System.out.println("Would you like to play again? (1)Yes (2)No");
			Scanner scanf = new Scanner(System.in);
			return scanf.nextInt();
		}
		
		//Executes Game
		static void game() {
			
			//Continue Condition Variable
			int play = 1;
			
			do {
				
				//Game Variables
				int winsUser = 0;
				int winsCpu = 0;
				int ties = 0;
				int round = 1;
				int x; //User's Choice
				int y; //CPU's Choice
				
				//Game
				while(winsUser<5 && winsCpu<5) {
					try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }
					showStandings(winsCpu, winsUser, ties, round); 
					x = userPick();
					y = cpuPick();
				
					//Declaration
					System.out.println("\nRock!");
					try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
					System.out.println("Paper!");
					try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
					System.out.println("Scissors!\n");
					try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
					round++;
				
					//User Picked Rock
					if((x==1  || x%3==1) && y==1) {
						System.out.println("User and CPU both picked Rock: Tie");
						ties++;
						continue;
					}
					if((x==1  || x%3==1) && y==2) {
						System.out.println("User picked Rock and CPU picked Paper: CPU Wins");
						winsCpu++;
						continue;
					}
					if((x==1  || x%3==1) && y==3) {
						System.out.println("User picked Rock and CPU picked Scissors: User Wins");
						winsUser++;
						continue;
					}

					//User Picked Paper
					if((x==2  || x%3==2) && y==1) {
						System.out.println("User picked Paper and CPU picked Rock: User Wins");
						winsUser++;
						continue;
					}
					if((x==2  || x%3==2) && y==2) {
						System.out.println("User and CPU both picked Paper: Tie");
						ties++;
						continue;
					}
					if((x==2  || x%3==2) && y==3) {
						System.out.println("User picked Paper and CPU picked Scissors: CPU Wins");
						winsCpu++;
						continue;
					}
				
					//User Picked Scissors
					if((x==3  || x%3==0) && y==1) {
						System.out.println("User picked Scissors and CPU picked Rock: CPU Wins");
						winsCpu++;
						continue;
					}
					if((x==3  || x%3==0) && y==2) {
						System.out.println("User picked Scissors and CPU picked Paper: User Wins");
						winsUser++;
						continue;
					}
					if((x==3  || x%3==0) && y==3) {
						System.out.println("User and CPU both picked Scissors: Tie");
						ties++;
						continue;
					}	
					
				}
				
				try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
				
				//User Won
				if(winsUser==5) {
					System.out.println("\nCongratulations! You Won!");
				}
				
				//CPU Won
				if(winsCpu==5) {
					System.out.println("\nYou Lost! Better Luck Next Time");
				}
				
				try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
				
				playAgain();
				
			//Game Condition	
			}while(play==1);
			
			//Credits
			System.out.println("\nThanks for Playing!\nBy: Jeremias Monteiro Oliveira");
			
		}
		
		static String declaration1() {
			return "JO";
		}
		
		static String declaration2() {
			return "KEN";
		}
		
		static String declaration3() {
			return "PÔ!";
		}
		
}
