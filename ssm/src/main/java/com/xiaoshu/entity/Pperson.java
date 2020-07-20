package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name = "p_person")
public class Pperson implements Serializable {
    @Id
    private Integer pid;

    @Column(name = "p_name")
    private String pName;

    private String gender;

    @Column(name = "company_id")
    private Integer companyId;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date bithday;

    private static final long serialVersionUID = 1L;

    /**
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * @return p_name
     */
    public String getpName() {
        return pName;
    }

    /**
     * @param pName
     */
    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
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
     * @return company_id
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * @param companyId
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * @return bithday
     */
    public Date getBithday() {
        return bithday;
    }

    /**
     * @param bithday
     */
    public void setBithday(Date bithday) {
        this.bithday = bithday;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", pName=").append(pName);
        sb.append(", gender=").append(gender);
        sb.append(", companyId=").append(companyId);
        sb.append(", bithday=").append(bithday);
        sb.append("]");
        return sb.toString();
    }
}