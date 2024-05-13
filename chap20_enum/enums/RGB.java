package chap20_enum.enums;

public enum RGB {
	
	// RED,GREEN,BLUE 상수선언
	// 값은 4개를 갖는다
	// 첫번째 값은 소문자 색상이름 
	// 2,3,4 번째 값은 int 
	// 두번째 값은 빨간색 농도(255가 최대값)
	// 세번째 값은 초록색 농도(255가 최대값)
	// 네번째 값은 파란색 농도(255가 최대값)
	// enum 을 구현하세요.
	
	R("red", 255, 0, 0),
	G("green", 0, 255, 0),
	B("blue", 0, 0, 255);
	
	private String colorName;
	private int redVal;
	private int greenVal;
	private int blueVal;

	RGB(String colorName, int redVal, int greenVal, int blueVal) {
		this.colorName = colorName;
		this.redVal = redVal;
		this.greenVal = greenVal;
		this.blueVal = blueVal;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}

	public int getRedVal() {
		return redVal;
	}

	public void setRedVal(int redVal) {
		this.redVal = redVal;
	}

	public int getGreenVal() {
		return greenVal;
	}

	public void setGreenVal(int greenVal) {
		this.greenVal = greenVal;
	}

	public int getBlueVal() {
		return blueVal;
	}

	public void setBlueVal(int blueVal) {
		this.blueVal = blueVal;
	}
	
	
	
	
	

}
