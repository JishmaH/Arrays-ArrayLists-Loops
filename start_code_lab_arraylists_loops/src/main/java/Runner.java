import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Tiree"); //2
        scottishIslands.add("Jura");
        scottishIslands.add("Islay"); //3.
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");
        scottishIslands.add("Coll"); //1.

//        1. Add "Coll" to the end of the list
//        2. Add "Tiree" to the start of the list
//        3. Add "Islay" after "Jura" and before "Mull"
//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.get(4));

//        5. Remove "Tresco" from the list by name
        scottishIslands.remove(6);

//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
        for (String i : scottishIslands){
            System.out.println(i);
        }

//        9. Print out all the islands using a for loop
        for (String i : scottishIslands){
            System.out.println(i);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        List<Integer> numbers2 = new ArrayList<>();
        for(int i=0; i < numbers.size(); i++){
            if(numbers.get(i) % 2 == 0) {
                numbers2.add(numbers.get(i));
            }
        } System.out.println(numbers2);

//        2. Print the difference between the largest and smallest value
        System.out.println(Math.abs(99-1));


//        3. Print true if the list contains a 1 next to a 1 somewhere
        for(int i=0; i < numbers.size(); i++){
            if(numbers.get(i)==1 && numbers.get(i+1)==1){
                System.out.println(true);
            }
        }

//        4. Print the sum of the numbers
        numbers.add(1);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);
        numbers.add(6);
        numbers.add(15);
        numbers.add(13);
        numbers.add(99);
        numbers.add(7);
        int sum=0;
        for (Integer i : numbers)
            sum += i;
        
        System.out.println("sum-> " + sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count
//          HINT - You will need to track the index throughout the loop
//
//          So [7, 13, 2] would have sum of 9.

    }

}
