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
 * Tento Controller ovládá stránku registrovat, pokud se uživatel úspěšně přihlásí, 
 * tak přesměruje na stránku prihlasit, pokud ne, tak přesměruje zpět na registraci
 * @author TomasUlman
 */
@Controller
@RequestMapping("registrovat")
public class RegistrovatController {

    @Autowired
    private UzivatelService uzivatelService;

    @GetMapping
    public String renderNovyUzivatel(@ModelAttribute UzivatelDTO uzivatelDTO) {

        return "registrovat";
    }

    @PostMapping
    public String vytvorNovehoUzivatele(@ModelAttribute UzivatelDTO uzivatelDTO, Model model) {
        List<String> uzivatelskaJmena = new ArrayList<>();
        for(UzivatelDTO uzivatel : uzivatelService.getSeznamUzivatelu()){
            uzivatelskaJmena.add(uzivatel.getJmeno());
        }
        if (uzivatelskaJmena.contains(uzivatelDTO.getJmeno())) return "registrovat"; else {
            uzivatelService.vytvorUzivatele(uzivatelDTO);
            return "redirect:/prihlasit";
        }

    }

}
