package Task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Cafe {

    public ArrayList<String> coffeeMenu = new ArrayList<>();


    public void loadMenuData(){
        File file = new File("src/Task2/coffees.txt");
        try {
            Scanner scanner = new Scanner(file);
            String coffee = "";
            while(scanner.hasNextLine()){
                coffee = scanner.nextLine();
                    coffeeMenu.add(coffee);
                }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");

        }

    }

}
