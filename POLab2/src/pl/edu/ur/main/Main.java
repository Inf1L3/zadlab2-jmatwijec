package pl.edu.ur.main;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

    public static void bubbleSort(int[] numArray) { //kod z :https://stackoverflow.com/questions/16088994/sorting-an-array-of-int-using-bubblesort

        int n = numArray.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }

            }
        }
    }

    /**
     * @param args the command line arguments // TODO zad 3, 4, 6, 7
     */
    public static void main(String[] args) {
        //zad 3
        /*
        float[] tab = new float[10];
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj 10 liczb rzeczywistych");
        for (int i = 0; i < 10; i++) {
            tab[i] = odczyt.nextFloat();
        }
        do {
            System.out.println("Co chcesz zrobic? 1 Wyświetlanie tablicy od pierwszego do ostatniego indeksu. "
                    + "2.Wyświetlanie tablicy od ostatniego do pierwszego indeksu. 3."
                    + "Wyświetlanie elementów o nieparzystych indeksach."
                    + "4.Wyświetlanie elementów o parzystych indeksach. 5. Wyjscie");
            int liczba = odczyt.nextInt();
            if (liczba == 1) {
                for (int i = 0; i < 10; i++) {
                    System.out.println(tab[i]);
                }
            } else if (liczba == 2) {
                for (int i = 9; i >=0; i--) {
                    System.out.println(tab[i]);
                }
            } else if (liczba == 3) {
                for (int i = 1; i < 10; i += 2) {
                    System.out.println(tab[i]);
                }
            } else if (liczba == 4) {
                for (int i = 0; i < 10; i += 2) {
                    System.out.println(tab[i]);
                }
            } else if (liczba == 5) {
                break;
            }
        } while (true);
         */

        //zad4
        /*
        float[] tab = new float[10];
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj 10 liczb rzeczywistych");
        for (int i = 0; i < 10; i++) {
            tab[i] = odczyt.nextFloat();
        }
        do {
            System.out.println("1.oblicz sumę elementów tablicy,\n"
                    + "2.oblicz iloczyn elementów tablicy,\n"
                    + "3.wyznacz wartość średnią,\n"
                    + "4.wyznacz wartość minimalną,\n"
                    + "5.wyznacz wartość maksymalną \n"
                    + "6.Wyjscie");
            int liczba = odczyt.nextInt();
            float suma = 0;
            if (liczba == 1) {
                for (int i = 0; i < 10; i++) {
                    suma += tab[i];
                }
                System.out.println(suma);
            } else if (liczba == 2) {
                float iloczyn = 1;
                for (int i = 0; i < 10; i++) {
                    iloczyn *= tab[i];
                }
                System.out.println(iloczyn);
            } else if (liczba == 3) {
                for (int i = 0; i < 10; i++) {
                    suma += tab[i];
                }
                System.out.println(suma / 10);
            } else if (liczba == 4) {
                float min = tab[0];
                for (int i = 0; i < 10; i++) {
                    if (tab[i] < min) {
                        min = tab[i];
                    }
                }
                System.out.println(min);
            } else if (liczba == 5) {
                float max = tab[0];
                for (int i = 0; i < 10; i++) {
                    if (tab[i] > max) {
                        max = tab[i];
                    }
                }
                System.out.println(max);
            } else if (liczba == 6) {
                break;
            }
        } while (true);
         */
        //zad6
        /*
            while(true)
            {
            System.out.println("podaj liczbe calkowita");
            Scanner odczyt = new Scanner(System.in);
            int liczba = odczyt.nextInt();
            if(liczba<0){
            break;
            }
            
            }
         */
        //zad 7
        /*
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Kolego podaj ile ma byc elementowa tablica");
        int n = odczyt.nextInt();
        System.out.println("Kolego teraz wpisz " + n + " liczb calkowitych ");
        int[] tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = odczyt.nextInt();

        }
        bubbleSort(tab);
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        */

        /*Zadania robione na lekcji
            int liczba = 0;
            // TODO zad 3, 4, 6, 7
            do
            {
            
            System.out.println("podaj miesiac");
            Scanner miesiac;
            miesiac = new Scanner(System.in);
            liczba = miesiac.nextInt();
            switch (liczba) {
            case 1: {
            System.out.println("Styczen");
            }
            break;
            case 2: {
            System.out.println("Luty");
            }
            break;
            case 3: {
            System.out.println("Marzec");
            }
            break;

            case 4: {
            System.out.println("Kwiecien");
            }
            break;

            case 5: {
            System.out.println("Maj");
            }
            break;
            case 6: {
            System.out.println("Czerwiec");
            }
            break;
            case 7: {
            System.out.println("Luty");
            }
            break;
            case 8: {
            System.out.println("Sierpien");
            }
            break;
            case 9: {
            System.out.println("wrzesien");
            }
            break;

            case 10: {
            System.out.println("pazdziernik");
            }
            break;
            case 11: {
            System.out.println("listopad");
            }
            break;
            case 12: {
            System.out.println("grudzien");
            }
            break;
            default:
            System.out.println("zly numer!");
            }
            }while(liczba!=0);
         */
 /*
            int skok = 0;
            int i = 1;
            do {
            System.out.println(skok);
            skok += i;
            i += 1;
            } while (skok < 1000);
         */
 /*
            for(int i=20;i>0;i--)
            {
            if(i==2|| i==6 || i ==9||i==15||i==19)
            {
            continue;
            }
            System.out.println(i);
            }
         */
        // zad1
        /*
            float a=-20,b=3,c=10,x_1,x_2;
            float delta=b*b-4*(a*b);
            if(delta>0)
            {
            System.out.println("delta dodatnia");
            x_1=(float) (-b+sqrt(delta)/(2*a));
            x_2=(float) (-b-sqrt(delta)/(2*a));
            System.out.println(x_1+", " + x_2);
            }
            else if(delta==0)
            {
            x_1=(float) (-b+sqrt(delta)/(2*a));
            System.out.println(x_1);
            }
            else
            {
            System.out.println("delta ujemna brak rozwian");
            }
         */
 /*
            
         */
    }
}
