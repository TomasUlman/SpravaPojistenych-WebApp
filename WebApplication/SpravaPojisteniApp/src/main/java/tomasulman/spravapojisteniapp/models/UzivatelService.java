/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomasulman.spravapojisteniapp.models;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author TomasUlman
 */
@Service
public class UzivatelService {

    //Seznam všech registrovaných uživatelů
    private List<UzivatelDTO> seznamUzivatelu = new ArrayList<>();

    //Metoda vytváří nového uživatele a přídává ho do seznamu uživatelů
    public void vytvorUzivatele(UzivatelDTO uzivatel) {
        seznamUzivatelu.add(new UzivatelDTO(uzivatel.getJmeno(), uzivatel.getHeslo(), uzivatel.getHesloZnovu()));
    }

    //Metoda ověřuje zda údaje přihlašujícího uživatele existují, pokud ano, metoda vrátí true.
    public boolean prihlasUzivatele(UzivatelDTO uzivatel) {
        boolean validator = false;
        for (UzivatelDTO u : seznamUzivatelu) {
            if (u.getJmeno().equals(uzivatel.getJmeno()) && u.getHeslo().equals(uzivatel.getHeslo())) {
                validator = true;
                break;
            }
        }
        return validator;
    }

    /**
     * @return the seznamUzivatelu
     */
    public List<UzivatelDTO> getSeznamUzivatelu() {
        return seznamUzivatelu;
    }

}
