/**@autor AonoZan Dejan Petrovic 2016 ©
 */

public class _11_PopulationProjection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int poppulation = 312032468;
		int yearSeconds = 365*24*60*60;
		
		double births = yearSeconds/7;
		double deaths = yearSeconds/13;
		double immigrants = yearSeconds/45;
		System.out.println("Current population: " + poppulation);
		for (int year = 2017; year <= 2021; year++) {
			poppulation += (births + immigrants - deaths);
			System.out.printf("%d year poppulation is: %12d\n", year, poppulation);
		}
	}

}
