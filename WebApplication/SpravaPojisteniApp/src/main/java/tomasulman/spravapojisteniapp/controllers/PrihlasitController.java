/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomasulman.spravapojisteniapp.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tomasulman.spravapojisteniapp.models.UzivatelDTO;
import tomasulman.spravapojisteniapp.models.UzivatelService;

/**
 * Tento Controller ovládá stránku přihlásit, když se uživatel úspěšně přihlásí, 
 * tak přesměru na stránku pojistenci, pokud ne tak přesměruje znovu na přihlášení
 * @author TomasUlman
 */
@Controller
@RequestMapping("prihlasit")
public class PrihlasitController {

    @Autowired
    private UzivatelService uzivatelService;

    @GetMapping
    public String renderPrihlaseni(@ModelAttribute UzivatelDTO uzivatelDTO) {

        return "prihlasit";
    }

    @PostMapping
    public String prihlasUzivatele(@ModelAttribute UzivatelDTO uzivatelDTO) {
        if(uzivatelService.prihlasUzivatele(uzivatelDTO)){
            System.out.println("Přihlášen");
        return "redirect:/pojistenci";
        } else return "prihlasit";
    }    
}
