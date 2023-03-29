package Arrays;

import java.util.HashMap;

class MapHash {
    int id;
    int Cost;
    String Brand;

    MapHash(int id, int Cost, String Brand) {
        this.id = id;
        this.Cost = Cost;
        this.Brand = Brand;
    }

    public int getId() {
        return id;
    }

    public int getCost() {
        return Cost;
    }

    public static void main(String args[]) {
        // MapHash a1 = new MapHash(1, 100, "naveen");
        // MapHash a2 = new MapHash(2, 200, "Gooday");
        // MapHash a3 = new MapHash(3, 300, "Good");
        // MapHash a4 = new MapHash(4, 400, "anand");
        // MapHash a5 = new MapHash(5, 500, "shety");
        // MapHash a6 = new MapHash(6, 600, "praveen");
        // HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(a1.getCost(), a1.getId());
        // map.put(a2.getCost(), a2.getId());
        // map.put(a3.getCost(), a3.getId());
        // map.put(a4.getCost(), a4.getId());
        // map.put(a5.getCost(), a5.getId());
        // map.put(a6.getCost(), a6.getId());
        // System.out.println(map);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);
        map.put(5, 500);
        int id = 3;
        if (map.containsKey(id)) {
            System.out.println(map.get(id) - map.get(id) * 0.10);
        } else {
            System.out.println("not found");
        }

    }
}