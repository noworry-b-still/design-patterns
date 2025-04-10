package Builder;
interface AircraftBuilder {
    AircraftBuilder buildCockpit();

    AircraftBuilder buildEngine();

    AircraftBuilder buildWings();

    AircraftBuilder buildBathroom();

    Aircraft build();
}
