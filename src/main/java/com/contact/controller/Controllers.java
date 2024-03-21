package com.contact.controller;

import com.contact.domain.UserInfo;
import com.contact.repositories.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Controllers {

    private Dao dao;

    @Autowired
     public Controllers (Dao dao){
         this.dao= dao;
     }

     @PostMapping("submit-form")
     public String addUser(UserInfo userInfo){
        dao.save(userInfo);
        return "redirect:/Contactus_Dental.html";
     }
}
