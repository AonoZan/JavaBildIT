/**
 * @autor Dejan Petrovic
 */

public class PopulationProjection {

	public static void main(String[] args) {
		// yearSeconds = every year has how many sec?
		// yearBirth = one chuild every 7-th sec
		// yearDeath = someone dies every 13-th sec
		// yearImmigrant = they god one immigrant every 45-th sec
		// yearLifeForms = yearBirth - yearDeath + yearImmigrant

		double yearSeconds = 365*24*60*60;
		
		double yearBirth = yearSeconds / 7.0;
		double yearDeath = yearSeconds / 13;
		double yearImmigrant = yearSeconds / 45;
		double yearLifeForms = yearBirth - yearDeath + yearImmigrant;

		// kreiraj trenutnu populaciju
		// a kasnije samo dodaj godisnju populaciju na to
		double currentYearLifeForms = 31236486;
		
		// serviraj rezultat
		System.out.println("Aproximated population in USA for years:");
		for (int year = 2017; year < 2022; year++) {
			System.out.printf("%d : %.0f\n", year, currentYearLifeForms);
			currentYearLifeForms += yearLifeForms;
		}
	}

}
