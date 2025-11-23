import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		for (int num = 1000; num <= 9999; num++) {
			int sum10 = digitSum(num, 10);
			int sum12 = digitSum(num, 12);
			int sum16 = digitSum(num, 16);

			if (sum10 == sum12 && sum12 == sum16) {
				System.out.println(num);
			}
		}
	}

	private static int digitSum(int num, int base) {
		int sum = 0;

		while (num > 0) {
			sum += num % base;
			num /= base;
		}

		return sum;
	}
}