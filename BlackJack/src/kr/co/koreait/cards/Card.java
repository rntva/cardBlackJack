package kr.co.koreait.cards;

public class Card {
	final public static String SHAPE[] = {"Heart", "Club", "Diamond",
			"Spade"};
	final public static String SEQUENCE[] = {"A", "2", "3", "4", "5", "6", "7", "8",
			"9", "10", "J", "Q", "K"};
	final public static int NUMBER[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
			10, 10, 10};
	private String suits;
	private String sequence;
	private int number;
	
	public Card(int index_SH, int index_SE)
	{
		setSuits(index_SH);
		setSequence(index_SE);
	}
	protected void setSuits(int index)
	{
		suits = SHAPE[index];
	}
	protected void setSequence(int index)
	{
		sequence = suits + SEQUENCE[index];
		number = NUMBER[index];
	}
	
	public void printCard()
	{
		System.out.printf("[카드 : %s] ", sequence);
	}
	public int getNumber()
	{
		return number;
	}
}
