package eg3;

/**
 * 2022/9/21 - 10:02
 */
public class home3_3 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int a = i/100;
			int b = i/10 - a*10;
			int c = i/1 -a*100 - b*10;
			if(i == Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)){
				System.out.println(i);
			}


		}
	}
}

