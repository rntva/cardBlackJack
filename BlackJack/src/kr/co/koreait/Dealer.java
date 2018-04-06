package kr.co.koreait;

import kr.co.koreait.cards.Card;
import kr.co.koreait.cards.Rule;

public class Dealer {
	int totalScore = 0;
	int count = 0;
	Card dealerCard[] = new Card[12];
	Rule rule = new Rule();
	public int getCards(Card dCard, int choice)
	{
		if(count < 2)
		{
			dealerCard[count] = dCard;
			totalScore = rule.calculScore(totalScore, dCard.getNumber());
			count++;
		}
		else if(choice == 1)
		{
			dealerCard[count] = dCard;
			totalScore = rule.calculScore(totalScore, dCard.getNumber());
			if(totalScore > 21)
			{
				printAll();
				System.out.println("Player Win~!");
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
	public Card[] getDealerCard()
	{
		return dealerCard;
	}
	public void printAll()
	{
		System.out.print("Dealer => ");
		for(int i = 0 ; i < count ; i++)
		{
			dealerCard[i].printCard();
		}
		System.out.println("합 : " + totalScore);
	}
}
