package com.example.demo.controller;

import com.example.demo.models.JsonModel;
import com.example.demo.repos.JsonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class GetJsonController {
    @Autowired
    JsonRepo jsonRepo;
    @PostMapping("/")
    public void getJson(@RequestBody String str){
        JsonModel jsonModel = new JsonModel();
        jsonModel.setJson(str);
        jsonRepo.save(jsonModel);
    }
}
