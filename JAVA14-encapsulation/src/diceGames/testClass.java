package diceGames;

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

public class testClass {

	@Test
	public void thisWillSendYouNuts()
	{
		diceClass dice1 = new diceClass(20);
		
		dice1.rollDice();
		
		// Wa ha ha ... long live the King!
		dice1.diceRollValue = -1;
		
		dice1.diceValue();
	}
	
	
}
