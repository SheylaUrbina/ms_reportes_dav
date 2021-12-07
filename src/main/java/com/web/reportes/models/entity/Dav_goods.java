package com.web.reportes.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Dav_goods {
    @JsonIgnore
   @EmbeddedId
   private Dav_goods_pk id;

    @Column(name = "HSC_COD")
    private String hsc_cod;
    @Column(name = "NAM")
    private String nam;
    @Column(name = "TYP")
    private String typ;
    @Column(name = "BRA")
    private String bra;
    @Column(name = "MOD")
    private String mod;
    @Column(name = "QTY")
    private double qty;
    @Column(name = "UNT_DSC")
    private String unt_dsc;
    @Column(name = "FOB")
    private double fob;
    @Column(name = "CTY_NAM")
    private String cty_nam;
    @Column(name = "STA_DSC")
    private String sta_dsc;

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    public double getFob() {
        return fob;
    }

    public void setFob(double fob) {
        this.fob = fob;
    }

    public Dav_goods_pk getId() {
        return id;
    }

    public void setId(Dav_goods_pk id) {
        this.id = id;
    }

    public String getHsc_cod() {
        return hsc_cod;
    }

    public void setHsc_cod(String hsc_cod) {
        this.hsc_cod = hsc_cod;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getBra() {
        return bra;
    }

    public void setBra(String bra) {
        this.bra = bra;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }



    public String getUnt_dsc() {
        return unt_dsc;
    }

    public void setUnt_dsc(String unt_dsc) {
        this.unt_dsc = unt_dsc;
    }



    public String getCty_nam() {
        return cty_nam;
    }

    public void setCty_nam(String cty_nam) {
        this.cty_nam = cty_nam;
    }

    public String getSta_dsc() {
        return sta_dsc;
    }

    public void setSta_dsc(String sta_dsc) {
        this.sta_dsc = sta_dsc;
    }
}
