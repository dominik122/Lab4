package pl.lublin.wsei.java.cwiczenia;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Infografika {
    public String tytul;
    public String adresStrony;
    public String adresGrafiki;
    public String adresMiniaturki;
    public String szerokosc;
    public String wysokosc;

    public Infografika(String tekst){

        Pattern pat = Pattern.compile("<title><!\\[CDATA\\[(.*)\\]\\]");
        Matcher match = pat.matcher(tekst);
        if(match.find()){
            tytul = match.group(1);
        } else{
            tytul = "";
        }

        pat = Pattern.compile("<link>(.*)<\\/link>");
        match = pat.matcher(tekst);
        if(match.find()){
            adresStrony = match.group(1);
        } else{
            adresStrony = "";
        }

        pat = Pattern.compile("url=\\\"(.*)\\\" type");
        match = pat.matcher(tekst);
        if(match.find()){
            adresGrafiki = match.group(1);
        } else{
            adresGrafiki = "";
        }

        pat = Pattern.compile("width=\\\"(.*)\\\" height");
        match = pat.matcher(tekst);
        if(match.find()){
            szerokosc = match.group(1);
        } else{
            szerokosc = "";
        }

        pat = Pattern.compile("height=\\\"(.*)\\\">");
        match = pat.matcher(tekst);
        if(match.find()){
            wysokosc = match.group(1);
        } else{
            wysokosc = "";
        }

        pat = Pattern.compile("url=\\\"(.*)\\\" \\/>");
        match = pat.matcher(tekst);
        if(match.find()){
            adresMiniaturki = match.group(1);
        } else{
            adresMiniaturki = "";
        }

    }
}
