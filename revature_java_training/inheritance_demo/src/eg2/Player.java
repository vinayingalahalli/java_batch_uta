package eg2;

public class Player extends Person { //is-a relationship

	private String teamName;
	private long score;
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public Player(int id, String name, String teamName, long score) {
		super(id, name);
		this.teamName = teamName;
		this.score = score;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public long getScore() {
		return score;
	}
	public void setScore(long score) {
		this.score = score;
	}
	
	public void printPlayer() {
		System.out.println("Printing Player");
		super.printPerson();
		System.out.println("TeamName :"+teamName);
		System.out.println("Score : "+score);
	}
}
