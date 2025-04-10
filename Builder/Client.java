package Builder;

public class Client {
    public static void main(String[] args) {
        AircraftDirector director = new AircraftDirector();
        AircraftBuilder f16Builder = new F16Builder();
        Aircraft f16 = director
                .constructAircraft(f16Builder);
        AircraftBuilder boeing747Builder = new Boeing747Builder();
        Aircraft boeing747 = director.constructPassengerAircraft(boeing747Builder);
    
    }
}
