package com.java;

public class MethodExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayHighScorePosition ( "Vimal" , calculateHighScorePosition(1500));
	}
	
	public static void displayHighScorePosition(String playerName, int position) {
		
		System.out.println(playerName + " managed to get on the position " + position + " on the high score table");
	}

	
	public static int calculateHighScorePosition(int playerScore) {
		if(playerScore > 1000) {
			return 1;
		}else if(playerScore > 500 || playerScore < 1000) {
			return 2;
		}else if(playerScore > 100 || playerScore < 500) {
			return 3;
		}else {
			return 4;
		}
	}
}
