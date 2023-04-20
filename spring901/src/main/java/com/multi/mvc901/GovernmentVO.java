package com.multi.mvc901;

public class GovernmentVO {
	private String id;
	private String city; // 도,시
	private String district; // 구,군
	private String title; // 제목
	private String content; // 내용

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "GovermentVO [id=" + id + ", city=" + city + ", district=" + district + ", title=" + title + ", content="
				+ content + "]";
	}

}
