import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

//Generare Numere Loto
        Set<Integer> NrLoto = new GenNr().nrgen();


//Generare Numere Proprii

        int[] Mynumbers = new int[6];
        int randomNum;

        for (int i = 0; i < 6; i++) {
            randomNum = (int) (Math.random() * 50);
            for (int x = 0; x < i; x++) {
                if (Mynumbers[i] == randomNum)
                {
                    randomNum = (int) (Math.random() * 50); //
                }

            }
            Mynumbers[i] = randomNum;
        }

        for (int i = 0; i < Mynumbers.length; i++) ;

//Comparare Nr Loto vs Nr Proprii + reia generarea de numere pana cand se ghicesc minim 3

        int nrguess = 0;
        int tenta = 0;

        do {
            for (int i = 0; i < Mynumbers.length; i++) {
                System.out.println(Mynumbers[i]);
                tenta++;
                //   if (Mynumbers[i] == NrLoto) {
                nrguess++;
            }
            System.out.println("test");
//                nrguess++;
//                tenta++;


        if (nrguess == 3) {
            System.out.println("Felicitari,azi esti castigator in categoria III");
            break;
        }
        if (nrguess == 4) {
            System.out.println("Felicitari, esti castigator in categoria IV");
            System.out.println("Ai reusit sa ghicesti cel putin 4 numere din " + tenta + " incercari");
            break;
        }
        if (nrguess == 5) {
            System.out.println("Felicitari esti castigator al categoriei V");
            System.out.println("Ai reusit sa ghicesti cel putin 5 numere din " + tenta + " incercari");
            break;
        }
        if (nrguess == 6) {
            System.out.println("Esti marele castigator! Nu pierde biletul!");
            System.out.println("Ai reusit sa ghicesti toate numere din " + tenta + " incercari");
        }
    }

        while (nrguess < 3) ;


        System.out.println("Ai reusit sa ghicesti " + nrguess + " numere din " + tenta + " inceercari.");
        System.out.println("Numerele tale au fost: " + Mynumbers[0] + " " + Mynumbers[1] + " " + Mynumbers[2] + " " + Mynumbers[3] + " " + Mynumbers[4] + " " + Mynumbers[5] + " ");
        System.out.println("Numerele cautate erau:" + NrLoto);

        if (nrguess > 3) {
            System.out.println("Ai reusit sa ghicesti cel putin 3 numere din " + tenta + " incercari");
        }
        if (nrguess > 4) {
            System.out.println("Ai reusit sa ghicesti cel putin 4 numere din " + tenta + " incercari");
        }
        if (nrguess > 5) {
            System.out.println("Ai reusit sa ghicesti cel putin 5 numere din " + tenta + " incercari");
        }


    }
}
