public enum Office {
    ALZIRA("CNP COMISARIA DE ALZIRA, Pere Morell, 4"),
    GANDIA("CNP COMISARIA DE GANDIA  EXPEDICION TIE, Ciudad de Laval, 5"),
    ONTENIENTE("CNP COMISARIA DE ONTENIENTE, Plaza de Escura, 2"),
    SAGUNTO("CNP COMISARIA DE SAGUNTO, Progreso, 14"),
    PATRAIX("CNP COMISARIA PATRAIX EXTRANJERIA, GREMIS, 6");

    public final String address;

    public String getAddress() {
        return this.address;
    }

    private Office(String address) {
        this.address = address;
    }
}
