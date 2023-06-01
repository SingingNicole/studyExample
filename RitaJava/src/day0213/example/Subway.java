package day0213.example;

public class Subway {

	String lineNumber;
	private int count;
	private int income;
	private int charge;
	
	public Subway(String lineNumber, int charge) {
		this.lineNumber = lineNumber;
		this.charge = charge;
	}
	
	public void take() {
		income += charge;
		count ++;
		System.out.println("승객이 지하철에 탑승.");
	}

	public void showInfo() {
		System.out.println("Subway [lineNumber=" + lineNumber + ", count=" + count + ", income=" + income + ", charge=" + charge
				+ "]");
	}

	public String getLineNumber() {
		return lineNumber;
	}

	public int getCount() {
		return count;
	}

	public int getIncome() {
		return income;
	}

	public int getCharge() {
		return charge;
	}
	
}
