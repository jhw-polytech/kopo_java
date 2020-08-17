package kr.ac.kopo.day10.homework;

import java.util.Random;

public interface Game {
	static Random random = new Random();
	int startGame(int you);

}
