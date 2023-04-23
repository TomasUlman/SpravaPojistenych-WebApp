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
 * Tento controller ovládá tlačítko editovat v tabulce Pojištěnci, načte pojištěnce
 * a přesměruje na stránku editace
 * @author TomasUlman
 */
@Controller
public class NactiPojistenceController {

    @Autowired
    private ZaznamService zaznamService;

    @GetMapping("/pojistenci/editovat/{jmeno}/{prijmeni}/{telefon}")
    public String vyberPojistence(@PathVariable String jmeno, @PathVariable String prijmeni, @PathVariable String telefon) {
            zaznamService.vyberPojistence(jmeno, prijmeni, telefon);
        return "redirect:/editace";
    }
}
