/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomasulman.spravapojisteniapp.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author TomasUlman
 */
@Service
public class ZaznamService {

    // List pro evidenci všech pojištěnců
    private final List<PojistenecDTO> seznamPojistencu = new ArrayList<>();

    /**
     * Metoda bere data z formuláře ze stránky novyPojistenec.html, následně je
     * přiřazuje k objektu pojistenec, který je vložen do Listu seznamPojistencu
     *
     * @param pojistenec
     */
    public void vytvorPojistence(PojistenecDTO pojistenec) {
        seznamPojistencu.add(new PojistenecDTO(pojistenec.getJmeno(), pojistenec.getPrijmeni(),
                pojistenec.getUliceACislo(), pojistenec.getMesto(), pojistenec.getPsc(),
                pojistenec.getEmail(), pojistenec.getTelefon(), new ArrayList<PojisteniDTO>()));
    }

    /**
     * Metoda smaže pojištěnce z Listu seznamPojistencu podle jména a příjmení
     *
     * @param jmeno
     * @param prijmeni
     * @param telefon
     */
    public void smazPojistence(String jmeno, String prijmeni, String telefon) {
        Iterator<PojistenecDTO> iterator = seznamPojistencu.iterator();
        while (iterator.hasNext()) {
            PojistenecDTO pojistenec = iterator.next();
            if (pojistenec.getJmeno().equals(jmeno) && pojistenec.getPrijmeni().equals(prijmeni) && pojistenec.getTelefon().equals(telefon)) {
                iterator.remove();
            }
        }
    }

    /**
     * Metoda vybere pojištěnce z Listu seznamPojistencu podle jména a příjmení
     * a vrátí jeho index v Listu
     *
     * @param jmeno
     * @param prijmeni
     */
    private int index = -1;

    public int vyberPojistence(String jmeno, String prijmeni, String telefon) {

        Iterator<PojistenecDTO> iterator = seznamPojistencu.iterator();
        while (iterator.hasNext()) {
            PojistenecDTO pojistenec = iterator.next();
            if (pojistenec.getJmeno().equals(jmeno) && pojistenec.getPrijmeni().equals(prijmeni) && pojistenec.getTelefon().equals(telefon)) {
                index = seznamPojistencu.indexOf(pojistenec);
                break;
            }
        }
        return index;
    }

    /**
     * V kontroleru EditaceController se vytvoří nový objekt PojistenecDTO,
     * který je předán v parametru této metodě. A následně jsou jeho údaje
     * použity ke změně údajů pojištěnce na pozici index.
     *
     * @param pojistenec
     */
    public void editujPojistence(PojistenecDTO pojistenec) {
        PojistenecDTO zmenenyPojistenec = new PojistenecDTO(pojistenec.getJmeno(), pojistenec.getPrijmeni(),
                pojistenec.getUliceACislo(), pojistenec.getMesto(), pojistenec.getPsc(),
                pojistenec.getEmail(), pojistenec.getTelefon(), nactiPojistence().getJehoPojisteni());
        if (index != -1) {
            seznamPojistencu.set(index, zmenenyPojistenec);
        }

    }

    /**
     * Metoda načítá pojištěnce ze seznamPojistencu v momentě kdy uživatel
     * klikne na jeho jméno v tabulce
     *
     * @return pojistenec
     */
    public PojistenecDTO nactiPojistence() {
        PojistenecDTO pojistenec = seznamPojistencu.get(index);
        return pojistenec;
    }

    /**
     * @return the seznamPojistencu
     */
    public List<PojistenecDTO> getSeznamPojistencu() {
        return seznamPojistencu;
    }

    /**
     * Metoda vytváří nové pojištění a vkládá ho do listu jehoPojisteni(atribut
     * pojistence)
     *
     * @param pojisteni
     */
    public void vytvorPojisteni(PojisteniDTO pojisteni) {
        PojistenecDTO pojistenec = nactiPojistence();
        List<PojisteniDTO> upravenySeznam = pojistenec.getJehoPojisteni();
        upravenySeznam.add(pojisteni);
        pojistenec.setJehoPojisteni(upravenySeznam);
    }

    /**
     * Metoda vymaže pojištění ze seznamu pojištění danného uživatele
     *
     * @param typ
     * @param castka
     */
    public void smazPojisteni(String typ, String castka) {
        Iterator<PojisteniDTO> iterator = nactiPojistence().getJehoPojisteni().iterator();
        while (iterator.hasNext()) {
            PojisteniDTO pojisteni = iterator.next();
            if (pojisteni.getTyp().equals(typ) && pojisteni.getCastka().equals(castka)) {
                iterator.remove();
            }
        }
    }
    /**
     * Metoda vybere pojištění z Listu jehoPojisteni, vybraného pojištěnce a
     * vrátí jeho index v Listu
     */
    private int indexPojisteni = -1;

    public int vyberPojisteni(String typ, String castka) {
        Iterator<PojisteniDTO> iterator = nactiPojistence().getJehoPojisteni().iterator();
        while (iterator.hasNext()) {
            PojisteniDTO pojisteni = iterator.next();
            if (pojisteni.getTyp().equals(typ) && pojisteni.getCastka().equals(castka)) {
                indexPojisteni = nactiPojistence().getJehoPojisteni().indexOf(pojisteni);
                break;
            }
        }
        return indexPojisteni;
    }

    /**
     * Metoda načítá pojištění ze seznamu jehoPojisteni, dále s tímto pojištěním
     * můžeme pracovat
     *
     * @return
     */
    public PojisteniDTO nactiPojisteni() {
        PojisteniDTO pojisteni = nactiPojistence().getJehoPojisteni().get(indexPojisteni);
        return pojisteni;
    }

    /**
     * Metoda vybere pojištění podle indexu z metody vyberPojisteni a edituje ho
     *
     * @param pojisteni
     */
    public void editujPojisteni(PojisteniDTO pojisteni) {
        if (indexPojisteni != -1) {
            nactiPojistence().getJehoPojisteni().set(indexPojisteni, pojisteni);
        }

    }

    /**
     * Metoda vytváří a vrací seznam všech pojištění, které mají pojištěnci.
     *
     * @return
     */
    public List<PojisteniDTO> getSeznamVsechPojisteni() {
        List<PojisteniDTO> seznamVsechPojisteni = new ArrayList<>();
        for (PojistenecDTO pojistenec : seznamPojistencu) {
            for (PojisteniDTO pojisteni : pojistenec.getJehoPojisteni()) {
                seznamVsechPojisteni.add(pojisteni);
            }
        }
        return seznamVsechPojisteni;
    }
    /*
    public void vytvorPrvniho() {
        List<PojisteniDTO> pojisteni = new ArrayList<>();
        pojisteni.add(new PojisteniDTO("Pojištění majetku", "1 000 000", "1.1.2022", "1.1.2023"));
        pojisteni.add(new PojisteniDTO("Povinné ručení", "100 000 000", "1.5.2022", "1.5.2023"));
        seznamPojistencu.add(new PojistenecDTO("Jan", "Novák", "Pražská 4", "České Budějovice", "370 01", "jan.novak@seznam.cz", "608 351 458", pojisteni));
    }
    */
}
