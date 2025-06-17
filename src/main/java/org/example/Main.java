package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String produit, permiss;
        int montant, nbrVendu, tauxTVA, ntaux;

        System.out.println("Veuillez saisir le nom du produit que vous désirez vendre");
        produit = scanner.nextLine();

        System.out.println("Veuillez saisir le montant du produit :");
        montant = scanner.nextInt();

        System.out.println("Saisir la quantité à vendre :");
        nbrVendu = scanner.nextInt();

        System.out.println("Saisir le taux de la TVA :");
        tauxTVA = scanner.nextInt();

        System.out.println("Saisir autres taux :");
        ntaux = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Veuillez confirmer votre vente par un OK :");
        permiss = scanner.nextLine();


        if (permiss.equals("OK")){
            System.out.println("\t\t\t\t\t\t\t\t|Pharmacie :  |");
            System.out.println("\t\t\t|-------------------------------------------------|");
            System.out.println("\t\t\t|\tProduit :\t\t\t\t\t" + produit + "|");
            System.out.println("\t\t\t|-------------------------------------------------|");
            System.out.println("\t\t\t|\tMontant brut :\t\t" + montant * nbrVendu + "fr |");
            System.out.println("\t\t\t|-------------------------------------------------|");
            int a = montant * nbrVendu;
            System.out.println("\t\t\t|\tTaux de la TVA :\t\t" + tauxTVA +"%" + "|");
            System.out.println("\t\t\t|-------------------------------------------------|");
            System.out.println("\t\t\t|\tAutres taxes :\t\t" + ntaux + "%" + "|");
            System.out.println("\t\t\t|-------------------------------------------------|");
            System.out.println("\t\t\t|\tMontant de la TVA :\t"+(((a+ntaux) * tauxTVA))/100 +"fr |");
            System.out.println("\t\t\t|-------------------------------------------------|");
            int b = ((a * tauxTVA)/100);
            System.out.println("\t\t\t|\tMontant total :\t\t\t" + (a + b) +"fr|");
            System.out.println("\t\t\t|-------------------------------------------------|");
        }
        else {
            System.out.println("Vente échouer");
        }





    }
}