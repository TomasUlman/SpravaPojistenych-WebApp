/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomasulman.spravapojisteniapp.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TomasUlman
 */
public class PojistenecDTO {

    /* Inicializace atributů */
    private String jmeno;
    private String prijmeni;
    private String uliceACislo; // Ulice a číslo popisné
    private String mesto;
    private String psc;
    private String email;
    private String telefon;
    private List<PojisteniDTO> jehoPojisteni; 

    /* Konstruktor */
    public PojistenecDTO(String jmeno, String prijmeni, String uliceACislo, String mesto, String psc, String email, String telefon, List<PojisteniDTO> jehoPojisteni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.uliceACislo = uliceACislo;
        this.mesto = mesto;
        this.psc = psc;
        this.email = email;
        this.telefon = telefon;
        this.jehoPojisteni = jehoPojisteni;
    }

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @param jmeno the jmeno to set
     */
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    /**
     * @return the prijmeni
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * @param prijmeni the prijmeni to set
     */
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    /**
     * @return the uliceACislo
     */
    public String getUliceACislo() {
        return uliceACislo;
    }

    /**
     * @param uliceACislo the uliceACislo to set
     */
    public void setUliceACislo(String uliceACislo) {
        this.uliceACislo = uliceACislo;
    }

    /**
     * @return the mesto
     */
    public String getMesto() {
        return mesto;
    }

    /**
     * @param mesto the mesto to set
     */
    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefon
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * @param telefon the telefon to set
     */
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    /**
     * @return the psc
     */
    public String getPsc() {
        return psc;
    }

    /**
     * @param psc the psc to set
     */
    public void setPsc(String psc) {
        this.psc = psc;
    }

    /**
     * @return the jehoPojisteni
     */
    public List<PojisteniDTO> getJehoPojisteni() {
        return jehoPojisteni;
    }

    /**
     * @param jehoPojisteni the jehoPojisteni to set
     */
    public void setJehoPojisteni(List<PojisteniDTO> jehoPojisteni) {
        this.jehoPojisteni = jehoPojisteni;
    }

}
