
package entidades;


public class Brigada {
    private int codBrigada;
    private String nombre;
    private String especialidades;
    private boolean libre;
    private int nro_cuartel;

    public Brigada() {
    }

    public Brigada(String nombre, String especialidades, boolean libre, int nro_cuartel) {
        this.nombre = nombre;
        this.especialidades = especialidades;
        this.libre = libre;
        this.nro_cuartel = nro_cuartel;
    }

    public Brigada(int codBrigada, String nombre, String especialidades, boolean libre, int nro_cuartel) {
        this.codBrigada = codBrigada;
        this.nombre = nombre;
        this.especialidades = especialidades;
        this.libre = libre;
        this.nro_cuartel = nro_cuartel;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public int getNro_cuartel() {
        return nro_cuartel;
    }

    public void setNro_cuartel(int nro_cuartel) {
        this.nro_cuartel = nro_cuartel;
    }

    @Override
    public String toString() {
        return "Brigada{" + "codBrigada=" + codBrigada + ", nombre=" + nombre + ", especialidades=" + especialidades + ", libre=" + libre + ", nro_cuartel=" + nro_cuartel + '}';
    }
    
    
}
