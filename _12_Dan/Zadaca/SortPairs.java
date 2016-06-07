import java.text.DecimalFormat;

public class SortPairs {
	// metoda za poredjenje i sortiranje dva para u nekom nizu
	// uzima niz i dva indeksa u tom nizu kao argumente
	// vraca false ako nije bilo potrebe da se sortira
	// a sortira parove i vraca true ako je potrebno
	public static boolean pairsNeedToBeSorted(double[] parovi, int first, int second) {
		if (parovi[first] > parovi[second]) {
			double tmp = parovi[first];
			parovi[first] = parovi[second];
			parovi[second] = tmp;
			return true;
		}
		return false;
	}
	// metoda za sortiranje niza double elemenata koristeci boubble logiku
	// sortira sve parove i nizu po redu i prolazi vise puta kroz niz
	// ali svaki put izostavlja zadnje sortirane elemente
	// ako je niz sortiran prekida sortiranje i vraca niz kao double[]
	public static double[] sortEveryNextLowHigh(double[] parovi) {
		boolean wip;
		int loopTimes = 0;
		do {
			wip = false;
			for (int i = 0; i < parovi.length-1-loopTimes; i++) {
				if (pairsNeedToBeSorted(parovi, i, i+1)) {
					wip = true;
				}
			}
			loopTimes++;
		} while (wip);
		System.out.println("Trebalo je " + loopTimes + " puta sortirati niz.");
		return parovi;
	}
	public static void main(String[] args) {
		
		double[] randomNumList = new double[10]; 
		
		for (int i = 0; i < randomNumList.length; i++) {
			double randNum = Math.random() * 10;
			DecimalFormat df2 = new DecimalFormat("##.##");
			randomNumList[i] = Double.valueOf(df2.format(randNum));
		}
		
		for (int j = 0; j < randomNumList.length; j++) {
			System.out.print(randomNumList[j] + " ");
		}
		
		System.out.println();
		randomNumList = sortEveryNextLowHigh(randomNumList);
		
		for (int j = 0; j < randomNumList.length; j++) {
			System.out.print(randomNumList[j] + " ");
		}
	}
}
