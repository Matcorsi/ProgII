package Practico8.Ejercicio2;

public abstract class ElementoPostal {
    private String codigo_seguimiento;
    private String ciudad_destino;
    private String direc_destinatario;
    private String direc_remitente;

    public ElementoPostal(String codigo, String ciudad, String direc_destinatario, String direc_remitente){
        this.codigo_seguimiento = codigo;
        this.ciudad_destino = ciudad;
        this.direc_destinatario = direc_destinatario;
        this.direc_remitente = direc_remitente;
    }

    public String getCiudad_destino() {
        return ciudad_destino;
    }

    public void setCiudad_destino(String ciudad_destino) {
        this.ciudad_destino = ciudad_destino;
    }

    public String getCodigo_seguimiento() {
        return codigo_seguimiento;
    }

    public void setCodigo_seguimiento(String codigo_seguimiento) {
        this.codigo_seguimiento = codigo_seguimiento;
    }

    public abstract String getDirec_destinatario();

    public void setDirec_destinatario(String direc_destinatario) {
        this.direc_destinatario = direc_destinatario;
    }

    public abstract String getDirec_remitente();

    public void setDirec_remitente(String direc_remitente) {
        this.direc_remitente = direc_remitente;
    }

    public abstract double getPeso();

    

}
