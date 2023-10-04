
package entidades;

import java.time.LocalDate;

public class Bombero {
    private int id_bombero;
    private int dni;
    private String nombre_ape;
    private LocalDate fecha_nac;
    private int celular;
    private int codBrigada;

    public Bombero() {
    }

    public Bombero(int dni, String nombre_ape, LocalDate fecha_nac, int celular, int codBrigada) {
        this.dni = dni;
        this.nombre_ape = nombre_ape;
        this.fecha_nac = fecha_nac;
        this.celular = celular;
        this.codBrigada = codBrigada;
    }

    public Bombero(int id_bombero, int dni, String nombre_ape, LocalDate fecha_nac, int celular, int codBrigada) {
        this.id_bombero = id_bombero;
        this.dni = dni;
        this.nombre_ape = nombre_ape;
        this.fecha_nac = fecha_nac;
        this.celular = celular;
        this.codBrigada = codBrigada;
    }

    public int getId_bombero() {
        return id_bombero;
    }

    public void setId_bombero(int id_bombero) {
        this.id_bombero = id_bombero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre_ape() {
        return nombre_ape;
    }

    public void setNombre_ape(String nombre_ape) {
        this.nombre_ape = nombre_ape;
    }

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    @Override
    public String toString() {
        return "Bombero{" + "id_bombero=" + id_bombero + ", dni=" + dni + ", nombre_ape=" + nombre_ape + ", fecha_nac=" + fecha_nac + ", celular=" + celular + ", codBrigada=" + codBrigada + '}';
    }
    
    }
    
    
    

