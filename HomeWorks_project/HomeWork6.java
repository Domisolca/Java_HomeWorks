package HomeWorks_project;

public class HomeWork6 {
    
    public static void main(String[] args) {
        Myset set = new Myset();
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(6);
        set.add(7);

        System.out.println(set);
        System.out.println(set.contains(5));
        System.out.println(set.get(3));
        System.out.println(set.getArrayList());
        System.out.println(set.tailSet(6));
        System.out.println(set.headSet(6));
        System.out.println(set.subSet(6, 8));
        System.out.println(set.subSet(8, 6));
    }
}
