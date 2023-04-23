/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomasulman.spravapojisteniapp.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tomasulman.spravapojisteniapp.models.PojisteniDTO;
import tomasulman.spravapojisteniapp.models.ZaznamService;

/**
 *
 * @author TomasUlman
 */
@Controller
public class PojisteniController {

    @Autowired
    private ZaznamService zaznamService;

    @GetMapping("pojisteni")
    public String zobrazDetailPojistence(Model model) {
        model.addAttribute("seznamVsechPojisteni", zaznamService.getSeznamVsechPojisteni());
        return "pojisteni";
    }

}
