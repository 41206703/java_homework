package eg4;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 2022/9/21 - 10:08
 * 快速排序 + arrayList 实现
 */
public class home4_1 {
	public static void main(String[] args) {
		Random random = new Random();
//		int[] arr = new int[10];
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
//			arrlist.set(i, random.nextInt(90) + 10);
			arrlist.add(random.nextInt(90) + 10);
			System.out.print(arrlist.get(i) + " ");
		}



		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要插入的数值");
		int num = 0;
		if (scanner.hasNextInt()) {
			num = scanner.nextInt();
		}

		;

		arrlist.add(num);
		Integer[] arr = new Integer[arrlist.size()];
		arrlist.toArray(arr);



		quickSort(arr, 0, arrlist.size() - 1);


		System.out.println("排序好的数组是：");
		for (Object item :
				arr) {
			System.out.println(item);
		}

	}

	public static void quickSort(Integer[] arr, int low, int high) {
		if (low > high) return;
		int i = low;
		int j = high;
		int temp = arr[low];

		while (i < j) {
			while (temp <= arr[j] && i < j) {
				j--;
			}
			while (temp >= arr[i] && i < j) {
				i++;
			}
			if (i < j) {
				int t = arr[j];
				arr[j] = arr[i];
				arr[i] = t;
			}


		}

		arr[low] = arr[i];
		arr[i] = temp;

		quickSort(arr, low, j - 1);
		quickSort(arr, j + 1, high);

	}
}
