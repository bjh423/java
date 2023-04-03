package com.multi.mvc200;

public class MovieVO {
	private String title;
	private int cost;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "MoiveVO [title=" + title + ", cost=" + cost + "]";
	}

}
