package com.contact.controller;

import com.contact.domain.UserInfo;
import com.contact.repositories.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Dao dao;

    @Autowired
     public Controller(Dao dao){
         this.dao= dao;
     }

     @PostMapping("submit-form")
     public String addUser(UserInfo userInfo){
        dao.save(userInfo);
        return "Data sumbitted successfully";
     }
}
