public class Hackafest extends Event {
    public Hackafest(String event_name,String activity_name, String date, String time) {
        super(event_name,activity_name, date, time);
    }

    void HackafestStart(){
        display("Hackafest started");
    }
}
