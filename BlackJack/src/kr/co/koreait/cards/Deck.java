package kr.co.koreait.cards;

import java.util.Random;

public class Deck {
	private Card Deck[] = new Card[52];
	Random ran = new Random();
	
	public Card[] suffleDeck()
	{	
		int tempArray[] = randomArray();
		int temp = 0;
		for(int i = 0 ; i < Card.SHAPE.length ; i++)
		{
			for(int j = 0 ; j < Card.SEQUENCE.length ; j++)
			{
				Deck[tempArray[temp]-1] = new Card(i, j);
				temp++;
			}
		}
		return Deck;
	}
	
	public int[] randomArray()
	{
		int ran_arr_1[] = new int[52];
		int temp, coin = 1;
		
		int index = 0;
		for(;;)
		{
			temp = ran.nextInt(52+1);
			for(int j = 0 ; j <= index ; j++)
			{
				if(ran_arr_1[j] == temp)
					coin = 0;
			}
			if(coin == 1)
			{
				ran_arr_1[index] = temp;
				index++;
			}
			coin = 1;
			if(index == 52)
				break;
		}
		return ran_arr_1;
	}
}
