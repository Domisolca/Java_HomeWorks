package HomeWorks_project;

import java.util.ArrayList;
import java.util.HashMap;

public class Myset {
    private HashMap<Integer, Object> values = new HashMap<>();

    private static final Object X = new Object();

    void add (int data) {
        values.put(data, X);

    }

    public String toString() {
        return values.keySet().toString();
    }

    Boolean contains (int data) {
        return values.containsKey(data);
    }

    void clear (){
        values.clear();
    }

    void remove (int data){
        values.remove(data);
    }

    int size(){
        return values.size();
    }

    int get (int ind){
        return (int) values.keySet().toArray()[ind];
    }

    ArrayList getArrayList(){
        ArrayList<Integer> res = new ArrayList<>();

        values.forEach((k, v) -> res.add(k));

        return res;
    }

    Myset tailSet (int data){

        Myset res = new Myset();
        boolean ad = false;
        for (int el : values.keySet()) {
           
            if (el == data){
                ad = true;
            }
            if (ad){
                res.add(el);
            }
        }

        return res;
    }

    Myset headSet (int data){

        Myset res = new Myset();
        for (int el : values.keySet()) {
            res.add(el);
            if (el == data){
                break;
            }
        
        }

        return res;
    }

    Myset subSet(int key1, int key2){
        Myset res = new Myset();
        boolean ad = false;
        int stop = key1;
        for (int el : values.keySet()) {
            if (el == key1 && !ad){
                ad = true;
                stop = key2;
            }
            if (el == key2 && !ad){
                ad = true;
            }
            if (ad){
                res.add(el);
                if (el == stop){
                    break;
                }
            }
        }

        return res;
    }
}
