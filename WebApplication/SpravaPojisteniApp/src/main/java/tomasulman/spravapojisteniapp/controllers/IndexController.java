/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomasulman.spravapojisteniapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import tomasulman.spravapojisteniapp.models.ZaznamService;

/**
 *
 * @author TomasUlman
 */
@Controller
public class IndexController {

    @Autowired
    private ZaznamService zaznamService;
    
    @GetMapping("/index")
    public String index() {
            zaznamService.vytvorPrvniho();
        return "index";
    }

}
