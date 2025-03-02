package models;

public class Producto {
    private int serial;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(int serial, String nombre, double precio, int stock) {
        this.serial = serial;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}
