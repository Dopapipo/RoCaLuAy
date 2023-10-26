package fr.pantheonsorbonne.cri.carreMagique;

import java.util.Scanner;

public class Player {
	private String name;
	private int score;
	Scanner scanner = new Scanner(System.in);
	public Player(String name) {
		this.setName(name);
		this.setScore(0);
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumberInput() {
		int toReturn;
		do {
			toReturn = scanner.nextInt();
		}
		while (toReturn>9||toReturn<0);
		return toReturn;
	}
	
	public int[] getPositionInput() {
		return new int[] {scanner.nextInt(),scanner.nextInt()};
	}
	
}
