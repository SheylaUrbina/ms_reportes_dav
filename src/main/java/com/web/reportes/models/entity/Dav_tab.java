package com.web.reportes.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "DAV_TAB", schema = "AWUNDUCA")
public class Dav_tab {
    @Id
    @Column(name = "INSTANCE_ID")
    private int instance_id;
    @Column(name = "STA")
    private int sta;
    @Column(name = "CUO_YEA")
    private int cuo_yea;
    @Column(name = "REG_CUO")
    private String reg_cuo;
    @Column(name = "REG_YEA")
    private int reg_yea;
    @Column(name = "REG_NBR")
    private int reg_nbr;
    @Column(name = "TRA_CTY_EXP_DAT")
    private Date tra_cty_exp_dat;
    @Column(name = "TRA_CTY_FRM_COD")
    private String tra_cty_frm_cod;

    @OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    @JsonIgnoreProperties(value = {"hibernateLazyInitializer","handler"})
    @JoinColumn(name = "INSTANCE_ID")
    private List<Dav_goods> dav_goodsList;

    public int getInstance_id() {
        return instance_id;
    }

    public void setInstance_id(int instance_id) {
        this.instance_id = instance_id;
    }

    public int getSta() {
        return sta;
    }

    public void setSta(int sta) {
        this.sta = sta;
    }

    public int getCuo_yea() {
        return cuo_yea;
    }

    public void setCuo_yea(int cuo_yea) {
        this.cuo_yea = cuo_yea;
    }

    public String getReg_cuo() {
        return reg_cuo;
    }

    public void setReg_cuo(String reg_cuo) {
        this.reg_cuo = reg_cuo;
    }

    public int getReg_yea() {
        return reg_yea;
    }

    public void setReg_yea(int reg_yea) {
        this.reg_yea = reg_yea;
    }

    public int getReg_nbr() {
        return reg_nbr;
    }

    public void setReg_nbr(int reg_nbr) {
        this.reg_nbr = reg_nbr;
    }

    public Date getTra_cty_exp_dat() {
        return tra_cty_exp_dat;
    }

    public void setTra_cty_exp_dat(Date tra_cty_exp_dat) {
        this.tra_cty_exp_dat = tra_cty_exp_dat;
    }

    public String getTra_cty_frm_cod() {
        return tra_cty_frm_cod;
    }

    public void setTra_cty_frm_cod(String tra_cty_frm_cod) {
        this.tra_cty_frm_cod = tra_cty_frm_cod;
    }

    public List<Dav_goods> getDav_goodsList() {
        return dav_goodsList;
    }

    public void setDav_goodsList(List<Dav_goods> dav_goodsList) {
        this.dav_goodsList = dav_goodsList;
    }
}
