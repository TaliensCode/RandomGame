package com.yang.random;

public class Game {
	public static void main(String[] args) {
		int s;
		boolean flag = false;
		int a, b, c;
		Sys S = new Sys();
		Player A = new Player("A");
		Player B = new Player("B");
		Player C = new Player("C");
		RandomGame aGame = new RandomGame();

		s = aGame.OutPutRandom();
		S.setSys(s);
		
		
		Player ply[] = { A, B, C };

		do {
			a = aGame.OutPutRandom();
			b = aGame.OutPutRandom();
			c = aGame.OutPutRandom();
			A.setPlayer(a);
			B.setPlayer(b);
			C.setPlayer(c);
			System.out.println("Sys.Rd :" + S.Rd);
			System.out.println("Player.Rd :" + A.Rd);
			System.out.println("Player.Rd :" + B.Rd);
			System.out.println("Player.Rd :" + C.Rd);
			for (int i = 0; i < ply.length; i++) {
				flag = aGame.IsGameOver(S, ply[i]);
			}
		}while(!flag);
	}
}
