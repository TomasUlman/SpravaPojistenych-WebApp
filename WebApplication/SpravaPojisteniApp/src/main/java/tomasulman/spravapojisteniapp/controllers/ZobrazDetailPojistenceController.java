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
 * Tento controller ovládá stránku detailPojistence, předává jí údaje o pojištěnci
 * a všechna jeho Pojištění předává do tabulky Pojištění.
 * @author TomasUlman
 */
@Controller
public class ZobrazDetailPojistenceController {

    @Autowired
    private ZaznamService zaznamService;
    
    @GetMapping("detailPojistence")
    public String zobrazDetailPojistence(Model model){
        List<PojisteniDTO> seznamPojisteni = zaznamService.nactiPojistence().getJehoPojisteni();
        model.addAttribute("pojistenec", zaznamService.nactiPojistence());
        model.addAttribute("seznamPojisteni", seznamPojisteni);
        return "detailPojistence";
    }
}
