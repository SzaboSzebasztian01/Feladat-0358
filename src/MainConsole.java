/*
 * File:MainConsole.java
 * Author:Szebasztián
 * Copyright:2023, Szebi:)
 * Group:SZOFT-I-1-N
 * Date:2023-02-20
 * Github:https://github.com/SzaboSzebasztian01/Feladat-0358
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
        System.out.println("Paralelepipedon Terfogatszamitas");
    }
    private void about(){
        System.out.println("Szabo Szebasztian");
        System.out.println("Szoft I-1-N");
        System.out.println("2023.02.20.");
    }


    public void calcer(){
        Calc calc = new Calc();
        String AStr = input("Irja be az A el hosszanak erteket: ");
        String BStr = input("Irja be a B el hosszanak erteket: ");
        String CStr = input("Irja be a C el hosszanak erteket: ");
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