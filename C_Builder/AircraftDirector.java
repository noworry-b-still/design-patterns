package C_Builder;
class AircraftDirector {
    public Aircraft constructAircraft(AircraftBuilder builder) {
        return builder
                .buildCockpit()
                .buildEngine()
                .buildWings()
                .build();
    }

    public Aircraft constructPassengerAircraft(AircraftBuilder builder) {
        return builder
                .buildCockpit()
                .buildEngine()
                .buildWings()
                .buildBathroom()
                .build();
    }
}