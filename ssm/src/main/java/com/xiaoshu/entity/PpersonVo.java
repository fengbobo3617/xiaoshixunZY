package com.xiaoshu.entity;

public class PpersonVo extends Pperson {
	private String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public PpersonVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PpersonVo(String companyName) {
		super();
		this.companyName = companyName;
	}
	
}
