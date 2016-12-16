package operacoes;

public class OpMat {
	
	
	public static int somatorio(int m, int n) {
		int result = 0;
		if ((m <= n) && (m >= 0) && (n >= 0)) {
			for (int i = m; i <= n; i++) {
				result += i;
			}
		} else {
			result = -1;
		}
		return result;
	}
	
	public static long fatorial(int n) {
		long result = 1;
		if (n > 0) {
			for (int i = n; i >= 1; i--) {
				result *= i;
			}
		} else if (n == 0){
			result = 1;
		} else {
			result = -1;
		}
		return result;
	}
	
	public static long fatorialRecursivo(int n) {
		if (n >= 0) {
			if (n == 0) {
				return 1;
			} else {
				return n * fatorialRecursivo(n-1);
			}
		} else {
			return -1;
		}
	}
}
