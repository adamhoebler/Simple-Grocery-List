package hoebler;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem (String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have "+groceryList.size() + " items in your grocery list");
        for(int i=0; i<groceryList.size();i++){
            System.out.println((i+1)+". "+groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String newItem){
        int position = findItem(newItem);
        if (position>=0){
            modifyGroceryItem(position, newItem);
        }
    }
    public void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);

    }
    private void removeGroceryItem(String item){
        int position = findItem(item);
        if (position>=0){
            removeGroceryItem(position);
        }
    }
     void removeGroceryItem(int position){
        groceryList.remove(position);
    }
    public int findItem(String searchItem){
     //   boolean exists = groceryList.contains(searchItem);
        return groceryList.indexOf(searchItem);
    }

}
