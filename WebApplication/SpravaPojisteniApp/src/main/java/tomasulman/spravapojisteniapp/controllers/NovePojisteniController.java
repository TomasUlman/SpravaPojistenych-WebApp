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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tomasulman.spravapojisteniapp.models.PojisteniDTO;
import tomasulman.spravapojisteniapp.models.ZaznamService;

/**
 * Tento controller ovládá stránku novepojisteni
 * po vyplnění nového pojištění a uložení, jej vytvoří a přesměruje na detailPojistence
 * @author TomasUlman
 */
@Controller
@RequestMapping("novePojisteni")
public class NovePojisteniController {

    @Autowired
    private ZaznamService zaznamService;

    @GetMapping
    public String renderNovePojisteni(@ModelAttribute PojisteniDTO pojisteniDTO) {
        return "novePojisteni";
    }

    @PostMapping
    public String vytvorNovePojisteni(@ModelAttribute PojisteniDTO pojisteniDTO, Model model) {
        zaznamService.vytvorPojisteni(pojisteniDTO);
        List<PojisteniDTO> seznamPojisteni = zaznamService.nactiPojistence().getJehoPojisteni();
        model.addAttribute("seznamPojisteni", seznamPojisteni);
        return "redirect:/detailPojistence";
    }
}
