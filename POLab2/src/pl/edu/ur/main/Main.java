package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 3, 4, 6, 7
        /*
        do
        {
        
        System.out.println("podaj miesiac");
        int liczba;
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
            //zadanie
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
        float a=-20,b=3,c=10,x_1,x_2;
        float delta=b*b-4*(a*b);
        if(delta>0)
        {
            System.out.println("delta dodatnia");
            x_1=(-b+delta)/2*a;
            x_2=(-b+delta)/2*a;
            System.out.println(x_1+x_2);
        }
        else if(delta==0)
         {
             x_1=(-b+delta)/2*a;
             System.out.println("delta dodatnia");
          }
        else
        {
            x_1=(-b+delta)/2*a;
        }
    }
}
