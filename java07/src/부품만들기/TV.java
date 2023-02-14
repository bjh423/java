package 부품만들기;

public class TV {
	public int ch;
	public int vol;
	public boolean onOff;
	
	public void 채널변경() {
		int change = 1;
		System.out.println(ch + "에서 " + change + "로 바꾸다.");
	}
	
	public void 유튜브보다() {
		System.out.println(vol + "을 키워서 동영상을 보다");
	}
	
}
