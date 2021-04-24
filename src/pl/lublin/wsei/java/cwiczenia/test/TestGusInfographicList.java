package pl.lublin.wsei.java.cwiczenia.test;

import pl.lublin.wsei.java.cwiczenia.GusInfographicList;
import pl.lublin.wsei.java.cwiczenia.Infografika;

public class TestGusInfographicList {
    public static void main(String[] args){
        GusInfographicList list = new GusInfographicList("gusInfoGraphic.xml");

        for(Infografika i: list.infografiki) i.print();
    }
}
