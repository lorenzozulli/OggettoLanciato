/**
 * 
 */
package OggettoLanciato;

/**
 * @author Lorenzo Zulli
 *
 */
import java.lang.Math;
public class dado extends OggettoLanciato {
	public static void lancio() {
		// definiamo il range dei valori
		int range = 6;
		
		//generiamo il numero casuale in base al range dato
		int value = (int)(Math.random() * range) + 1;
		setLancio(value);
		//ho cambiato qui ***********
	}
}
