//В калькулятор добавьте возможность отменить последнюю операцию.

package java_homework_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class task_3 {

    static void addNumber(ArrayList<String> ll){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String number = scanner.nextLine();
        ll.add(number);
    }
    public static void main(String[] args){     
        
        System.out.println("Добро пожаловать в простой калькулятор");

        ArrayList<String> ll = new ArrayList();
        int result = 0;
        int i = 1;

        Scanner scanner = new Scanner(System.in);
        addNumber(ll);
        System.out.println(ll);
       

        System.out.print("Введите требуемое действие: '+' - сложение\n" +
                            "'-' - вычитание\n" +
                            "'*' - умножение\n" +
                            "'/' - деление\n" +
                            "'<' - удаление последнего действия\n" +
                            "'e' - выход\n" +
                            ": ");

        String flag = scanner.nextLine(); 
        ll.add(flag);

        while (!flag.equals("e")){ 
            if (ll.get(i).equals("+")){
                addNumber(ll);
                result = Integer.parseInt(ll.get(i - 1)) + Integer.parseInt(ll.get(i + 1));  
                ll.add(Integer.toString(result));                  
                System.out.println(ll.get(i - 1) + " + " + ll.get(i + 1) + " = " + result);                    
            }
            else if (ll.get(i).equals("-")){
                addNumber(ll);
                result = Integer.parseInt(ll.get(i - 1)) - Integer.parseInt(ll.get(i + 1));  
                ll.add(Integer.toString(result));                 
                System.out.println(ll.get(i - 1) + " - " + ll.get(i + 1) + " = " + result);
            }
            else if (ll.get(i).equals("*")){
                addNumber(ll);
                result = Integer.parseInt(ll.get(i - 1)) * Integer.parseInt(ll.get(i + 1));
                ll.add(Integer.toString(result));                   
                System.out.println(ll.get(i - 1) + " * " + ll.get(i + 1) + " = " + result);
            }
            else if (ll.get(i).equals("/")){
                addNumber(ll);
                result = Integer.parseInt(ll.get(i - 1)) / Integer.parseInt(ll.get(i + 1)); 
                ll.add(Integer.toString(result));                   
                System.out.println(ll.get(i - 1) + " / " + ll.get(i + 1) + " = " + result);
            }
            else if (ll.get(i).equals("<")){
                if (ll.size() > 5){
                    ll.remove(ll.size() - 1);
                    ll.remove(ll.size() - 1);
                    ll.remove(ll.size() - 1);
                    ll.remove(ll.size() - 1);
                    System.out.println(ll.get(ll.size() - 1));
                }
                else if (ll.size() == 2){
                    ll.remove(ll.size() - 1);
                    System.out.println(ll.get(0));
                }            
            }           
                        
            System.out.print("Введите требуемое действие: ");
            flag = scanner.nextLine();
            ll.add(flag);
            i = ll.size() - 1;
        }
        scanner.close();
    }
        

}
