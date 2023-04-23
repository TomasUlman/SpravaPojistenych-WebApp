/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomasulman.spravapojisteniapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author TomasUlman
 */
@Controller
public class OaplikaciController {

    @GetMapping("/oaplikaci")
    public String oaplikaci() {
        return "oaplikaci";
    }

}
