
public class Linga {

	public static void main(String[] args) {
		int n = 13;
		int m = 5;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if ((i == 0 && j < n - 1) || (i == n - 1 && j < n - 1) || j == (n - 1) / 2) // I
					System.out.print("*");
				else
					System.out.print(" ");

			}

			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == j) // N
					System.out.print("*");
				else
					System.out.print(" ");

			}
			for (int j = 0; j < n; j++) {
				if ((j == n / 4) || (i == 0 && j >= n / 4 && j < 3 * n / 4)
						|| (i == n / 2 && j >= n / 4 && j < 3 * n / 4) || (i == n - 1 && j >= n / 4 && j < 3 * n / 4)) // E
					System.out.print("*");
				else
					System.out.print(" ");

			}
			for (int j = 0; j < n; j++) {
				if ((j == 0 && i < n - 1) || (j == 3 * n / 4 && i < n - 1) || (i == n - 1 && j > 0 && j < 3 * n / 4))// U
					System.out.print("*");
				else
					System.out.print(" ");

			}

			for (int j = 0; j < n; j++) {
				if (j == 0 || (i == 0 && j > 0 & j < n / 2) || (j == n / 2 && i > 0 && i < n / 2)
						|| (i == n / 2 && j < n / 2) || (i - j == (n) / 2)) // R
					System.out.print("*");
				else
					System.out.print(" ");

			}
			for (int j = 0; j < n; j++) {
				if ((j == 0 && i > 0 && i < n - 1) || (j == 3 * n / 4 && i > 0 && i < n - 1)
						|| (i == 0 && j > 0 && j < 3 * n / 4) || (i == n - 1 && j > 0 && j < 3 * n / 4)) // O
					System.out.print("*");
				else
					System.out.print(" ");

			}

			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == j) // N
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1 || i + j <= (n - 1) / 2 || j - i >= (n - 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");

			}

			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if ((j == 0 && i > n / 2) || i == n - 1 || (j == n - 1 && i > n / 2) || i - j >= (n - 1) / 2
						|| i + j >= n + (n - 1) / 2 - 1)
					System.out.print("*");
				else
					System.out.print(" ");

			}

			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (i == 0 || j == 0 || i == n - 1 || i + j <= (n - 1) / 2 || i - j >= (n - 1) / 2)
					System.out.print("*");
				else
					System.out.print(" ");

			}

			System.out.println();
		}
		System.out.println();
		for (int i = 1; i < m; i++) {
			for (int j = 0; j < m - 1; j++)
				System.out.print(i);
			System.out.println();
		}

	}

}
