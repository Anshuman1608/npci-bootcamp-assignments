package cardgame;

import java.util.*;

public class Game {
	public static void main(String[] args) {
		
		ArrayList<Card> inList = new ArrayList<Card>();
		ArrayList<Card> outList = new ArrayList<Card>();
		ArrayList<Card> cardList = new ArrayList<Card>();
		
		cardList.add(new Card(Card.ACE,Card.SPADES)); cardList.add(new Card(Card.TWO,Card.SPADES)); cardList.add(new Card(Card.THREE,Card.SPADES)); cardList.add(new Card(Card.FOUR,Card.SPADES));
		cardList.add(new Card(Card.FIVE,Card.SPADES)); cardList.add(new Card(Card.SIX,Card.SPADES)); cardList.add(new Card(Card.SEVEN,Card.SPADES)); cardList.add(new Card(Card.EIGHT,Card.SPADES));
		cardList.add(new Card(Card.NINE,Card.SPADES)); cardList.add(new Card(Card.TEN,Card.SPADES)); cardList.add(new Card(Card.JACK,Card.SPADES)); cardList.add(new Card(Card.QUEEN,Card.SPADES));cardList.add(new Card(Card.KING,Card.SPADES));
		
		cardList.add(new Card(Card.ACE,Card.HEARTS)); cardList.add(new Card(Card.TWO,Card.HEARTS)); cardList.add(new Card(Card.THREE,Card.HEARTS)); cardList.add(new Card(Card.FOUR,Card.HEARTS));
		cardList.add(new Card(Card.FIVE,Card.HEARTS)); cardList.add(new Card(Card.SIX,Card.HEARTS)); cardList.add(new Card(Card.SEVEN,Card.HEARTS)); cardList.add(new Card(Card.EIGHT,Card.HEARTS));
		cardList.add(new Card(Card.NINE,Card.HEARTS)); cardList.add(new Card(Card.TEN,Card.HEARTS)); cardList.add(new Card(Card.JACK,Card.HEARTS)); cardList.add(new Card(Card.QUEEN,Card.HEARTS));cardList.add(new Card(Card.KING,Card.HEARTS));
		
		cardList.add(new Card(Card.ACE,Card.DIAMONDS)); cardList.add(new Card(Card.TWO,Card.DIAMONDS)); cardList.add(new Card(Card.THREE,Card.DIAMONDS)); cardList.add(new Card(Card.FOUR,Card.DIAMONDS));
		cardList.add(new Card(Card.FIVE,Card.DIAMONDS)); cardList.add(new Card(Card.SIX,Card.DIAMONDS)); cardList.add(new Card(Card.SEVEN,Card.DIAMONDS)); cardList.add(new Card(Card.EIGHT,Card.DIAMONDS));
		cardList.add(new Card(Card.NINE,Card.DIAMONDS)); cardList.add(new Card(Card.TEN,Card.DIAMONDS)); cardList.add(new Card(Card.JACK,Card.DIAMONDS)); cardList.add(new Card(Card.QUEEN,Card.DIAMONDS));cardList.add(new Card(Card.KING,Card.DIAMONDS));
		
		cardList.add(new Card(Card.ACE,Card.CLUBS)); cardList.add(new Card(Card.TWO,Card.CLUBS)); cardList.add(new Card(Card.THREE,Card.CLUBS)); cardList.add(new Card(Card.FOUR,Card.CLUBS));
		cardList.add(new Card(Card.FIVE,Card.CLUBS)); cardList.add(new Card(Card.SIX,Card.CLUBS)); cardList.add(new Card(Card.SEVEN,Card.CLUBS)); cardList.add(new Card(Card.EIGHT,Card.CLUBS));
		cardList.add(new Card(Card.NINE,Card.CLUBS)); cardList.add(new Card(Card.TEN,Card.CLUBS)); cardList.add(new Card(Card.JACK,Card.CLUBS)); cardList.add(new Card(Card.QUEEN,Card.CLUBS));cardList.add(new Card(Card.KING,Card.CLUBS));
		
		DeckOfCards newDeck = new DeckOfCards(cardList);
		
		Map<ArrayList, ArrayList> returnMap= newDeck.deal(cardList);
		for(Map.Entry<ArrayList, ArrayList> entry : returnMap.entrySet())
		{
			inList = entry.getKey();
			outList = entry.getValue();
		}
	
		Scanner sc = new Scanner(System.in);
		Player p1 = new Player("Anshuman",50,"KS","in");
		Player p2 = new Player("Sarthak",100,"5C","out");
		Player p3 = new Player("Surya",40,"3D","out");
		Player p4 = new Player("Sagar",60,"4H","in");
		
		
		if(p1.getHost()==0)
			p1.setHost(1);
		System.out.println("Enter the bet Coins");
		int betCoins = sc.nextInt();
		int totalPrize = betCoins *3;
		
		if(p1.getHost() == 1)
		{
			p2.setBetCoins(p2.getCoins(), betCoins);
			p3.setBetCoins(p3.getCoins(), betCoins);
			p4.setBetCoins(p4.getCoins(), betCoins);
		}
		else if((p2.getHost() == 1)) {
			p1.setBetCoins(p1.getCoins(), betCoins);
			p3.setBetCoins(p3.getCoins(), betCoins);
			p4.setBetCoins(p4.getCoins(), betCoins);
		}
		else if(p3.getHost() == 1)
		{
			p1.setBetCoins(p1.getCoins(), betCoins);
			p2.setBetCoins(p2.getCoins(), betCoins);
			p4.setBetCoins(p4.getCoins(), betCoins);
		}
		else
		{
			p1.setBetCoins(p1.getCoins(), betCoins);
			p2.setBetCoins(p2.getCoins(), betCoins);
			p3.setBetCoins(p3.getCoins(), betCoins);
		}
		
		
		boolean winner = false;
		while(inList.size() != 0 || outList.size() != 0 )
		{
			if(p2.getChosenOrientation().equals("in"))
			{
				if(hasCardInList(p2,inList))
					winner = true;
				else
					inList.remove(1);
			}
			else if(p2.getChosenOrientation().equals("out"))
			{
				if(hasCardOutList(p2,outList))
					winner = true;
				else
					outList.remove(1);
			}
		}
		System.out.println(winner);
	}
	
	
	public static Boolean hasCardInList(Player p, ArrayList<Card> inList)
	{
		for(Card card : inList)
		{
			if(p.getChosenCard().equals(card))
				return true;
		}
		return false;
	}
	
	public static Boolean hasCardOutList(Player p, ArrayList<Card> outList)
	{
		for(Card card : outList)
		{
			if(p.getChosenCard().equals(card))
				return true;
		}
		return false;
	}

}
