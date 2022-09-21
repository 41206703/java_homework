package eg3;

/**
 * 2022/9/21 - 10:00
 */
public class home3_2 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		for (int i = 1; i < 100; i++) {
			if(i%7==0){
				num++;
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println("个数是:"+ num + "总和是：" + sum);
	}
}
