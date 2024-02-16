package tr;

class Car {
	
	String vin;
	String color;
	boolean isStart;
	
}

class Train {
	
	String trainNumber;
	String departureStation;
	String arrivalStation;
	boolean isStart;
	
}

class ManualCar extends Car {
	
	int gear;
	void go () {
		System.out.println("수동 변속기 자동차가 가속합니다.");
	}
	void stop () {
		System.out.println("수동 변속기 자동차가 정차합니다.");
	}
	void method(int vin, int color, int isStart, int gear) {
		System.out.println("차량 번호 : " + vin + ", 색상 : " + color + ", 시동 상태 : " + isStart + "기어 상태 : " + gear);
	}
	
}

class AutomaticCar extends Car {
	
	void go () {
		System.out.println("자동 변속기 자동차가 가속합니다.");
	}
	void stop () {
		System.out.println("자동 변속기 자동차가 정차합니다.");
	}
	void method(int vin, int color, int isStart) {
		System.out.println("차량 번호 : " + vin + ", 색상 : " + color + ", 시동 상태 : " + isStart);
	}
	
}

class PassengerTrain extends Train {
	
	int passengerCount;
	void go () {
		System.out.println("여객 열차가 가속합니다.");
	}
	void stop () {
		System.out.println("여객 열차가 정차합니다.");
	}
	void method (int trainNumber, String departureStation, String arrivalStation, boolean isStart, int passengerCount) {
		System.out.println("열차 번호 : " + trainNumber + ", 출발역 : " + departureStation + ", 도착역 : " + arrivalStation + ", 시동 상태 : " + isStart + "탑승객 수 : " + passengerCount);
	}
	
}

class FreightTrain extends Train {
	
	double cargoWeight;
	void go () {
		System.out.println("화물 열차가 가속합니다.");
	}
	void stop () {
		System.out.println("화물 열차가 정차합니다.");
	}
	void method (int trainNumber, String departureStation, String arrivalStation, boolean isStart, int cargoWeight) {
		System.out.println("열차 번호 : " + trainNumber + ", 출발역 : " + departureStation + ", 도착역 : " + arrivalStation + ", 시동 상태 : " + isStart + "화물 무게 : " + cargoWeight);
	}
	
}


public class test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
