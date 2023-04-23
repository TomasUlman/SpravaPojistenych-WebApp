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
 * Tento controller ovládá kliknutí na tlačítko editovat v tabulce Pojištěnci
 * Po zeditování pojištěnce přesměruje na detailPojistence
 * @author TomasUlman
 */
@Controller
@RequestMapping("editace")
public class EditujPojistenceController {

    @Autowired
    private ZaznamService zaznamService;

    @GetMapping
    public String editujPojistence(@ModelAttribute PojistenecDTO pojistenecDTO, Model model){
        model.addAttribute("pojistenec", zaznamService.nactiPojistence());
        return "editace";
    }

    @PostMapping
    public String zmenPojistence(@ModelAttribute PojistenecDTO pojistenecDTO) {
        zaznamService.editujPojistence(pojistenecDTO);
        return "redirect:/detailPojistence";
    }
}
