/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomasulman.spravapojisteniapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tomasulman.spravapojisteniapp.models.ZaznamService;

/**
 * Tento Controller ovládá kliknutí na tlačítko odstranit v tabulce Pojištění 
 * na stránce detailPojistence, odstraní jej ze seznamu a přesměruje na stránku detailPojistence
 * 
 * @author TomasUlman
 */
@Controller
public class SmazPojisteniController {

    @Autowired
    private ZaznamService zaznamService;

    @GetMapping("/pojisteni/odstranit/{typ}/{castka}")
    public String smazaniPojisteni(@PathVariable String typ, @PathVariable String castka) {
        zaznamService.smazPojisteni(typ, castka);
        return "redirect:/detailPojistence";
    }
}
