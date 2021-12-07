package com.web.reportes.models.dao;

import com.web.reportes.models.entity.Dav_goods;
import com.web.reportes.models.entity.Dav_goods_pk;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IDvaDetalle extends CrudRepository<Dav_goods, Dav_goods_pk> {
    int nro = 2;

    @Query(value = " SELECT dgs.INSTANCE_ID,dgs.RNK_DAV,dgs.RNK_GOODS,dgs.HSC_COD,\n" +
            "         dgs.NAM,\n" +
            "         dgs.TYP,\n" +
            "         dgs.BRA,\n" +
            "         dgs.MOD,\n" +
            "         dgs.QTY,\n" +
            "         dgs.UNT_DSC,\n" +
            "         dgs.FOB,\n" +
            "         dgs.CTY_NAM,\n" +
            "         dgs.STA_DSC\n" +
            "    FROM DAV_TAB dav, DAV_GOODS dgs\n" +
            "   WHERE     dav.INSTANCE_ID = dgs.INSTANCE_ID(+) \n" +
            "   AND dav.TRA_CTY_EXP_DAT BETWEEN to_date(?1,'DD/MM/YYYY') AND to_date(?2,'DD/MM/YYYY') " +
            " AND dgs.CHK_ESTADO = 1 "

            ,
            nativeQuery=true)

    List<Dav_goods> findAllByDavTab(String vInicial,String vFinal);

}
