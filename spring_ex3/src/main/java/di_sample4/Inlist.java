package di_sample4;

public class Inlist {
	// 멤버 변수 
	private String song;				// 기본 자료형
	private Instrument instrument;		// 객체형
	
	// setter / getter 추가
	public String getSong() {
		return song;
	}
	
	// 주입
	public void setSong(String song) {
		this.song = song;
	}
	public Instrument getInstrument() {
		return instrument;
	}
	
	// 주입
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	// 출력 메서드
	public void perform() {
		System.out.println("play 되는 노래 : " + song);
		instrument.play();
	}
	
	

}
