import java.util.*;

class RandomizedSet {

    private ArrayList<Integer> list;
    private HashMap<Integer, Integer> map;
    private Random rand;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }

    public boolean insert(int val) {

        // already exists
        if(map.containsKey(val)){
            return false;
        }

        // add to list
        list.add(val);

        // store index
        map.put(val, list.size() - 1);

        return true;
    }

    public boolean remove(int val) {

        // not present
        if(!map.containsKey(val)){
            return false;
        }

        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);

        // move last element to index
        list.set(index, lastElement);
        map.put(lastElement, index);

        // remove last element
        list.remove(list.size() - 1);
        map.remove(val);

        return true;
    }

    public int getRandom() {

        int index = rand.nextInt(list.size());
        return list.get(index);
    }
}
