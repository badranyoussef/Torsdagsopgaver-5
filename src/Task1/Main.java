package Task1;

import java.util.ArrayList;

public class Main {




    /*
    * 1.c Skriv en Main klasse med en main metode, hvor der oprettes en ArrayList,
    * som du kalder 'customers'. Denne skal være erklæret som static global variabel
    * dvs tilgængelig udenfor main metoden. Tilføj 6 instanser af Customer-klassen til listen customers.
    * Dette gør du i main-metoden. (Du kan oprette instanserne først, og så add'e dem til array'et.
    * Du kan også adde og instantiere i samme linie.)
    * */
    public static ArrayList<Customer> customers = new ArrayList<>();

    public static void printCustomers(){
        for(Customer c: customers){
            System.out.println(c);
        }
    }

    public static void main(String[] args) {

        customers.add( new Customer("Youssef", "Badran", "yoba"));
        customers.add( new Customer("Ahmad", "Alkaseb", "ahal"));
        customers.add( new Customer("Mustafa", "Hansen", "muha"));
        customers.add( new Customer("Lasse", "Thomsen", "lath"));
        customers.add( new Customer("Egon", "Olsen", "egol"));
        customers.add( new Customer("Benny", "Jensen", "beje"));

        printCustomers();

    }
}