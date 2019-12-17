package eg3;

public class Player extends Person { //is-a relationship

	private Team team; //has-a relationship(composition/association)
	private long score;
	public Player() {
		// TODO Auto-generated constructor stub
	}
	
	public Player(int id, String name, Team team, long score) {
		super(id, name);
		this.team = team;
		this.score = score;
	}

	public void printPlayer() {
		System.out.println("Printing Player");
		super.printPerson();
		team.printTeam();
		System.out.println("Score : "+score);
	}
}
