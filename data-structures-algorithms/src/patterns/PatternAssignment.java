package patterns;

//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
public class PatternAssignment {
	public static void main(String[] args) {
		int n = 5;
		pattern21(n);
	}

	private static void pattern1(int n) {
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern2(int n) {
		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern3(int n) {
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n - row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern4(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	private static void pattern5(int n) {
		for (int row = 1; row < 2 * n; row++) {
			int colsInRow = row > n ? 2 * n - row : row;
			for (int col = 1; col <= colsInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern6(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print("  ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern7(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 2; space <= row; space++) {
				System.out.print("  ");
			}
			for (int col = row; col <= n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern8(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print("  ");
			}
			for (int col = 1; col <= 2 * row - 1; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern9(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 2; space <= row; space++) {
				System.out.print("  ");
			}
			int colsInRow = 2 * n - 2 * row + 1;
			for (int col = 1; col <= colsInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern10(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print("  ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
	}

	private static void pattern11(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 2; space <= row; space++) {
				System.out.print("  ");
			}
			for (int col = row; col <= n; col++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
	}

	private static void pattern12(int n) {
		for (int row = 1; row <= 2 * n; row++) {
			int spacesInRow = row > n ? 2 * n - row : row - 1;
			for (int space = 1; space <= spacesInRow; space++) {
				System.out.print("  ");
			}
			int colsInRow = row > n ? row - n : n - row + 1;
			for (int col = 1; col <= colsInRow; col++) {
				System.out.print("*   ");
			}
			System.out.println();
		}
	}

	private static void pattern13(int n) {
		int innerSpaces = 1;
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}
			if (row == 1) {
				System.out.print("*");
			} else if (row == n) {
				for (int col = 1; col < 2 * n; col++) {
					System.out.print("*");
				}
			} else if (row > 1 && row < n) {
				System.out.print("*");
				for (int space = 1; space <= innerSpaces; space++) {
					System.out.print(" ");
				}
				System.out.print("*");
				innerSpaces += 2;
			}
			System.out.println();
		}
	}

	private static void pattern14(int n) {
		int innerSpaces = n * 2 - 5;
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= row - 1; space++) {
				System.out.print(" ");
			}
			if (row == 1) {
				for (int col = 1; col < 2 * n; col++) {
					System.out.print("*");
				}
			} else if (row == n) {
				System.out.print("*");
			} else if (row > 1 && row < n) {
				System.out.print("*");
				for (int space = 1; space <= innerSpaces; space++) {
					System.out.print(" ");
				}
				System.out.print("*");
				innerSpaces -= 2;
			}
			System.out.println();
		}
	}

	private static void pattern15(int n) {
		int innerSpaces = 1;
		for (int row = 1; row < 2 * n; row++) {
			int spacesInRow = row > n ? row - n : n - row;
			for (int space = 1; space <= spacesInRow; space++) {
				System.out.print(" ");
			}
			if (row == 1 || row == 2 * n - 1) {
				System.out.print("*");
			} else {
				System.out.print("*");
				for (int space = 1; space <= innerSpaces; space++) {
					System.out.print(" ");
				}
				System.out.print("*");

				if (row >= n) {
					innerSpaces -= 2;
				} else {
					innerSpaces += 2;
				}
			}
			System.out.println();
		}
	}

	private static void pattern17(int n) {
		for (int row = 1; row < 2 * n; row++) {

			int spacesInRow = row > n ? row - n : n - row;

			for (int space = 1; space <= spacesInRow; space++) {
				System.out.print(" ");
			}
			int colsInRow = row > n ? 2 * n - row : row;
			for (int col = colsInRow; col >= 1; col--) {
				System.out.print(col);
			}
			for (int col = 2; col <= colsInRow; col++) {
				System.out.print(col);
			}
			System.out.println();
		}
	}

	private static void pattern18(int n) {
		for (int row = 1; row <= 2 * n; row++) {
			int colsInRow = row > n ? row - n : n - row + 1;
			for (int col = 1; col <= colsInRow; col++) {
				System.out.print("*");
			}

			int spacesInRow = row > n ? 2 * n - row : row - 1;
			for (int space = 1; space <= 2 * spacesInRow; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= colsInRow; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void pattern19(int n) {
		for (int row = 1; row < 2 * n; row++) {
			int colsInRow = row > n ? 2 * n - row : row;
			for (int col = 1; col <= colsInRow; col++) {
				System.out.print("*");
			}

			int spacesInRow = row > n ? row - n : n - row;
			for (int space = 1; space <= 2 * spacesInRow; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= colsInRow; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void pattern20(int n) {
		String symbol;
		for (int row = 1; row <= n; row++) {
			System.out.print("*");

			symbol = row == 1 || row == n ? "*" : " ";
			for (int col = 1; col <= 2; col++) {
				System.out.print(symbol);
			}
			System.out.print("*");
			System.out.println();
		}
	}

	private static void pattern21(int n) {
		int counter = 1;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(counter + " ");
				counter++;
			}
			System.out.println();
		}
	}

	private static void pattern22(int n) {
		for (int row = 1; row <= n; row++) {
			int counter = row % 2 == 0 ? 0 : 1;
			for (int col = 1; col <= row; col++) {
				System.out.print(counter + " ");
				counter = counter == 0 ? 1 : 0;
			}
			System.out.println();
		}
	}

	private static void pattern25(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print(" ");
			}
			System.out.print("*");
			String symbol = row == 1 || row == n ? "*" : " ";
			for (int col = 1; col <= 3; col++) {
				System.out.print(symbol);
			}
			System.out.print("*");
			System.out.println();
		}
	}

	private static void pattern26(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= n - row + 1; col++) {
				System.out.print(row + " ");
			}
			System.out.println();
		}
	}

	private static void pattern28(int n) {
		for (int row = 1; row < 2 * n; row++) {
			int spacesInRow = row > n ? row - n : n - row;
			for (int space = 1; space <= spacesInRow; space++) {
				System.out.print(" ");
			}

			int colsInRow = row > n ? 2 * n - row : row;

			for (int col = 1; col <= colsInRow; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern29(int n) {
		for (int row = 1; row < 2 * n; row++) {
			int colsInRow = row > n ? 2 * n - row : row;

			for (int col = 1; col <= colsInRow; col++) {
				System.out.print("*");
			}
			int spacesInRow = row > n ? row - n : n - row;
			for (int space = 1; space <= spacesInRow; space++) {
				System.out.print("  ");
			}
			for (int col = 1; col <= colsInRow; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void pattern30(int n) {
		for (int row = 1; row <= n; row++) {
			for (int space = 1; space <= n - row; space++) {
				System.out.print("  ");
			}
			for (int col = row; col >= 1; col--) {
				System.out.print(col + " ");
			}
			for (int col = 2; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	private static void pattern32(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = n - row + 1; col <= n; col++) {
				System.out.print((char) (64 + col) + " ");
			}
			System.out.println();
		}
	}

	private static void pattern33(int n) {
		int counter = 1;
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				int letterBase = counter % 2 == 0 ? 64 : 96;
				System.out.print((char) (counter + letterBase));
				counter++;
			}
			System.out.println();
		}
	}

	private static void pattern34(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = n - row + 1; col >= 1; col--) {
				System.out.print((char) (col + 64) + " ");
			}
			System.out.println();
		}
	}

	private static void pattern35(int n) {
		for (int row = 1; row <= n; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col);
			}
			for (int space = 1; space <= n - row; space++) {
				System.out.print("  ");
			}
			for (int col = row; col >= 1; col--) {
				System.out.print(col);
			}
			System.out.println();
		}
	}
}
