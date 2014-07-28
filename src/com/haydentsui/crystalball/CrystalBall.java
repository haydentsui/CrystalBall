package com.haydentsui.crystalball;

import java.util.Random;

import android.R.string;

public class CrystalBall {
	public String[] mAnswers = {
			"Yes, It will definitely happen",
			"It is decidely so",
			"All signs say YES",
			"The stars are not aligned",
			"My reply is no",
			"It is doubtful",
			"That's for you to decide",
			"I don't know man.."
	};
	public String getAnAnswer(){
		
		//Randomly select one of three answers
		Random randomGenerator = new Random ();
		int randomNumber = randomGenerator.nextInt(mAnswers.length);
		
		return mAnswers[randomNumber];
	}
}
