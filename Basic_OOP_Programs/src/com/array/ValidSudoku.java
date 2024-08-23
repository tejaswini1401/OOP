package com.array;
import java.util.*;

public class ValidSudoku {
	
	public static boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char currentVal = board[i][j];
                
                if (currentVal != '.') {
                    if (!seen.add(currentVal + " in row " + i) ||
                        !seen.add(currentVal + " in column " + j) ||
                        !seen.add(currentVal + " in box " + i/3 + "-" + j/3)) {
                        return false;
                    }
                }
            }
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		
		 char[][] board = {
		            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
		            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
		            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
		            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
		            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
		            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
		            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
		            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
		            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
		        };

		  boolean result = isValidSudoku(board);
		  System.out.println("Is the Sudoku board valid? " + result);

	}

}
