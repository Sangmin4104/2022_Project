package di_sample7;

import java.util.ArrayList;

public class MyInfo {
	private String name; // 이름
	private double height; // 키
	private double weight; // 몸무게
	private ArrayList<String> hobbys; // 취미
	private BMIC bmicalculator; // 객체 정보
	
	// getter / setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public ArrayList<String> getHobbys() {
		return hobbys;
	}
	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	public BMIC getBmicalculator() {
		return bmicalculator;
	}
	public void setBmicalculator(BMIC bmicalculator) {
		this.bmicalculator = bmicalculator;
	}
	
	// 사용자 정의 메소드 (정보 출력)
	public void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("취미 : " + hobbys);
		
		bmicalculator.bmi(weight, height);
	}
}
