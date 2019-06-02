package ba.unsa.etf.rpr.tutorijal03;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Imenik {
    private HashMap<String, TelefonskiBroj> brojKorisnik = new HashMap<>();
    public Imenik(){

    }
    public void dodaj(String ime, TelefonskiBroj broj){
        brojKorisnik.putIfAbsent(ime,broj);
    }

    public String dajBroj(String ime){
        return brojKorisnik.get(ime).ispisi();
    }

    public String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String,TelefonskiBroj> elem : brojKorisnik.entrySet()){
            if(elem.getValue().compareTo(broj)==0) return elem.getKey();
        }
        return "";
    }

    public String naSlovo (char s){
        int br=1;
        StringBuilder ljudi = new StringBuilder();
        for(Map.Entry<String,TelefonskiBroj> elem : brojKorisnik.entrySet()){
            if(elem.getKey().charAt(0)==s){
                ljudi.append(String.format("%d. %s - %s\n", br, elem.getKey(), elem.getValue().ispisi()));
                br++;
            }
        }
        return ljudi.toString();
    }

    public Set<String> izGrada (FiksniBroj.Grad g){
        Set<String> coek = new TreeSet<>();
        for(Map.Entry<String,TelefonskiBroj> elem : brojKorisnik.entrySet()){
            TelefonskiBroj broj = elem.getValue();
            if(broj instanceof FiksniBroj){
                if(((FiksniBroj)broj).getGrad().equals(g)) coek.add(elem.getKey());
            }
        }
        return coek;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(FiksniBroj.Grad g){
        Set<TelefonskiBroj> brIzGrada = new TreeSet<>();
        for(Map.Entry<String,TelefonskiBroj> elem : brojKorisnik.entrySet()){
            TelefonskiBroj broj = elem.getValue();
            if(broj instanceof FiksniBroj){
                if(((FiksniBroj)broj).getGrad().equals(g)) brIzGrada.add(elem.getValue());
            }
        }
        return brIzGrada;
    }


    public HashMap<String, TelefonskiBroj> getBrojKorisnik() {
        return brojKorisnik;
    }
}
