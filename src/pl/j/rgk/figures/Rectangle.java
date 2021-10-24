// klasa Prostokąt

package pl.j.rgk.figures;

import java.util.Scanner;

public class Rectangle extends Figure {
    Rectangle(){
      this.name = "Prostokąt";
    }

    public void areaCountingMethods(){
        System.out.println("1. P = a * b,               gdzie: a,b to długości boków.");
        System.out.println("2. P = a * sqrt(d^2 - a^2), gdzie: a - długość dowolnego boku, d - długość przekątnej.");
    }
    public void areaCounting(){
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
                default: System.out.println("Nie rozpoznaje tej opcji.");
            }
        }while (orEnd == false);
    }
    public void areaCounting(int methodNumber ){
        Scanner userData = new Scanner(System.in);
        double a,b,d;
        switch (methodNumber){
            case 1:
                System.out.print("Podaj długość boku a: ");
                a = userData.nextDouble();
                System.out.print("Podaj długość boku b: ");
                b = userData.nextDouble();
                System.out.println("P = "+a+" * "+b+" = " + (a*b));
                break;
            case 2:
                System.out.print("Podaj długość boku: ");
                a = userData.nextDouble();
                System.out.print("Podaj długość przekątnej: ");
                d = userData.nextDouble();
                System.out.println("P = "+a+" * sqrt("+ d+" * "+d+" - "+a+" * "+a+") = "+(double)(1.0*a*Math.sqrt(d*d - a*a)));
                break;
        }
    }

    public void perimeterCountingMethods(){
        System.out.println("1. Ob = 2a + 2b, gdzie a,b to długości boków. ");
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

                case 0: orEnd = true; break;
                default: System.out.println("Nie rozpoznaje tej opcji.");
            }
        }while (orEnd == false);
    }
    public void perimeterCounting(int methodNumber){
        Scanner userData = new Scanner(System.in);
        double a,b;
        switch (methodNumber){
            case 1:
                System.out.print("Podaj długość boku a: ");
                a = userData.nextDouble();
                System.out.print("Podaj długość boku b: ");
                b = userData.nextDouble();
                System.out.println("Ob = 2 * "+a+" + 2 * "+b+" = "+(2*a+2*b));
                break;
        }

    }

}
