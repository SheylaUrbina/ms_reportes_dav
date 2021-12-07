package com.web.reportes.models.entity;

import java.io.Serializable;
import java.util.Objects;

public class Dav_goods_pk implements Serializable {

    private int instance_id;
    private int rnk_dav;
    private int rnk_goods;

    public int getRnk_dav() {
        return rnk_dav;
    }

    public void setRnk_dav(int rnk_dav) {
        this.rnk_dav = rnk_dav;
    }

    public int getInstance_id() {
        return instance_id;
    }

    public void setInstance_id(int instance_id) {
        this.instance_id = instance_id;
    }

    public int getRnk_goods() {
        return rnk_goods;
    }

    public void setRnk_goods(int rnk_goods) {
        this.rnk_goods = rnk_goods;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dav_goods_pk that = (Dav_goods_pk) o;
        return instance_id == that.instance_id &&
                Objects.equals(rnk_goods, that.rnk_goods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rnk_goods, instance_id);
    }
}
