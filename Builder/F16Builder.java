package Builder;
public class F16Builder implements AircraftBuilder {
    private Aircraft aircraft = new Aircraft();

    @Override
    public AircraftBuilder buildCockpit() {
        aircraft.setCockpit("F16 Single-seat Cockpit");
        return this;
    }

    @Override
    public AircraftBuilder buildEngine() {
        aircraft.setEngine("F110-GE-129 Afterburning Turbofan");
        return this;
    }

    @Override
    public AircraftBuilder buildWings() {
        aircraft.setWings("Delta Wings with Leading Edge Flaps");
        return this;
    }

    @Override
    public AircraftBuilder buildBathroom() {
        // Military jets don't have bathrooms
        return this;
    }

    @Override
    public Aircraft build() {
        return aircraft;
    }

}
