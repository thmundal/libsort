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
public class Sorter {
    private Comparable[] a;
    
    public Sorter(Comparable[] in) {
        a = in;
    }
    
    /**
     * Bubblesort algorithm
     */
    public void bubbleSort() {
        bubbleSort(0);
    }
    
    /**
     * 
     * @param wait 
     */
    public void bubbleSort(int wait) {
        boolean swapped = true;
        
        while(swapped) {
            swapped = false;
            
            for(int i=1; i<a.length; i++) {
                if(a[i].compareTo(a[i-1]) < 0) {
                    swap(a, i, i-1);
                    swapped = true;
                    wait(wait);
                }
            }
        }
    }
    
    /* QUICKSORT */
    public void QuickSort() {
        QuickSort(0);
    }
    
    public int pivot;
    public void QuickSort(int wait) {
        System.out.println("FUCK THIS!");
        /*
        int pivot = a.length / 2;
        int lo = 0;
        int hi = a.length - 1;
        QS_Sort(pivot, lo, hi, wait);
        System.out.println("done");*/
    }
    
    private void QS_Sort(int _pivot, int lo, int hi, int wait) {
        if(lo > hi) {
            return;
        }
        
        int p = QuickSort_partition(_pivot, lo, hi, wait);
        pivot = p;
        
        QS_Sort(p, lo, p - 1, wait);
        QS_Sort(p, p + 1, hi, wait);
    }
    
    private int QuickSort_partition(int _pivot, int lo, int hi, int wait) {
        int piv = hi;
        int p = lo;
        for(int i=lo; i<hi - 1; i++) {
            if(a[i].compareTo(a[piv]) <= 0) {
                p++;
                swap(a, i, p);
                wait(wait);
            }
        }
        
        return p;
    }
    
    /*************************/
    private void wait(int milli) {
        try {
            Thread.sleep(milli);
        } catch(Exception e) {
            System.out.println("Wait failed");
        }
    }
    
    public void swap(Comparable[] _a, int i, int j) {
        Comparable tmp = _a[i];
        _a[i] = _a[j];
        _a[j] = tmp;
    }
}
