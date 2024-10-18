import java.util.*;

// a dynamic list of lists
public class Ex_2DArrayList {
    public static void main(String[] args){

        // the data type goes in the < > brackets and the Array name after that.

        /*2D Array list is used as a comntainer for other array list whihc are then separeted by zone/section. 
        Ex bakery = 0, produce = 1, rink = 2*/

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();

        bakeryList.add("Paste");
        bakeryList.add("Garlic Bread");
        bakeryList.add("Donuts");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("Tomatoes");
        produceList.add("Zucchini");
        produceList.add("Peppers");

        ArrayList<String> drinksList = new ArrayList();
        drinksList.add("Soda");
        drinksList.add("Coffee");

        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);

        System.out.println(drinksList);
        System.out.println(produceList);
        System.out.println(bakeryList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(2).get(1)); 
        
        /* .get function retrieves the data in the 
        ArrayList. 2 is the third list and the sewcond 2 is the second vaiavble in said list.*/


    }

}