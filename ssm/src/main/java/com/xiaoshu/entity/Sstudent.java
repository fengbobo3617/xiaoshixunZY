package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name = "s_student")
public class Sstudent implements Serializable {
    @Id
    private Integer sid;

    private String sname;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;

    private String age;

    private String gender;

    @Column(name = "sc_id")
    private Integer scId;

    private static final long serialVersionUID = 1L;

    /**
     * @return sid
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * @param sid
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * @return sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * @return birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    /**
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * @return sc_id
     */
    public Integer getScId() {
        return scId;
    }

    /**
     * @param scId
     */
    public void setScId(Integer scId) {
        this.scId = scId;
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
        sb.append(", scId=").append(scId);
        sb.append("]");
        return sb.toString();
    }
}