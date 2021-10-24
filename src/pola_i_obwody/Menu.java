package pola_i_obwody;

import java.util.Scanner;

public class Menu {
    Menu(){        //konstruktor wywołuje pełne menu i to cały program jest :-)
        boolean orQuit;
        do {
            orQuit = mainMenu();
        }while(orQuit == false);    //to rozwiązanie uważam za czytelniejsze od !orQuit
                                    //ale mogę się mylić :-(
                                    //może chodzi o wydajność? - do sprawdzenia !!!
    }
    private boolean mainMenu(){boolean orEnd = false;
        Scanner userSelection = new Scanner(System.in); //odczyt z konsoli (klawiatury najczęściej)

        System.out.println("Menu główne:");

        System.out.println("1 - Obliczenia dla Prostokąta.");
        System.out.println("2 - Obliczenia dla Kwadratu.");

        System.out.println("---\n0 - Jeżeli chcesz zakończyć program.");
        System.out.print("  Twój wybór: ");

        switch (userSelection.nextInt()){       //nie rozumiem uwagi o "lepszym 'switch'" :-(
                                                //sprawdzić o co tu chodzi !!!
            case 0: orEnd = true; break;
            case 1:
                Rectangle rectangle = new Rectangle();
                menuLevelTwo(rectangle);
                break;
            case 2:
                Square square = new Square();
                menuLevelTwo(square);
                break;

            default:
                System.out.println(" - -\n- - - Nie rozpoznaję Twojego wyboru ! - - -\n - -");
                break;
        }
        return orEnd;
    }
    void menuLevelTwo(Figure figure){
        boolean orEnd = false;
        Scanner userSelectrion = new Scanner(System.in);
        do {
            System.out.println(" - - - - Menu " + figure.name +": - - - - ");
            System.out.println("POLE");
            System.out.println("1 - Metody obliczania pola.");
            System.out.println("2 - Oblicz pole.");
            System.out.println("OBWÓD");
            System.out.println("3 - Metody obliczania obwodu.");
            System.out.println("4 - Oblicz obwód.");

            System.out.println("---\n0 - Powrót do menu głównego.");
            System.out.print("  Twój wybór: ");
            switch (userSelectrion.nextInt()){
                case 1: figure.areaCountingMethods(); break;
                case 2: figure.areaCounting(); break;
                case 3: figure.perimeterCountingMethods(); break;
                case 4: figure.perimeterCounting(); break;

                case 0: orEnd = true; break;
                default : System.out.println("Nie rozpozonaję odpowiedzi !\n");
            }
        }   while (orEnd==false);
    }
}
