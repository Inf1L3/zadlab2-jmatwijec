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
        int[] tab = {1, 10, 2, 30}; //przykladowa tablica
        bubbleSort(tab);
        for (int i = 0; i < tab.length; i++)
        {
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
 /*

         */
    }
}
