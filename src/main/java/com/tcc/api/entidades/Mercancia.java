package com.tcc.api.entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="mercancias")
public class Mercancia implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column( name = "iup")
    private Integer iup;
    @Column( name = "volumen")
    private Double volumen;
    @Column( name = "nombre")
    private String nombre;



    @Column( name = "tipo_remitente")
    private String tipoRemitente;
    @Column( name = "id_remitente")
    private String idRemitente;
    @Column( name = "nombre_remitente")
    private String nombreRemitente;
    @Column( name = "dpto_Remitente")
    private String dptoRemitente;
    @Column( name = "municipio_Remitente")
    private String municipioRemitente;
    @Column( name = "dirreccion_Remitente")
    private String dirreccionRemitente;




    @Column( name = "tipo_Destinatario")
    private String tipo_Destinatario;
    @Column( name = "id_Destinatario")
    private String idDestinatario;
    @Column( name = "nombre_Destinatario")
    private String nombreDestinatario;
    @Column( name = "dpto_Destinatario")
    private String dptoDestinatario;
    @Column( name = "municipio_Destinatario")
    private String municipioDestinatario;
    @Column( name = "dirreccion_Destinatario")
    private String dirreccionDestinatario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_zona")
    @JsonBackReference
    private Zona zona;

    public Mercancia() {

    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Integer getIup() {
        return iup;
    }

    public String getDptoDestinatario() {
        return dptoDestinatario;
    }

    public void setDptoDestinatario(String dptoDestinatario) {
        this.dptoDestinatario = dptoDestinatario;
    }

    public String getMunicipioDestinatario() {
        return municipioDestinatario;
    }

    public void setMunicipioDestinatario(String municipioDestinatario) {
        this.municipioDestinatario = municipioDestinatario;
    }

    public String getDirreccionDestinatario() {
        return dirreccionDestinatario;
    }

    public void setDirreccionDestinatario(String dirreccionDestinatario) {
        this.dirreccionDestinatario = dirreccionDestinatario;
    }

    public void setIup(Integer iup) {
        this.iup = iup;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoRemitente() {
        return tipoRemitente;
    }

    public void setTipoRemitente(String tipoRemitente) {
        this.tipoRemitente = tipoRemitente;
    }

    public String getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(String idRemitente) {
        this.idRemitente = idRemitente;
    }

    public String getNombreRemitente() {
        return nombreRemitente;
    }

    public void setNombreRemitente(String nombreRemitente) {
        this.nombreRemitente = nombreRemitente;
    }

    public String getDptoRemitente() {
        return dptoRemitente;
    }

    public void setDptoRemitente(String dptoRemitente) {
        this.dptoRemitente = dptoRemitente;
    }

    public String getMunicipioRemitente() {
        return municipioRemitente;
    }

    public void setMunicipioRemitente(String municipioRemitente) {
        this.municipioRemitente = municipioRemitente;
    }

    public String getDirreccionRemitente() {
        return dirreccionRemitente;
    }

    public void setDirreccionRemitente(String dirreccionRemitente) {
        this.dirreccionRemitente = dirreccionRemitente;
    }

    public String getTipo_Destinatario() {
        return tipo_Destinatario;
    }

    public void setTipo_Destinatario(String tipo_Destinatario) {
        this.tipo_Destinatario = tipo_Destinatario;
    }

    public String getIdDestinatario() {
        return idDestinatario;
    }

    public void setIdDestinatario(String idDestinatario) {
        this.idDestinatario = idDestinatario;
    }

    public String getNombreDestinatario() {
        return nombreDestinatario;
    }

    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }
}
