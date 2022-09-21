package eg4;

/**
 * 2022/9/21 - 11:01
 */
public class home4_3 {
	public static void main(String[] args) {
		int c[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int d[][] = {{2, 2, 2}, {1, 1, 1}, {3, 3, 3}};

		int[][] arr = add(c, d, c.length);

		for (int[] row :
				arr) {
			for (int item :
					row) {

				System.out.println(item);

			}

		}


		System.out.println("乘法结果是：");
		int[][] arr2 = multiply(c,d,c.length);

		for (int[] row :
				arr2) {
			for (int item :
					row) {

				System.out.println(item);

			}

		}

	}

	public static int[][] add(int[][] arr1, int[][] arr2, int length) {
		int[][] c = new int[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				c[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return c;
	}

	public static int[][] multiply(int[][] arr1, int[][] arr2, int length) {

		int[][] c = new int[arr1.length][arr2[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				for (int k = 0; k < arr2[j].length; k++) {
					c[i][k] += arr1[i][j] * arr2[j][k];
				}
			}
		}


		return c;
	}


}
