//Author: Steven Rodrigues
//Description: provides event management functions
import java.util.ArrayList;
import java.util.Scanner;

public class EventManager implements Manager{
    //stores all event objects in arraylist
    private ArrayList<Event> events = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    //method to add an event
    public void addEvent(){
        try{
            System.out.println("Enter the event name");
            String event_name = sc.next();
            System.out.println("Enter the activity name");
            String activity_name = sc.next();
            System.out.println("Enter the event date");
            String date = sc.next();
//            if(date.matches("[-9]{2}/[-9]{2}/[-9]{2}")){
//                throw new Exception("Date format should be dd-mm-yy");
//            }
            System.out.println("Enter the event time");
            String time = sc.next();

            for (Event e : events){
                if(e.getDate().equalsIgnoreCase(date)&&e.getTime().equalsIgnoreCase(time)){
                    throw new Exception("Other event is scheduled");
                }
            }

            if (event_name.equals("Infofest") || event_name.equals("infofest")){
                events.add(new Infofest(event_name,activity_name,date,time));
                System.out.println("Event Added");
            } else if (event_name.equals("Hackafest") || event_name.equals("hackafest")) {
                events.add(new Hackafest(event_name,activity_name,date,time));
                System.out.println("Event Added");
            }else{
                events.add(new Event(event_name,activity_name,date,time));
                System.out.println("Event Added");
            }
            // events.add(new Event(event_name,date,time));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
    //method to remove an event
    public void removeEvent(){
        try{
            System.out.println("Enter the event name");
            String event_name = sc.next();
            System.out.println("Enter the activity name");
            String activity_name = sc.next();
            boolean removed = events.removeIf(event -> event.getEvent_name().equalsIgnoreCase(event_name)&&event.getActivity_name().equalsIgnoreCase(activity_name));
            if(!removed){
                throw new Exception("Event not present in schedule");
            }else{
                System.out.println("Event removed from schedule");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void removeEvent(String event_name,String activity_name){
        try{
            boolean removed = events.removeIf(event -> event.getEvent_name().equalsIgnoreCase(event_name)&&event.getActivity_name().equalsIgnoreCase(activity_name));
            if(!removed){
                throw new Exception("Event not present in schedule");
            }else{
                System.out.println("Event removed from schedule");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    //method to display schedule
    public void displaySchedule(){
        if(!events.isEmpty()){
            System.out.println("Schedule:");
            for(Event e : events){
                System.out.println("Event Name: "+e.getEvent_name()+" Activity Name: "+e.getActivity_name()+" Date: "+e.getDate()+" Time: "+e.getTime());
            }
        }else{
            System.out.println("No events are scheduled");
        }

    }
    //method to start event
    public void startEvent(){
        if(!events.isEmpty()){
            System.out.println("Enter the event name");
            String event_name = sc.next();
            System.out.println("Enter the activity name");
            String activity_name = sc.next();
            for(Event e : events){
                if (event_name.equals(e.getEvent_name()) || activity_name.equals(e.getActivity_name())){
                    e.display("Event name: "+event_name+" Activity name: "+activity_name+" has started");
                }
            }
        } else{
            System.out.println("No events are scheduled");
        }
    }
    //method to end an event
    public void endEvent(){
        if(!events.isEmpty()){
            System.out.println("Enter the event name");
            String event_name = sc.next();
            System.out.println("Enter the activity name");
            String activity_name = sc.next();
            for(Event e : events){
                if (event_name.equals(e.getEvent_name()) || activity_name.equals(e.getActivity_name())){
                    e.display("Event name: "+event_name+" Activity name: "+activity_name+" has ended");
                    removeEvent(event_name,activity_name);
                }
            }
        } else{
            System.out.println("No events are scheduled");
        }
    }
}
