package cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class DeckOfCards {
	
	private ArrayList<Card> cards;
	private ArrayList<Card> inList = new ArrayList<Card>();
	private ArrayList<Card> outList = new ArrayList<Card>();
	
	public DeckOfCards(ArrayList<Card> cards)
	{
		this.cards = cards;
	}
	
	public ArrayList shuffleList(ArrayList<Card> cards)
	{
		 Collections.shuffle(cards);
		return cards;
	}
	
	public Map<ArrayList , ArrayList> deal(ArrayList<Card> cards)
	{
		int i = 0;
		for(Card card : cards)
		{
			if(i % 2 == 0)
			{
				inList.add(card);
			}
			else
			{
				outList.add(card);
			}
			i++;
		}
		Map<ArrayList, ArrayList> returnMap = new HashMap<>();
		returnMap.put(inList, outList);
		return returnMap;
	}
	
	
}