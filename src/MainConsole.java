/*
 * File: MainConsole.java
 * Author: Szabó Szebasztián
 * Copyright: 2023, Szebi:)
 * Group: SZOFT-I-1-N
 * Date: 2023-02-20
 * Github: SzaboSzebasztian01
 * Licenc: GNU GPL
 */

import java.util.Scanner;

public class MainConsole {
    
    public MainConsole() {
        about();
        task();
        calcer();
    }
    
    private void task(){
        System.out.println("Feladat 0358 meg.");
        System.out.println("Paralelepipedon Térfogatszámítás");
    }
    private void about(){
        System.out.println("Szabó Szebasztián");
        System.out.println("Szoft I-1-N");
        System.out.println("2023.02.20.");
    }


    public void calcer(){
        Calc calc = new Calc();
        String AStr = input("Írja be az A él hosszának értékét: ");
        String BStr = input("Írja be a B él hosszának értékét: ");
        String CStr = input("Írja be a C él hosszának értékét: ");
        Double aside = Double.parseDouble(AStr);
        Double bside = Double.parseDouble(BStr);
        Double cside = Double.parseDouble(CStr);
        System.out.println(calc.calcVolume(aside, bside, cside));
    }
    
    public String input(String msg){
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg + "");
        String text = scanner.nextLine();
        return text;
    }
}