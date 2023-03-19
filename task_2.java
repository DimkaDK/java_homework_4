/* Реализуйте очередь с помощью LinkedList со следующими методами:
• enqueue() — помещает элемент в конец очереди,
• dequeue() — возвращает первый элемент из очереди и удаляет его,
• first() — возвращает первый элемент из очереди, не удаляя. */

package java_homework_4;

import java.util.LinkedList;
import java.util.Scanner;

public class task_2 {
    static  LinkedList<String> enqueue(LinkedList<String> ll){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элемент для добавления: ");
        String elem = scanner.nextLine();
        System.out.println(elem);
        ll.addLast(elem);
        System.out.println(ll);
        return ll;
    }

    static  LinkedList<String> first(LinkedList<String> ll){
        if (ll.isEmpty()){
            System.out.println("Очередь пуста"); 
        }
        else{
            System.out.println(ll.getFirst()); 
            System.out.println(ll);
        }
        return ll;
    }

    static  LinkedList<String> dequeue(LinkedList<String> ll){
        if (ll.isEmpty()){
            System.out.println("Очередь пуста"); 
        }
        else{
            System.out.println(ll.getFirst()); 
            ll.removeFirst();
            System.out.println(ll);
        }
        return ll;
    }
    public static void main(String[] args){
        LinkedList<String> ll = new LinkedList();
        String choice = "";
        Scanner scanner = new Scanner(System.in);
        while (!choice.equals("e")){
           
            System.out.print("Выберите действие: + - поместить элемент в конец очереди\n" + 
                            " - - вывести первый элемент из очереди и удалить его\n" +
                            " 1 - вывести первый элемент из очереди, не удаляя его\n" +
                            " e - выход\n" +
                            ": ");
            choice = scanner.nextLine();
           
            
            if (choice.equals("+")){
                enqueue(ll);
            }
            else if (choice.equals("-")){
                dequeue(ll);
            }
            else if (choice.equals("1")){
                first(ll);
            }
            else if (choice.equals("e")){
                
            }
            else{
                System.out.println("Действие выбрано неверно");
            }
        }
        System.out.println(ll);
        scanner.close();
    }
}
