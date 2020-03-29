package domaci_zadaci.klase.drugi;

import com.sun.xml.internal.ws.model.wsdl.WSDLPortTypeImpl;

import java.util.Arrays;

public class Sport {
    //Napisati glavni program, gde cete testirati kako ove klase funkcionisu.

    public static void main(String[] args) {

        Klub k1 = new Klub("Beograd", 1945, 3);
        Klub k2 = new Klub("Novi Sad", 1948, 2);


        k1.setNaziv("Partizan");
        k2.setNaziv("Vojvodina");


        Sportista s1 = new Sportista("Pera", "Peric", 1990);
        Sportista s2 = new Sportista("Laza", "Lazic", 1995);
        Sportista s3 = new Sportista("Mika", "Mikic", 1986);
        Sportista s4 = new Sportista("Jova", "Jovic", 1990);
        Sportista s5 = new Sportista("Mirko", "Miric", 1995);
        Sportista s6 = new Sportista("Slavko", "Slavcic", 1986);

        k1.dodajSportistu(s1);
        k1.dodajSportistu(s2);
        k1.dodajSportistu(s3);
        k1.dodajSportistu(s4);
        k1.ukloniSportistu(s1);
        k1.dodajSportistu(s5);

        k2.dodajSportistu(s4);
        k2.dodajSportistu(s6);

        System.out.println(k1);
        System.out.println(k1.getBrSportista());
        System.out.println(Arrays.toString(k2.getSportiste()));
        System.out.println(s3.getGodRodj());

    }

}
