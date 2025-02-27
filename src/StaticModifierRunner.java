class Player {
    private String name;
	private static int count;
	
	public Player(String name) {
		super();
		this.name = name;
		count++;
	}

	static public int getCount() {
		return count;
	}
	
	
	
}


public class StaticModifierRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player player1 = new Player("Ronaldo");
		System.out.println(Player.getCount());
		Player player2 = new Player("Federar");
		
		System.out.println(Player.getCount());
		

	}

}
