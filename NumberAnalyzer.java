import java.util.ArrayList;

public class NumberAnalyzer {
	private ArrayList<Number> list;
	public NumberAnalyzer() {
		list = new ArrayList<>();
	}
	public NumberAnalyzer(String numbers) {
		list = new ArrayList<>();
		setList(numbers);
	}
	public void setList(String numbers) {
		String[] numArray = numbers.split(" ");
		for (String numStr : numArray) {
			int num = Integer.parseInt(numStr);
			list.add(new Number(num));
		}
	}

	public int countOdds() {
		int oddCount = 0;
		for (Number num : list) {
			if (num.isOdd()) {
				oddCount++;
			}
		}
		return oddCount;
	}

	public int countEvens() {
		int evenCount = 0;
		for (Number num : list) {
			if (!num.isOdd()) {
				evenCount++;
			}
		}
		return evenCount;
	}

	public int countPerfects() {
		int perfectCount = 0;
		for (Number num : list) {
			if (num.isPerfect()) {
				perfectCount++;
			}
		}
		return perfectCount;
	}
	public String toString() {
		return list.toString();
	}
}
