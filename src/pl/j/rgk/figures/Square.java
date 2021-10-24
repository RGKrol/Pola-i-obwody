// klasa kwadrat

package pl.j.rgk.figures;

import java.util.Scanner;

public class Square extends Rectangle {
    Square(){
        this.name = "Kwadrat";
    }
    //------------- Area Counting ----------------
    public void areaCountingMethods(){
        System.out.println("1 - P = a^2,        gdzie a to długość boku kwadratu.");
        System.out.println("2 - P = 1/2 * d^2,  gdzie d to długość przekątnej kwadratu.");
    }
    public void areaCounting() {
        boolean orEnd = false;
        Scanner userSelection = new Scanner(System.in);
        do {
            System.out.println("Której metody użyć?");
            this.areaCountingMethods();
            System.out.println("0 - Powrót do poprzedniego menu.");
            switch (userSelection.nextInt()){
                case 1: areaCounting(1); orEnd = true; break;
                case 2: areaCounting(2); orEnd = true; break;

                case 0: orEnd = true; break;
                default: System.out.println("Nie rozpoznaję tej opcji.");
            }
        }while (orEnd == false);
    }
    public void areaCounting(int methodNumber){
        Scanner userData = new Scanner(System.in);
        double a,d;
        switch (methodNumber){
            case 1:
                System.out.print("Podaj długość boku: ");
                a = userData.nextDouble();
                System.out.println("P = "+a+" * "+a+" = " + a*a);
                break;
            case 2:
                System.out.print("Podaj długość przekątnej: ");
                d = userData.nextDouble();
                System.out.println("P = 1/2 * "+d+" * "+d+" = "+(d*d*0.5));
                break;
        }
    }
    // ------------ Perimeter Counting ----------------
    public void perimeterCountingMethods(){
        System.out.println("1 - Ob = 4 * a,             gdzie a to długość boku kwadratu.");
        System.out.println("2 - OB = 4 * sqrt( d^2/2),  gdzie d to długość przekątnej kwadratu.");
    }
    public void perimeterCounting(){
        boolean orEnd = false;
        Scanner userSelection = new Scanner(System.in);
        do {
            System.out.println("Której metody użyć?");
            this.perimeterCountingMethods();
            System.out.println("0 - Powrót do poprzedniego menu.");
            switch (userSelection.nextInt()){
                case 1: perimeterCounting(1); orEnd = true; break;
                case 2: perimeterCounting(2); orEnd = true; break;

                case 0: orEnd = true; break;
                default: System.out.println("Nie rozpoznaję tej opcji.");
            }
        }while (orEnd == false);
    }
    public void perimeterCounting(int methodNumber){
        Scanner userData = new Scanner(System.in);
        double a,d;
        switch (methodNumber){
            case 1:
                System.out.print("Podaj długość boku: ");
                a = userData.nextDouble();
                System.out.println("Ob = "+a+" * "+a+" = " + a*a);
                break;
            case 2:
                System.out.print("Podaj długość przekątnej: ");
                d = userData.nextDouble();
                System.out.println("Ob = 1/2 * "+d+" * "+d+" = "+0.5*d*d);
                break;
        }
    }
}
