/**
 * 
 */
package OggettoLanciato;
/**
 * @author Lorenzo Zulli
 *
 */
import java.util.Scanner;

public class LancioDadoMoneta {
	public static void main(String[] args) {
		Scanner myScan=new Scanner(System.in);
		byte operation;
		byte retry;
		//Serve a rendere il programma un loop fino a quanto non si vuole smettere
		do {
			//INPUT ZONE
			do {
				System.out.println(">>> Inserire operazione da eseguire");
				System.out.println("	1> Lancio Dado");
				System.out.println("	2> Lancio Moneta");
				System.out.print(">>> Operazione: ");
				operation = myScan.nextByte();
			}while(operation != 1 && operation != 2);
			
			//Eseguiamo l'operazione corrispondente all'input zone
			switch(operation) {
				case 1: 
					dado.lancio();
					System.out.println(OggettoLanciato.getLancio());break;
				case 2:
					moneta.lancio();
					if(OggettoLanciato.getLancio() == 1)
						System.out.println("Testa!");
					else
						System.out.println("Croce!");break;
			}
			
			//Sistema per riprovare
				System.out.println(">>> Vuoi Riprovare(1=si, altro numero=no)?");
				System.out.print(">>> Operazione: ");
				retry = myScan.nextByte();
		}while(retry == 1);
	}
}
