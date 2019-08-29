package lesson.ten;
import java.util.Arrays;


public class MonsterTwo {
	    
		static char[][] battleBoard = new char[10][10];
		
		//print two dimensional array of stars
		public static void builtBattleBoard() {
			for(char[] row: battleBoard) {
				Arrays.fill(row, '*');
			}
		}
		
		//redraw the board
		public static void redrawBoard() {
			int k = 1;
			while(k<=30){ System.out.print('-'); k++;}
			System.out.println();
			
			for(int i=0;i<battleBoard.length; i++) {
				for(int j=0; j<battleBoard.length; j++) {
					System.out.print("|" + battleBoard[i][j]+ "|");
				}
				System.out.println();
			}
			
			while(k<=30){ System.out.print('-'); k++;}
			System.out.println();
		  }
		
		public final String TOMBSTONE = "HERE LIES A DEAD MONSTER";

		private int health = 500;
		private int attack = 20;
		private int movement = 2;
	    private boolean alive = true;

		public String name = "Big Monster";
		public char nameChar1 = 'B';
		public int xPosition = 0;
		public int yPostion = 0;
		public int numOfMonsters = 0;

		public int getHealth() {
			return health;
		}

		public int getAttack() {
			return attack;
		}

		public int getMovement() {
			return movement;
		}
	    
		public boolean getAlive() {
			return alive;
		}

		public void setHealth(int decreaseHealth) {
			health = health - decreaseHealth;
			if (health < 0) {
				alive = false;
			}
		}

		public MonsterTwo(int newHealth, int newAttack, int newMovement, String name) {
			this.health = newHealth;
			this.attack = newAttack;
			this.movement = newMovement;
			this.name = name;

			int maxXBoardSpace = battleBoard.length - 1;
			int maxYBoardSpace = battleBoard[0].length - 1;

			int randomNumX, randomNumY;

			do {
				randomNumX = (int) (Math.random() * maxXBoardSpace);
				randomNumY = (int) (Math.random() * maxYBoardSpace);
			} while (battleBoard[randomNumX][randomNumY] != '*');
			
			this.xPosition = randomNumX;
			this.yPostion = randomNumY;
			this.nameChar1 = this.name.charAt(0);
			battleBoard[this.yPostion][this.xPosition] = this.nameChar1;
			
			numOfMonsters++;
		}

		// Default Constructor
		public MonsterTwo() {
		}

		public static void main(String[] args) {
		
			
	      
		}	

}
