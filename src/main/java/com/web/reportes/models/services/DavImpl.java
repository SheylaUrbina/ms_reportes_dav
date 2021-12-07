package com.web.reportes.models.services;

import com.web.reportes.models.dao.IDvaDao;
import com.web.reportes.models.dao.IDvaDetalle;
import com.web.reportes.models.entity.Dav_goods;
import com.web.reportes.models.entity.Dav_tab;
import com.web.reportes.models.entity.DvaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DavImpl {
    @Autowired
    private IDvaDao dvadao;

    @Autowired
    private IDvaDetalle dvadetalle;

    public Optional<Dav_tab> findByInstanceId(int instanceid){
        return dvadao.findById(instanceid);
    }

    public List<Dav_goods> findAllByDavTab(String Inicial, String Final, Map<String,String> parameters)
    {
        List<Dav_goods> list = dvadetalle.findAllByDavTab(Inicial,Final);

        System.out.println("Fecha inicial: "+parameters.get("FechaInicial"));
        System.out.println("Fecha Final: "+parameters.get("FechaFinal"));
        System.out.println("Marca: "+parameters.get("Marca"));
        System.out.println("Arancel: "+parameters.get("Arancel"));
        System.out.println("Modelo: "+parameters.get("Modelo"));
        System.out.println("Caracteristica: "+parameters.get("Caracteristica"));
        System.out.println("Nombre: "+parameters.get("Nombre"));
        System.out.println("UnidadMedida: "+parameters.get("UnidadMedida"));
        System.out.println("NombrePais: "+parameters.get("NombrePais"));
        System.out.println("EstadoMercancia: "+parameters.get("EstadoMercancia"));

        return  list.stream()
                .filter(p->parameters.get("Arancel")==null || p.getHsc_cod().toUpperCase().trim().contains(parameters.get("Arancel").toUpperCase()))
                .filter(p-> parameters.get("Marca")==null || p.getBra().toUpperCase().trim().contains(parameters.get("Marca").toUpperCase()))
                .filter(p-> parameters.get("Modelo")==null || p.getMod().toUpperCase().trim().contains(parameters.get("Modelo").toUpperCase()))
                .filter(p-> parameters.get("Caracteristica")==null || p.getTyp().toUpperCase().trim().contains(parameters.get("Caracteristica").toUpperCase()))
                .filter(p-> parameters.get("Nombre")==null || p.getNam().toUpperCase().trim().contains(parameters.get("Nombre").toUpperCase()))
                .filter(p-> parameters.get("UnidadMedida")==null || p.getUnt_dsc().toUpperCase().trim().contains(parameters.get("UnidadMedida").toUpperCase()))
                .filter(p-> parameters.get("NombrePais")==null || p.getCty_nam().toUpperCase().trim().contains(parameters.get("NombrePais").toUpperCase()))
                .filter(p-> parameters.get("EstadoMercancia")==null || p.getSta_dsc().toUpperCase().trim().contains(parameters.get("EstadoMercancia").toUpperCase()))
                .collect(Collectors.toList());
        //return dvadetalle.findAllByDavTab(Inicial,Final);
    }

}
