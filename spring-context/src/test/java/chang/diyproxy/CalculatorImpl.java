package chang.diyproxy;

public class CalculatorImpl implements Calculator {

	public int add(int i, int j) {
		System.out.println("add");
		return i + j;
	}

	public int sub(int i, int j) {
		return i - j;
	}

	public int mult(int i, int j) {
		return i * j;
	}

	public int div(int i, int j) {
		return i / j;
	}
}