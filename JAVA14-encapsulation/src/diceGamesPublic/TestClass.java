package diceGamesPublic;

/*
 * Poor little Simba!  What have you done!
 * 
 * Written by: Uncle Scar
 * Date: Sept 2016
 */

import org.junit.Test;
import static org.junit.Assert.*;
 
import java.util.ArrayList;
import java.util.Arrays;

public class TestClass {

	@Test
	public void thisWillSendYouNuts()
	{
		DiceClass dice1 = new DiceClass(20);
		
		dice1.rollDice();
		
		// Wa ha ha ... long live the King!
		dice1.diceRollValue = -1;
		
		dice1.diceValue();
	}
	
	
}
