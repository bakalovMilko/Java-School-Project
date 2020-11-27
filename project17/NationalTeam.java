package project17;

public class NationalTeam {
	private String nationality;
	private ChessPlayer[] players = new ChessPlayer[6];
	private int numberOfSelectedPlayers=0;
	
	NationalTeam(String nationality){
		this.setNationality(nationality);
	}
	
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public ChessPlayer[] getPlayers() {
		ChessPlayer[] a = new ChessPlayer[numberOfSelectedPlayers];
		for(int i=0; i<numberOfSelectedPlayers; i++) a[i] = players[i]; 
		return a;
	}
	
	public void addPlayer(ChessPlayer player) {
		if(numberOfSelectedPlayers<6) {
			players[numberOfSelectedPlayers] = player;
			numberOfSelectedPlayers++;
		}
		else {
			System.out.println("This team is full!");
		}
	}
	public void dropPlayer(ChessPlayer player) {
		boolean found=false;
		for(int i=0; i<numberOfSelectedPlayers; i++) {
			if(found) {
				players[i-1] = players[i];
			}
			if(player == players[i]) {
				found = true;
			}
		}
		if(found) {
			players[numberOfSelectedPlayers-1] = null;
			numberOfSelectedPlayers--;
		}
		else {
			System.out.println("There is no player with that name.");
		}
		players[numberOfSelectedPlayers] = null;
	}
}
