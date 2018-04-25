package RPG;

import java.util.Random;
import java.util.Scanner;

public class motorRPG {
	static int play = 1;
	static int level =0;//nivel do jogo

	public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in); 
		
		do {
			int turn=0;
			if(turn==0) {
				System.out.println("Welcome to RPG Test!");
				System.out.println("Your fight will now begin!");
				turn = 1;
			}
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			battle();
			
			System.out.println("Want to play again? (1) Yes (2) No");
			play = scanf.nextInt();
		}while(play==1);
		while(play==2) {
			System.out.println("Thanks for Playing!");
			break;
		}
	}
	
	static int userAttack() {
			Scanner scanf = new Scanner(System.in);
			System.out.println("Choose Your Attack:");
			System.out.println("(1) - Slap");
			System.out.println("(2) - Punch");
			System.out.println("(3) - Kick");
			System.out.println("(4) - Special Attack");
			return scanf.nextInt();
	}
	
	static int cpuAttack() {
		Random cpuAttackGenerator = new Random();
		return cpuAttackGenerator.nextInt(4)+1; //returns a number from 1 to 4
	}
	
	static void showStats(int lifeUser, int lifeCpu, int specialCountUser, int specialCountCpu) {
		System.out.println("====================");
		System.out.println("- Your Hp: "+lifeUser);
		System.out.println("- Your SP: "+specialCountUser);
		System.out.println("--------------------");
		System.out.println("- CPU's Hp: "+lifeCpu);
		System.out.println("- CPU's SP: "+specialCountCpu);
		System.out.println("====================");
	}
	
	static void battle() {
		//declaração das variasveis
		int lifeUser = 100;
		int specialCountUser = 3;
		int lifeCpu = 100;
		int specialCountCpu = 2;
		int chooseAttack;
		int attack;
		//fim variaveis
		
		Random useSpecialAttack = new Random();
		while(lifeUser>0 && lifeCpu>0) {
			showStats(lifeUser, lifeCpu, specialCountUser, specialCountCpu);
			attack = useSpecialAttack.nextInt(10)+1; //number from 1 to 10
			chooseAttack = userAttack();
			if(attack>=1 && attack<=9) {
				switch(chooseAttack) {
					case 1: System.out.println("User Slapped CPU"); lifeCpu -= 7; break;
					case 2: System.out.println("User Punched CPU"); lifeCpu -= 10; break;
					case 3: System.out.println("User Kicked CPU"); lifeCpu -= 15; break;
					case 4: if(specialCountUser>0) {
								System.out.println("User used a Special Attack on CPU"); lifeCpu -= 20; specialCountUser--; break;
							}else {
								System.out.println("User failed to use a Special Attack"); break;
							}
					default: System.out.println("Invalid Option"); break;
				}
			}else {
				System.out.println("User missed");
			}
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(lifeCpu > 0) {
				Random error = new Random();
				int ataque = error.nextInt(10)+1;// de 1 a 10
				if(ataque>=1 && ataque<=9) {
				chooseAttack = cpuAttack();
				switch (chooseAttack) {//inicio switch
					case 1: System.out.println("CPU Slapped User"); lifeUser -= 7 + level; break;
					case 2: System.out.println("CPU Punched User"); lifeUser -= 10 + level; break;
					case 3: System.out.println("CPU Kicked User"); lifeUser -= 15 + level; break;
					case 4: if(specialCountCpu>0) {
						 		System.out.println("CPU used a Special Attack on User"); lifeUser -= 20 + level; specialCountCpu--; break;
						 	}else {
						 		System.out.println("CPU Kicked User"); lifeUser -= 15 + level; break;
						 	}
				}//fim switch
			}else {
				System.out.println("CPU missed");
		}
			}else{
				System.out.println("CPU has been defeated");
				level++;
				break;
				
			}if(lifeUser<=0) {System.out.println("User has been defeated!");}
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}                                                                                                                                                                                                                                                                                                                                                                                                                         
} 