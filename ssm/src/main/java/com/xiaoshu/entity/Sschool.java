package com.xiaoshu.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "s_school")
public class Sschool implements Serializable {
    @Id
    @Column(name = "sc_id")
    private Integer scId;

    private String scname;

    private static final long serialVersionUID = 1L;

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

    /**
     * @return scname
     */
    public String getScname() {
        return scname;
    }

    /**
     * @param scname
     */
    public void setScname(String scname) {
        this.scname = scname == null ? null : scname.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scId=").append(scId);
        sb.append(", scname=").append(scname);
        sb.append("]");
        return sb.toString();
    }
}