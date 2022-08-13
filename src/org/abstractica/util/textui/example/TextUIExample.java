package org.abstractica.util.textui.example;

import org.abstractica.util.textui.SysOut;
import org.abstractica.util.textui.TextUI;

import java.util.Locale;

public class TextUIExample
{
	public static void main(String[] args)
	{
		TextUI textUI = SysOut.newTextUI();

		textUI.println("Hello text UI!");
		textUI.print("Enter a number: ");
		int number = textUI.getInteger();
		textUI.println(number + " is a great choice!");
		textUI.print("Enter a number between -5 and 5: ");
		number = textUI.getInteger(-5, 5);
		textUI.println(number + " was not a bad choice!");
		String[] choices = {"Green", "Red", "Blue", "Yellow"};
		int choice = textUI.select("What is your favorite color?", choices, "Please choose:");
		textUI.println("I like " + choices[choice].toLowerCase() + " too :-)");
	}
}
