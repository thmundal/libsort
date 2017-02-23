/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libsort;

/**
 *
 * @author thmun
 */
public class SortableItem implements Comparable<SortableItem> {
    private int value;
    
    public SortableItem(int i) {
        value = i;
    }
    
    public int value() {
        return value;
    }
    
    @Override
    public int compareTo(SortableItem o) {
        return (value == o.value() ? 0: (value > o.value()? 1:-1));
    }
}
