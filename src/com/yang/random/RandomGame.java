package com.yang.random;

public class RandomGame {
	
	public int OutPutRandom(){
		return (int)(Math.random()*20);
	}
	
	public boolean IsGameOver(Sys Sys, Player Player){
		if (Sys.Rd == Player.Rd){
			System.out.println("Game over");
			System.out.println("Winer is " + Player.name);
			return true;
		}
		return false;
	}
	
}
