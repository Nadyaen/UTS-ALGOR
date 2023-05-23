/* Nadya mahza khairani
227064516102
*/

import java.util.Scanner;
public class UtsEssay {
    public static void main(String[] args) {
        char kendaraan='w'; //deklarasi char nilai
	//nested if
	if (kendaraan=='m') //melakukan perulangan kendaraan
		System.out.println("Mobil");
	else if (kendaraan=='k')
		System.out.println("Kereta");
	else
		System.out.println("kendaraan apa itu?"); 

//tenary
		System.out.println(kendaraan=='m'? "Itu kereta." : "Itu bajaj");

//switch case
switch (kendaraan){ //cara untuk mengatasi banyak kemungkinan bermunculan
	case 'm' : System.out.println("itu pasti Mobil ");
	break;
	case 'k' : System.out.println("itu pasti Kereta ");
	break;
	default : System.out.println("itu pasti Bajaj ");
	break;
}}}
