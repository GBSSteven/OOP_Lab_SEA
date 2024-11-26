//Author: Steven Rodrigues
//Description: provides menu to manage events
import java.util.Scanner;

//main function
public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("---------------------------------------------------------");
            System.out.println("Menu");
            System.out.println("1.Add Event");
            System.out.println("2.Remove Event");
            System.out.println("3.Display Event Schedule");
            System.out.println("4.Start Event");
            System.out.println("5.End Event");
            System.out.println("6.Exit");
            System.out.println("Enter your choice");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    eventManager.addEvent();
                    break;
                case 2:
                    eventManager.removeEvent();
                    break;
                case 3:
                    eventManager.displaySchedule();
                    break;
                case 4:
                    eventManager.startEvent();
                    break;
                case 5:
                    eventManager.endEvent();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Please enter valid input from the given menu");
                    break;
            }
        }while(choice!=6);
    }
}