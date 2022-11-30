package di_sample7;

public class BMIC {
	// 멤버 변수
	private double lowWeight; // 저체중
	private double normal; // 정상
	private double overWeight; // 과체중
	private double obesity; // 비만
	
	// getter / setter 
	public double getLowWeight() {
		return lowWeight;
	}
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public double getNormal() {
		return normal;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public double getOverWeight() {
		return overWeight;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	public double getObesity() {
		return obesity;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	
	// 사용자 정의 메소드
	public void bmi(double weight, double height) {
		double h = height * 0.01;
		double result = weight / (h*h);
		
		System.out.println("BMI수치 : " + result);
		
		if(result > obesity) {
			System.out.println("비만");
		}
		else if(result > overWeight) {
			System.out.println("과체중");
		}
		else if(result > normal) {
			System.out.println("정상");
		}else {
			System.out.println("저체중");
		}
	}
}
