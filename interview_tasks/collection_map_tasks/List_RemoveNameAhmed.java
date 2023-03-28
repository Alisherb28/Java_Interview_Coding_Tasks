package collection_map_tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List_RemoveNameAhmed {
    public static void main(String[] args) {
        String[] list={"Ahmed", "John", "Eric", "Ahmed"};
            int count2= Collections.frequency(Arrays.asList(list),"Ahmed");
            System.out.println(count2);
        int j=0;
        String [] list2=new String[list.length-count2];
        for (int i = 0; i < list.length; i++) {
            if(!list[i].equals("Ahmed")){
                list2[j]=list[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(list2));
    }

    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */


    // solution 1
    public static List<String> remove1(List<String> names) {
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Ahmed"))
                it.remove();
        }
        return names;
    }


    // solution 2
    public static List<String> remove2(List<String> names) {
        names.removeAll(Arrays.asList("Ahmed"));
        return names;
    }


    // solution 3
    public static List<String> remove3(List<String> names) {
        names.removeIf(name -> name.equals("Ahmed"));
        return names;
    }




}
