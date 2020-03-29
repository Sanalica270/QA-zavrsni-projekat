package domaci_zadaci.klase.pozoriste;

public class Pozoriste {

    /*
     * Pozoriste ima jednoznacan automatski generisan celobrojan identifikator i
     * naziv koji mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku
     * naziv[id].
     */

    private static int idGlobal = 1;
    private int id;
    private String name;

    public Pozoriste(String name) {
        this.name = name;
        this.id = idGlobal;
        idGlobal++;
    }

    public static int getIdGlobal() {
        return idGlobal;
    }

    public String getName() {
        return name;
    }
    @Override

    public String toString() {
        StringBuilder sb = new StringBuilder();
        return sb.append(name).append("[").append(id).append("].").toString();
    }


}
