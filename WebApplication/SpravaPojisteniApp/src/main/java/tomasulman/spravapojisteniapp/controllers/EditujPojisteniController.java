/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomasulman.spravapojisteniapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tomasulman.spravapojisteniapp.models.PojisteniDTO;
import tomasulman.spravapojisteniapp.models.ZaznamService;

/**
 * Tento controller ovládá kliknutí na tlačítko editovat v tabulce Pojištění na detailu pojiěštěnce
 * Po zeditování pojištění přesměruje na detailPojistence
 * @author TomasUlman
 */
@Controller
@RequestMapping("editacePojisteni")
public class EditujPojisteniController {

    @Autowired
    private ZaznamService zaznamService;

    @GetMapping
    public String editace(@ModelAttribute PojisteniDTO pojisteniDTO, Model model) {
        model.addAttribute("pojisteni", zaznamService.nactiPojisteni());
        return "editacePojisteni";
    }

    @PostMapping
    public String zmenPojisteni(@ModelAttribute PojisteniDTO pojisteniDTO) {
        zaznamService.editujPojisteni(pojisteniDTO);
        return "redirect:/detailPojistence";
    }
}
