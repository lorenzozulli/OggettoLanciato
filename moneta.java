/**
 * 
 */
package OggettoLanciato;

/**
 * @author Lorenzo Zulli
 *
 */
import java.util.Random;
public class moneta extends OggettoLanciato{
	public static void lancio() {
		//creiamo lo "scanner" di valori casuali
		Random pippo = new Random();
		
		//diamo il valore casuale alla variabile, tra 0 e 1;
		int value = pippo.nextInt(2);
		
		setLancio(value);
	}
}
