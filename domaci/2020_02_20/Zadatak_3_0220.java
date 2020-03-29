package domaci_zadaci;

public class Zadatak_3_0220 {

    public static void main (String [] args) {

            int a=3, b=2, c=7;

            b = ++a; /*vrednost promenljive a se povecava za 1 i njegova nova
				vrednost se dodeljuje promenljivoj b */
            a = b++; /*vrednost promenljive b se dodeljuje promenljivoj a, a zatim
				se vrednost promenljive b povecava za 1 */
            c = b--; /*vrednost promenljive b se dodeljuje promenljivoj a, a zatim
				se vrednost promenljive b umanjuje za 1*/
            b = --c; /*vrednost promenljive c se umanjuje za 1 i njegova nova
				vrednost se dodeljuje promenljivoj b */
            b = a++ + --c; /*umanji vrednost promenljive c za 1 i tome dodaj
						vrednost promenljive a. Dobijenu vrednost dodeli
						promenljivoj b i promenljivu a uvecaj za 1 */
            a = b-- - c++; /*od vrednosti promenljive b oduzmi vrednost
					promenljive c i dobijenu vrednost dodeli promenljivoj a.
					 Zatim umanji vrednost promenljive b za jedan a uvecaj
					 vrednost promenljive c za 1 */
            a *= c = b++; /*vrednost promenljive b dodeli promenljivoj c,
					zatim b uvecaj za 1. Prethodnu vrednost promenljive
					a pomnozi sa vrednoscu promenljive c i tako dobijenu
					vrednost dodeli promenljivoj a */
            c /= b *= --a; /*promenljivu a umanji za 1. Uzmi prethodnu vrednost
					promenljive b pomnozi novodobijenom vrednoscu promenljive
					 a, i tu vrednost dodeli promenljivoj b a zatim uzmi
					 prethodnu vrednost promenljive c i podeli je sa
					 novom vrednoscu promenljive b */
            System.out.println("Vrednosti brojeva a, b i c su "+a+", "+b+", "+c);

        }
    }

