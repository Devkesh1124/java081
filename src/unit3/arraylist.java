package unit3;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(12);
        al.add(66);
        al.add(15);
        al.add(30);
        System.out.println(al);
        for(int al1:al){
            System.out.println(al1);
        }
    }
}
