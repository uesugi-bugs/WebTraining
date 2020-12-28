package model;

import java.io.Serializable;

public class Hero implements Serializable{
	private String name;
	private int[] vals;
	private String job;
	private String tribe;
	private String[] classes = {"戦士","盗賊","僧侶","魔法使い"};
	private String[] palam = {"体力","魔力","力","きようさ","すばやさ"};
	private String[] races = {"人間","ハイエルフ","トロル","ノーム"};

	public String[] getRaces() {
		return races;
	}
	
	public String getTribe() {
		return tribe;
	}

	public void setTribe(String tribe) {
		this.tribe = tribe;
	}

	public String[] getPalam() {
		return palam;
	}

	public String[] getClasses() {
		return classes;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getVals() {
		return vals;
	}

	public void setVals(int[] vals) {
		this.vals = vals;
	}


}
