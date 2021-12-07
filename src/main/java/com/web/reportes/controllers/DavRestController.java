package com.web.reportes.controllers;


import com.web.reportes.models.entity.Dav_goods;
import com.web.reportes.models.entity.Dav_tab;
import com.web.reportes.models.entity.DvaResponse;
import com.web.reportes.models.services.DavImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import java.util.Map;

@RestController
@RequestMapping("/dav")
public class DavRestController {
    @Autowired
    private DavImpl davimpl;


    @GetMapping("/{instanceid}")
    public Dav_tab getDav(@PathVariable int instanceid){
        return davimpl.findByInstanceId(instanceid).orElse(null);
    }

    @GetMapping("/listar")
    public List<Dav_goods> getDavDetalle(@RequestParam Map<String,String> parameters){
          return  davimpl.findAllByDavTab(parameters.get("FechaInicial"),parameters.get("FechaFinal"),parameters);

    }

/*
*     @GetMapping("/listar")
    public List<Dav_goods> getDavDetalle(@RequestParam Map<String,String> parameters){
        System.out.println("Fecha inicial: "+parameters.get("FechaInicial"));
        System.out.println("Fecha Final: "+parameters.get("FechaFinal"));
        System.out.println("Marca: "+parameters.get("Marca"));
        System.out.println("Arancel: "+parameters.get("Arancel"));

        List<Dav_goods> list = davimpl.findAllByDavTab(parameters.get("FechaInicial"),parameters.get("FechaFinal"));
        System.out.println("Cantidad de elementos: "+list.size());


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

    }
*
* */

}
