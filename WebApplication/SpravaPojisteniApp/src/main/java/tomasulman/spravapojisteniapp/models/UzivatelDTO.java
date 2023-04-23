/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomasulman.spravapojisteniapp.models;

/**
 *
 * @author TomasUlman
 */
public class UzivatelDTO {
    private String jmeno;
    private String heslo;
    private String hesloZnovu;
    
    public UzivatelDTO(String jmeno, String heslo, String hesloZnovu){
        this.jmeno = jmeno;
        this.heslo = heslo;
        this.hesloZnovu = hesloZnovu;
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
     * @return the heslo
     */
    public String getHeslo() {
        return heslo;
    }

    /**
     * @param heslo the heslo to set
     */
    public void setHeslo(String heslo) {
        this.heslo = heslo;
    }

    /**
     * @return the hesloZnovu
     */
    public String getHesloZnovu() {
        return hesloZnovu;
    }

    /**
     * @param hesloZnovu the hesloZnovu to set
     */
    public void setHesloZnovu(String hesloZnovu) {
        this.hesloZnovu = hesloZnovu;
    }
}
