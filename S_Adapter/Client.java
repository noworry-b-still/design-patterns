package S_Adapter;

interface IAircraft {
    void fly();
}

class HotAirBalloon {

    String gasUsed = "Helium";

    void fly(String gasUsed) { // <- arguemnt breaks the public interface IAircraft
        System.out.println("HotAirBalloon flying using " + gasUsed);
    }

    String inflateWithGas() {
        return gasUsed;
    }
}

// our aircraft software should accomodate incompatable HotAirBallon too.

// we use Adapter pattern

class Adapter implements IAircraft {
    HotAirBalloon hotAirBalloon;

    public Adapter(HotAirBalloon hotAirBalloon) {
        this.hotAirBalloon = hotAirBalloon;
    }

    @Override
    public void fly() {
        System.out.println("In the adapter");
        String gasUsed = hotAirBalloon.inflateWithGas();
        hotAirBalloon.fly(gasUsed);
    }
}

public class Client {
    public static void main(String[] args) {
        HotAirBalloon hotAirBalloon = new HotAirBalloon();
        IAircraft hotAirBalloonAdapter = new Adapter(hotAirBalloon);

        hotAirBalloonAdapter.fly();
    }
}
