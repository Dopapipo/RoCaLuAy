package fr.pantheonsorbonne.ChompGame;

import java.util.Scanner;

public class Atteindre10Game {
    public static void main(String[] args) {
        int grilleSize = 3;
        int[][] grid = new int[grilleSize][grilleSize];
        int[] availableNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int currentPlayer = 1;

        for (int i = 0; i < grilleSize; i++) {
            for (int j = 0; j < grilleSize; j++) {
                grid[i][j] = 0;
            }

            printGrid(grid);
        }
    }

    public static void printGrid(int[][] grid) {
        for (int i = 0; i < grid[i].length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

}
