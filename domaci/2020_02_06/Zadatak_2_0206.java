package itbootcamp.domaci2;

import java.util.Scanner;

public class Zadatak_2_0206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Zadatak 2: Napisati program koji na osnovu unetog naziva meseca ispisuje
		// koliko ima meseci u godini koji pocinju na to slovo(na taj glas) - za
		// resavanje ovog zadatka koristiti switch

		// januar, februar, mart, april, maj, jun, jul, avgust
		// septembar, oktobar, novembar, decembar

		Scanner sc = new Scanner(System.in);

		String mesec;
		char slovo;

		System.out.println(
				"Unesite mesec za koji se proverava prvo slovo, pocetno slovo treba da bude malo kako bi unos bio validan");

		mesec = sc.next();

		slovo = mesec.charAt(0);

		switch (mesec) {

		case "januar":
		case "jun":
		case "jul":
			System.out.println("Ima 3 meseca koji pocinju na slovo " + slovo);
			break;

		case "mart":
		case "maj":
		case "april":
		case "avgust":
			System.out.println("Ima 2 meseca koji pocinju na slovo " + slovo);

			break;

		case "februar":
		case "septembar":
		case "oktobar":
		case "novembar":
		case "decembar":

			System.out.println("Samo jedan mesec pocinje na slovo " + slovo);

			break;

		default:
			System.out.println("Niste uneli dobar naziv meseca");

			break;

		}

	}

}
