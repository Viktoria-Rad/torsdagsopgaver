import java.util.ArrayList;

public class Team{

	private String teamName;
	private int rank;
	private ArrayList<String> players;


	public Team(String teamName){
		this.teamName = teamName;
		this.players = new ArrayList<>();
	}

	public void setRank(int rank){
			this.rank = rank;
	}
	public void addPlayer(String playerName){
		players.add(playerName);
	}
	public String toString(){
		String result = "Team: " + teamName + " Rank: " + rank + "\n";
		for(int i = 0; i < players.size(); i++){
		result += "Player: " + players.get(i) + "\n";
		}
		return result;
	}
}