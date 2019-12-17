package eg3;

public class Team {

	private int teamId;
	private String coachName;
	private String teamName;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Team(int teamId, String coachName, String teamName) {
		super();
		this.teamId = teamId;
		this.coachName = coachName;
		this.teamName = teamName;
	}
	
	public void printTeam() {
		System.out.println("Team Details");
		System.out.println("Team Id: "+teamId);
		System.out.println("Team Name: "+teamName);
	}
}
