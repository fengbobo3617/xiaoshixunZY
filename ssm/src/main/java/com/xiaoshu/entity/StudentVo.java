package com.xiaoshu.entity;

public class StudentVo extends Student {
		private String scname;

		public String getScname() {
			return scname;
		}

		public void setScname(String scname) {
			this.scname = scname;
		}

		public StudentVo(String scname) {
			super();
			this.scname = scname;
		}

		public StudentVo() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
