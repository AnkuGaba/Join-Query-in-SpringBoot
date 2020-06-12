package com.icsd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icsd.dom.StudentDetail;
import com.icsd.model.StudentEntity;
import com.icsd.services.QueryService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import java.util.List;

@RestController
@RequestMapping("/api")
public class QueryController {

    @Autowired
    QueryService queryservice;

    @GetMapping("/joinQuery")
    public List<StudentDetail> getQuery()
    {
    	System.out.println("join Query called .........");
        return queryservice.JPQLQuery();
    }
    
    
//    http://localhost:8081/api/studentData
    @GetMapping("/studentData")
    public List<StudentEntity> getstudentData()
    {
    	System.out.println("student Entity called .......");
        return queryservice.studentAllData();
    }
}