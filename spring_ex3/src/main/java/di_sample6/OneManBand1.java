package di_sample6;

import java.util.Map;

public class OneManBand1 {
	private Map<String, Instrument> instruments;

	// getter / setter 자동 추가
	
	public Map<String, Instrument> getInstruments() {
		return instruments;
	}
	
	// 주입
	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments;
	}
	
	// 사용자 정의 메소드
	
	public void perform() {
		for(String key : instruments.keySet()){
			// 키값
			System.out.print("가져온 key 값 : ");
			
			Instrument instrument = instruments.get(key);
			// 키에 해당하는 값을 가져옴
			instrument.play();
		}
	}
	
	
	
}
