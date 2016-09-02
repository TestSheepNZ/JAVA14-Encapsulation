package diceGames;
/*
 * This program is part of my learning Java series
 * This one looks at encapsulation & why you want 
 * to make attributes private
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/09/java-14-encapsulation.html
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Sept 2016
 */

import org.junit.Test;
import static org.junit.Assert.*;
 
import java.util.ArrayList;
import java.util.Arrays;

public class diceClass {

	//Attributes
	public int numSides;
	public int diceRollValue;
	
	//Constructors
	
	public diceClass(int sides)
	{
		System.out.println("CONSTRUCTOR called with sides of " + sides);
		this.numSides = sides;
	}
	
	public diceClass()
	{
		this(6);
	}

	//Methods
	public int rollDice ()
	{
		diceRollValue = 1 + (int)(Math.random() * numSides);
		
		System.out.println("Rolled the number " + diceRollValue);
		return this.diceRollValue;
	}
		
	public int diceValue ()
	{
		System.out.println("The number on the dice is " + diceRollValue);
		return diceRollValue;
	}
	
}
