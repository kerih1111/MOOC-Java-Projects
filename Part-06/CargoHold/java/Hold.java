
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
public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> cases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.cases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(totalWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            this.cases.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for(Suitcase s : this.cases) {
            totalWeight += s.totalWeight();
        }
        return totalWeight;
    }
    
    public void printItems() {
        for(Suitcase s : this.cases) {
            s.printItems();
        }
    }
    
    @Override
    public String toString() {
        return this.cases.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
}
