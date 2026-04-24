
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erich
 */
public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }
    
    public void addItem(Item item) {
        if(totalWeight() + item.getWeight() <= this.maximumWeight) {
            items.add(item);
        }
    }
    
    public void printItems() {
        for(Item i : this.items) {
            System.out.println(i);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for(Item i : this.items) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.items.get(0);
        
        for(Item i : this.items) {
            if(heaviestItem.getWeight() < i.getWeight()) {
                heaviestItem = i;
            }
        }
        return heaviestItem;
    }

    @Override
    public String toString() {
        if(items.isEmpty()) {
            return "no items " + "(" + totalWeight() + " kg)";
        }
        if(items.size() == 1) {
            return items.size() + " item " + "(" + totalWeight() + " kg)";
        }
        
        return items.size() + " items " + "(" + totalWeight() + " kg)";
    }

    
    
    
}
