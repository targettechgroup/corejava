package com.techtarget.corejava;
import java.util.*;

public class Test {

    public static void main(String[] args) {
//        Human male = new Male();
//        Human female = new Female();
//        AlphaMale am = new AlphaMale();
//        IndianMale im = new IndianMale();
//
//        male.breath();
//        male.talk();
//
//        female.breath();
//        female.talk();
//
//        am.run();
//
//        System.out.println(im.shave(1));
//        System.out.println(im.shave(1.50));
//        System.out.println(im.shave(1.50, "Gillete"));
        try {

            // List

            List<String> namesList = new ArrayList<String>();
            namesList.add("A");
            namesList.add("A");
            namesList.add("A");
            namesList.add("A");
            namesList.add("B");
            namesList.add("C");
            namesList.add("D");
            //namesList.add(1);
            System.out.println("Output from list" + namesList.toString());

            Set<String> namesSet = new HashSet<String>();
            namesSet.add("A");
            namesSet.add("A");
            namesSet.add("A");
            namesSet.add("A");
            namesSet.add("B");
            namesSet.add("C");
            namesSet.addAll(namesList);
            System.out.println("Output from set" +namesSet.toString());

            //String[] names = new String[3];
            Map names = new HashMap();
            names.put("Shilpa", "Ratnakar");
            names.put("Sudha", "Selvam");
            names.put("Maithlee", "Mandle");
            names.put("Sravya", "Kancharla");
            names.put("Mrudula", "Vusirikala");

            System.out.println(names);
            System.out.println(names.get("Maithlee"));

            Iterator nameIterator = names.keySet().iterator();

            while (nameIterator.hasNext()) {
                System.out.println("Last Name: " + names.get(nameIterator.next()));
            }
        } catch (Exception e) {
            System.out.println("Something went wrong: Details " + e.getMessage());
        }
    }
}
