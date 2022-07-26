package cardgame;

public class Player {
	private String name;
	private int coins;
	private String chosenCard;
	private String chosenOrientation;
	private int isHost;
	
	public Player(String name, int coins, String chosenCard, String chosenOrientation) {
		this.name = name;
		this.coins = coins;
		this.chosenCard = chosenCard;
		this.chosenOrientation = chosenOrientation;
		this.isHost = 0;
	}
	
	public String getName()
	{
		return name;
	}
	public String getChosenCard() {
		return chosenCard;
	}
	public String getChosenOrientation() {
		return chosenOrientation;
	}
	public int getCoins()
	{
		return coins;
	}
	public void setCoins(int coins)
	{
		this.coins = coins;
	}
	public int getHost()
	{
		return isHost;
	}
	public void setHost(int isHost)
	{
		this.isHost = isHost;
	}
	
	public void setBetCoins(int coins,int bet)
	{
		this.coins = coins - bet;
	}
	public String toString()
	{
		return name + " " + coins + " " + getChosenCard() + " " + chosenOrientation + " " + isHost;
	}
	
	
}
