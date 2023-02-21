package 형변환;

public class 기본형형변환 {
	public static void main(String[] args) {
		byte b1 = 100; //1바이트, -128~127
		int i1 = 200; //-21억~21억
		
		i1 = b1;
		
		b1 = (byte)i1;
		
		double d1 = i1;
		i1 = (int)d1;
		
	}

}
