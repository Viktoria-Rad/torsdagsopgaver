public class Main {

	public static void main(String [] args){
		Team team1 = new Team("Team1");
		team1.setRank(3);
		team1.addPlayer("Viktoria");
		team1.addPlayer("Valeria");
		team1.addPlayer("Amelia");
		
		System.out.println(team1);


		Team team2 = new Team("Team2");
		team2.setRank(3);
		team2.addPlayer("Jannie");
		team2.addPlayer("Sofie");
		team2.addPlayer("Hanna");

		Team team3 = new Team("Team3");
		team3.setRank(2);
		team3.addPlayer("Aya");
		team3.addPlayer("Emma");

		/*Team team1 = new Team("Team4");
		team4.setRank(3);
		team4.addPlayer("Karin");
		team4.addPlayer("Marly");
		team4.addPlayer("Anja");
		*/

		System.out.println(team2);
		System.out.println(team3);
		//System.out.println(team4);

	}
}