package 화면DB연결;

public class MP_StaffVO {
	private int code; // 직원번호
	private String id; // 로그인 아이디
	private String pw; // 로그인 비밀번호
	private String name; // 이름
	private String tel; // 전화번호 (겸 가입 인증코드)
	private int level; // 직책 (1:점장 2:매니저 3:정직원 4:알바)

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "MP_StaffVO [code=" + code + ", id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + ", level="
				+ level + "]";
	}

}
