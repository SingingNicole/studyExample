package day0213.example;

public class Bus {

	private int busNumber;
	private int charge;
	private int income;
	private int count;
	
	public Bus(int busNumber, int charge) {
		this.busNumber = busNumber;
		this.charge = charge;
	}
	
	public void take() {
		income += charge;
		count++;
		System.out.println("승객이 버스에 탑승.");
	}
	
	public void showInfo() {
		System.out.println("Bus [busNumber=" + busNumber + ", charge=" + charge + ", income=" + income + ", count=" + count + "]");
	}
	
	public int getBusNumber() {
		return busNumber;
	}



	public int getCharge() {
		return charge;
	}



	public int getIncome() {
		return income;
	}



	public int getCount() {
		return count;
	}

}
