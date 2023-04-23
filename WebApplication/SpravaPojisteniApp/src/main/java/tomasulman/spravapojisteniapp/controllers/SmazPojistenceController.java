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
 * tento Controller ovládá kliknutí na tlačítko odstrnit v tabulce Pojištěnci
 * a také tlačítko odstranit pojištěnce na stránce detailPojistence. 
 * Po kliknutí pojištěnce odstraní a přesměruje na stránku pojistenci
 * @author TomasUlman
 */
@Controller
public class SmazPojistenceController {

    @Autowired
    private ZaznamService zaznamService;

    @GetMapping("/pojistenci/odstranit/{jmeno}/{prijmeni}/{telefon}")
    public String smazPojistence(@PathVariable String jmeno, @PathVariable String prijmeni, @PathVariable String telefon) {
        zaznamService.smazPojistence(jmeno, prijmeni, telefon);
        return "redirect:/pojistenci";
    }
}
