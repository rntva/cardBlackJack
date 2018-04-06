package kr.co.koreait;

import java.util.Scanner;

import kr.co.koreait.cards.Card;
import kr.co.koreait.cards.Deck;
import kr.co.koreait.cards.Rule;

public class Main {
	public static void main(String args[])
	{
		Card deck[] = new Card[52];
		Player player = new Player();
		Dealer dealer = new Dealer();
		Rule rule = new Rule();
		Deck dd = new Deck();
		Scanner scan_1 = new Scanner(System.in);
		int coin = 1;
		int choice = 1;
		int basic = 0;
		char hand = 'p';
		
		deck = dd.suffleDeck();
		for(Card dCard : deck)
		{
			if(basic < 4)
			{
				if(hand == 'p')
				{
					player.getCards(dCard, 1);
					hand = 'd';
					basic++;
					continue;
				}
				else if(hand == 'd')
				{
					dealer.getCards(dCard, 1);
					hand = 'p';
					basic++;
					if(basic == 4)
					{
//						System.out.println();
//						System.out.print("Dealer => ");
//						dealer.printAll();
//						System.out.print("Player => ");
					}
					continue;
				}
			}
			else
			{
				if(hand == 'p')
				{
					player.printAll();
					System.out.print("Dealer => ");
					dealer.dealerCard[0].printCard();
					System.out.print("\n플레이어님 카드를 더 받으시겠습니까? : ");
					choice = scan_1.nextInt();
					coin = player.getCards(dCard, choice);
					if(coin == -1)
						break;
					if(choice == 1)
						continue;
					else
					{
						hand = 'd';
						System.out.println();
//						System.out.print("Dealer => ");
//						dealer.printAll();
					}		
				}
				else if(hand == 'd')
				{
//					dealer.printAll();
					if(dealer.getTotalScore() > 16)
					{
						dealer.printAll();
						System.out.println();
						player.printAll();
						coin = rule.winner(dealer.getTotalScore(), player.getTotalScore());
						break;
					}
					else if(dealer.getTotalScore() <= 16)
					{
						coin = dealer.getCards(dCard, 1);
//						dealer.printAll();
						if(coin == -1)
							break;
					}	
				}
			}
		}
	}
}
