package chap20_enum;

import chap20_enum.enums.RGB;

public class _05_RGBEnum {
	public static void main(String[] args) {
		RGB[] rgbArr = RGB.values();
		
		for (RGB rgb : rgbArr) {
			System.out.println(rgb.getColorName() + "는" + 
						rgb.getRedVal() + ", " + rgb.getGreenVal() + ", " + rgb.getBlueVal());
		}
		
		
	}

}
