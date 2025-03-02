package models;

public class Cita {

    private int id;
    private Mascota mascota;
    private String fecha;
    private String motivo;
    private String observaciones;

    public Cita() {
        super();
    }

    public Cita (Mascota mascota, String fecha, String motivo, String observaciones) {

        this.mascota = mascota;
        this.fecha = fecha;
        this.motivo = motivo;
        this.observaciones = observaciones;

    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
