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
import tomasulman.spravapojisteniapp.models.PojistenecDTO;
import tomasulman.spravapojisteniapp.models.ZaznamService;

/**
 * Tento Controller ovládá stránku novePoisteni, po vyplnění a uložení pojištěnce, 
 * přesměruje na stránku pojistenci, kde vypisuje do tabulky všechyn Pojištěnce
 * @author TomasUlman
 */
@Controller
@RequestMapping("novyPojistenec")
public class NovyPojistenecController {

    @Autowired
    private ZaznamService zaznamService;

    @GetMapping
    public String renderNovyPojistenec(@ModelAttribute PojistenecDTO pojistenecDTO) {
        return "novyPojistenec";
    }

    @PostMapping
    public String vytvorNovehoPojistence(@ModelAttribute PojistenecDTO pojistenecDTO, Model model) {
        zaznamService.vytvorPojistence(pojistenecDTO);
        List<PojistenecDTO> seznamPojistencu = zaznamService.getSeznamPojistencu();
        model.addAttribute("seznamPojistencu", seznamPojistencu);
        return "pojistenci";
    }

}
