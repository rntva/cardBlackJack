package kr.co.koreait;

import kr.co.koreait.cards.Card;
import kr.co.koreait.cards.Rule;

public class Player {
	int totalScore = 0;
	int count = 0;
	Card playerCard[] = new Card[12];
	Rule rule = new Rule();
	public int getCards(Card dCard, int choice)
	{
		if(count < 2)
		{
			playerCard[count] = dCard;
			totalScore = rule.calculScore(totalScore, dCard.getNumber());
			count++;
		}
		else if(choice == 1)
		{
			playerCard[count] = dCard;
			totalScore = rule.calculScore(totalScore, dCard.getNumber());
			if(totalScore > 21)
			{
				printAll();
				System.out.println("Dealer Win~!");
				return -1;
			}
			count++;
		}
		return 1;
	}
	
	public int getTotalScore()
	{
		return totalScore;
	}
	public Card[] getPlayerCard()
	{
		return playerCard;
	}
	public void printAll()
	{
		System.out.print("Player => ");
		for(int i = 0 ; i < count ; i++)
		{
			playerCard[i].printCard();
		}
		System.out.println("합 : " + totalScore);
	}
}
