//Author: Steven Rodrigues
//Description: used to create and event object
public class Event {
    private final String event_name;
    private final String date;
    private final String time;
    private final String activity_name;
    public Event(String event_name,String activity_name, String date, String time){
        this.event_name=event_name;
        this.activity_name=activity_name;
        this.date=date;
        this.time = time;
    }
    public String getEvent_name(){
        return event_name;
    }
    public String getActivity_name(){
        return activity_name;
    }
    public String getDate(){
        return date;
    }
    public String getTime(){
        return time;
    }
    <T> void display(T message){
        System.out.println(message);
    }
}
