/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomasulman.spravapojisteniapp.models;

import java.time.LocalDate;


/**
 *
 * @author TomasUlman
 */
public class PojisteniDTO {
    private String typ;
    private String castka;
    private String platnostOd;
    private String platnostDo;
    
    
    public PojisteniDTO(String typ, String castka, String platnostOd, String platnostDo){
        this.typ = typ;
        this.castka = castka;
        this.platnostOd = platnostOd;
        this.platnostDo = platnostDo;
    }

    /**
     * @return the typ
     */
    public String getTyp() {
        return typ;
    }

    /**
     * @param typ the typ to set
     */
    public void setTyp(String typ) {
        this.typ = typ;
    }

    /**
     * @return the castka
     */
    public String getCastka() {
        return castka;
    }

    /**
     * @param castka the castka to set
     */
    public void setCastka(String castka) {
        this.castka = castka;
    }    

    /**
     * @return the platnostOd
     */
    public String getPlatnostOd() {
        return platnostOd;
    }

    /**
     * @param platnostOd the platnostOd to set
     */
    public void setPlatnostOd(String platnostOd) {
        this.platnostOd = platnostOd;
    }

    /**
     * @return the platnostDo
     */
    public String getPlatnostDo() {
        return platnostDo;
    }

    /**
     * @param platnostDo the platnostDo to set
     */
    public void setPlatnostDo(String platnostDo) {
        this.platnostDo = platnostDo;
    }
}
