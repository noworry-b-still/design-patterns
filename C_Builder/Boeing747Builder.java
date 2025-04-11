package C_Builder;

// Boeing747Builder.java - Concrete builder for Boeing 747

class Boeing747Builder implements AircraftBuilder {
    private Aircraft aircraft = new Aircraft();

    @Override
    public AircraftBuilder buildCockpit() {
        aircraft.setCockpit("Boeing 747 Flight Deck");
        return this;
    }

    @Override
    public AircraftBuilder buildEngine() {
        aircraft.setEngine("Four Pratt & Whitney PW4000 Turbofan Engines");
        return this;
    }

    @Override
    public AircraftBuilder buildWings() {
        aircraft.setWings("Swept Back Wings with High-Lift Devices");
        return this;
    }

    @Override
    public AircraftBuilder buildBathroom() {
        aircraft.setBathroom("Multiple Lavatories Throughout Cabin");
        return this;
    }

    @Override
    public Aircraft build() {
        return aircraft;
    }
}