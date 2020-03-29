package domaci_zadaci.klase.pozoriste;

import java.util.ArrayList;

public class Predstava {

    /*
     * Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene
     * koji ucestvuju u realizaciji predstave. Zaposleni za realizaciju predstave
     * mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
     * Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv
     * pozorista u kojem se predstava odrzava razdvojene zarezom, a potom zaposlene
     * koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).
     */

    private String name;
    private Pozoriste theatre;
    private ArrayList<Zaposleni> employees;

    public Predstava(String name, Pozoriste theatre) {
        this.name = name;
        this.theatre = theatre;
        this.employees = new ArrayList<Zaposleni>();
    }

    public void addEmployees(Zaposleni employee) {
        employees.add(employee);
    }

    public void removeEmpoloyee(Zaposleni employee) {
        employees.remove(employee);
    }

    public int numbOfEmployees() {
        return employees.size();
    }

    @Override

    public String toString() {
        int empNumb = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(", ").append(theatre.getName()).append(". ").append("\n");
        for (int i = 0; i < employees.size(); i++) {
            sb.append(employees.get(i).getFullName());
            empNumb++;
            if (i != (employees.size() - 1)) {
                sb.append("\n");
            }
        }
        if (empNumb == 0) {
            sb.append("Nema zaposlenih na ovoj predstavi!");
        }
        return sb.toString();
    }
}
