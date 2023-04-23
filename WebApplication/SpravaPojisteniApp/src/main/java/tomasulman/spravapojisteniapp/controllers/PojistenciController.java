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
import tomasulman.spravapojisteniapp.models.PojistenecDTO;
import tomasulman.spravapojisteniapp.models.PojisteniDTO;
import tomasulman.spravapojisteniapp.models.ZaznamService;

/**
 * Tento controller ovládá stránku pojištěnci, kde vypisuje všechny pojištěnce do tabulky
 * @author TomasUlman
 */
@Controller
public class PojistenciController {

    @Autowired
    private ZaznamService zaznamService;

    @GetMapping("pojistenci")
    public String renderPojistenci(Model model) {
        List<PojistenecDTO> seznamPojistencu = zaznamService.getSeznamPojistencu();
        model.addAttribute("seznamPojistencu", seznamPojistencu);
        return "pojistenci";
    }

}
