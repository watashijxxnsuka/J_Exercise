package chap14_objectarray.car;

public class HyundaiCar extends CarStat implements CarInterface {
		public HyundaiCar() {
			super();
		}
		
		public HyundaiCar(String model, int price, String color) {
			super("현대", model, price, color);
		}
		
		@Override
		public void carInfo() {
			System.out.println("제조사: " + this.company);
			System.out.println("모델: " + this.model);
			System.out.println("가격: " + this.price);
			System.out.println("색상: " + this.color);
		}
		
		public void speedUp() {
			System.out.println("속도를 높입니다.");
		}

}
