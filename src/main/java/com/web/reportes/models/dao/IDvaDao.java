package com.web.reportes.models.dao;

import com.web.reportes.models.entity.Dav_goods;
import com.web.reportes.models.entity.Dav_tab;
import com.web.reportes.models.entity.DvaResponse;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface IDvaDao extends CrudRepository<Dav_tab,Integer> {


}
