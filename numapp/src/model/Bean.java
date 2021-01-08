package model;

import java.io.Serializable;
public class Bean implements Serializable{

	private String num;
	private int ere;
	private int max;
	private int min;
	private int sum;

	public int getEre() {
		return ere;
	}

	public void setEre(int ere) {
		this.ere = ere;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

}
