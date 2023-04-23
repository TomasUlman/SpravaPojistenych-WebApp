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
 * Tento controller ovládá tlačítko editovat v tabulce Pojištění vybraného pojištěnce,
 * načte pojištění a přesměruje na stránku editacePojisteni
 * @author TomasUlman
 */
@Controller
public class NactiPojisteniController {

    @Autowired
    private ZaznamService zaznamService;

    @GetMapping("/pojisteni/editovat/{typ}/{castka}")
    public String vyberPojisteni(@PathVariable String typ, @PathVariable String castka) {
        zaznamService.vyberPojisteni(typ, castka);
        return "redirect:/editacePojisteni";
    }
}
