package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

public class Student implements Serializable {
    @Id
    private Integer sid;

    private String sname;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;

    private String age;

    private String gender;
    private String pic;

    private Integer scid;

    private static final long serialVersionUID = 1L;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Integer getScid() {
		return scid;
	}

	public void setScid(Integer scid) {
		this.scid = scid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer sid, String sname, Date birthday, String age, String gender, String pic, Integer scid) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.birthday = birthday;
		this.age = age;
		this.gender = gender;
		this.pic = pic;
		this.scid = scid;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", birthday=" + birthday + ", age=" + age + ", gender="
				+ gender + ", pic=" + pic + ", scid=" + scid + "]";
	}
    

  /*  *//**
     * @return sid
     *//*
    public Integer getSid() {
        return sid;
    }

    *//**
     * @param sid
     *//*
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    *//**
     * @return sname
     *//*
    public String getSname() {
        return sname;
    }

    *//**
     * @param sname
     *//*
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    *//**
     * @return birthday
     *//*
    public Date getBirthday() {
        return birthday;
    }

    *//**
     * @param birthday
     *//*
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    *//**
     * @return age
     *//*
    public String getAge() {
        return age;
    }

    *//**
     * @param age
     *//*
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    *//**
     * @return gender
     *//*
    public String getGender() {
        return gender;
    }

    *//**
     * @param gender
     *//*
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    *//**
     * @return scid
     *//*
    public Integer getScid() {
        return scid;
    }

    *//**
     * @param scid
     *//*
    public void setScid(Integer scid) {
        this.scid = scid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sid=").append(sid);
        sb.append(", sname=").append(sname);
        sb.append(", birthday=").append(birthday);
        sb.append(", age=").append(age);
        sb.append(", gender=").append(gender);
        sb.append(", scid=").append(scid);
        sb.append("]");
        return sb.toString();
    }*/
}