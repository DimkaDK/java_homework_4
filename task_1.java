//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

package java_homework_4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;


public class task_1 {

    static LinkedList<Integer> revLinkedList(LinkedList<Integer> ll){
        Collections.reverse(ll);
        return ll;

    }
    public static void main(String[] args){

        Random random = new Random();

        LinkedList<Integer> ll = new LinkedList();
        for (int i = 0; i < 5; i++){
           ll.add(random.nextInt(0,10));
        }
        System.out.println(ll);
        revLinkedList(ll);
        System.out.println(ll);
    }
}
