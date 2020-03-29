package domaci_zadaci.klase.prvi;

public class GlavniSportista {

    public static void main (String[] args){

        Sportista s1 = new Sportista("Jelena Obradovic", "umetnicko klizanje");
        Sportista s2 = new Sportista("Marija Bukorovic", "odbojka");
        Sportista s3 = new Sportista("Dusan Ivankovic", "hokej");

        s1.setKlub("Mladost");
        s1.setBroj(7);

        s2.setKlub("Oslobodioci");
        s2.setBroj(12);

        s3.setKlub("Partizan");
        System.out.println(s3.getKlub());
        s3.setKlub("Olimpija");
        s3.setBroj(96);

        System.out.println(s2.getBroj());
        System.out.println(s1.getImeP());
        System.out.println(s1.getKlub());
        System.out.println(s3.toString());
    }
}
