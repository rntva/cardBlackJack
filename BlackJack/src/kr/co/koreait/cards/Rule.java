package kr.co.koreait.cards;

public class Rule {
	public int calculScore(int total, int adder)
	{
		total += adder;
		return total;
	}
	
	public int winner(int dealer, int player)
	{
		if(player == 21 || dealer > 21)
		{
			System.out.println("Player Win~!");
			return -1;
		}
		else if(dealer == 21)
		{
			System.out.println("Dealer Win~!");
			return -1;
		}
		
		else if(player == dealer && dealer > 16)
		{
			System.out.println("Darw!");
			return -1;
		}
		else if(player > dealer && dealer > 16)
		{
			System.out.println("Player Win~!");
			return -1;
		}
		else if(dealer > player && dealer > 16)
		{
			System.out.println("Dealer Win~!");
			return -1;
		}
		return 1;
	}
}
