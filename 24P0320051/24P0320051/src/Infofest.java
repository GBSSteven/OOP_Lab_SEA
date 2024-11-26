public class Infofest extends Event{
    public Infofest(String event_name,String activity_name, String date, String time) {
        super(event_name,activity_name, date, time);
    }

    void infofestStart(){
        display("Infofest started");
    }
}
