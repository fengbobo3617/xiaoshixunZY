package com.xiaoshu.entity;

public class SstudentVo extends Sstudent {
	private String scname;
	private Integer num;
	

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getScname() {
		return scname;
	}

	public void setScname(String scname) {
		this.scname = scname;
	}

	public SstudentVo(String scname) {
		super();
		this.scname = scname;
	}

	public SstudentVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
