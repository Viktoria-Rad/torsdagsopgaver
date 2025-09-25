import java.util.ArrayList;

	public class GameMenu{
		private ArrayList<String> actions;

		public GameMenu	(ArrayList<String> action){
			this.actions = action;
		}
	public void displayMenu(){
		for (String action: actions){
		System.out.println(action);
		}

	}

}