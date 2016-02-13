package com.ar.dev.tierra.api.model;
// Generated 09/02/2016 00:04:55 by Hibernate Tools 4.3.1

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Proveedor generated by hbm2java
 */
@Entity
@Table(name = "proveedor")
public class Proveedor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_proveedor", unique = true, nullable = false)
    private int idProveedor;

    @Column(name = "nombre_proveedor", nullable = false, length = 200)
    private String nombreProveedor;

    @Column(name = "cuit_proveedor", unique = true, nullable = false, length = 100)
    private String cuitProveedor;

    @Column(name = "direccion_proveedor", nullable = false, length = 200)
    private String direccionProveedor;

    @Column(name = "pais_proveedor", nullable = false, length = 100)
    private String paisProveedor;

    @Column(name = "provincia_proveedor", length = 100)
    private String provinciaProveedor;

    @Column(name = "localidad_proveedor", length = 100)
    private String localidadProveedor;

    @Column(name = "codigo_postal", length = 100)
    private String codigoPostal;

    @Column(name = "telefono_proveedor", length = 100)
    private String telefonoProveedor;

    @Column(name = "email_proveedor", length = 150)
    private String emailProveedor;

    @Column(name = "estado_proveedor", nullable = false)
    private boolean estadoProveedor;

    @Column(name = "usuario_creacion", nullable = false)
    private int usuarioCreacion;

    @Column(name = "usuario_modificacion")
    private Integer usuarioModificacion;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_creacion", nullable = false, length = 13)
    private Date fechaCreacion;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_modificacion", length = 13)
    private Date fechaModificacion;

    public Proveedor() {
    }

    public Proveedor(int idProveedor, String nombreProveedor, String cuitProveedor, String direccionProveedor, String paisProveedor, String provinciaProveedor, String localidadProveedor, String codigoPostal, String telefonoProveedor, String emailProveedor, boolean estadoProveedor) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.cuitProveedor = cuitProveedor;
        this.direccionProveedor = direccionProveedor;
        this.paisProveedor = paisProveedor;
        this.provinciaProveedor = provinciaProveedor;
        this.localidadProveedor = localidadProveedor;
        this.codigoPostal = codigoPostal;
        this.telefonoProveedor = telefonoProveedor;
        this.emailProveedor = emailProveedor;
        this.estadoProveedor = estadoProveedor;
    }

    public Proveedor(int idProveedor, String nombreProveedor, String cuitProveedor, String direccionProveedor, String paisProveedor, String provinciaProveedor, String localidadProveedor, String codigoPostal, String telefonoProveedor, String emailProveedor, boolean estadoProveedor, int usuarioCreacion, Integer usuarioModificacion, Date fechaCreacion, Date fechaModificacion) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
        this.cuitProveedor = cuitProveedor;
        this.direccionProveedor = direccionProveedor;
        this.paisProveedor = paisProveedor;
        this.provinciaProveedor = provinciaProveedor;
        this.localidadProveedor = localidadProveedor;
        this.codigoPostal = codigoPostal;
        this.telefonoProveedor = telefonoProveedor;
        this.emailProveedor = emailProveedor;
        this.estadoProveedor = estadoProveedor;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
    }

    /**
     * @return the idProveedor
     */
    public int getIdProveedor() {
        return idProveedor;
    }

    /**
     * @param idProveedor the idProveedor to set
     */
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    /**
     * @return the nombreProveedor
     */
    public String getNombreProveedor() {
        return nombreProveedor;
    }

    /**
     * @param nombreProveedor the nombreProveedor to set
     */
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    /**
     * @return the cuitProveedor
     */
    public String getCuitProveedor() {
        return cuitProveedor;
    }

    /**
     * @param cuitProveedor the cuitProveedor to set
     */
    public void setCuitProveedor(String cuitProveedor) {
        this.cuitProveedor = cuitProveedor;
    }

    /**
     * @return the direccionProveedor
     */
    public String getDireccionProveedor() {
        return direccionProveedor;
    }

    /**
     * @param direccionProveedor the direccionProveedor to set
     */
    public void setDireccionProveedor(String direccionProveedor) {
        this.direccionProveedor = direccionProveedor;
    }

    /**
     * @return the paisProveedor
     */
    public String getPaisProveedor() {
        return paisProveedor;
    }

    /**
     * @param paisProveedor the paisProveedor to set
     */
    public void setPaisProveedor(String paisProveedor) {
        this.paisProveedor = paisProveedor;
    }

    /**
     * @return the provinciaProveedor
     */
    public String getProvinciaProveedor() {
        return provinciaProveedor;
    }

    /**
     * @param provinciaProveedor the provinciaProveedor to set
     */
    public void setProvinciaProveedor(String provinciaProveedor) {
        this.provinciaProveedor = provinciaProveedor;
    }

    /**
     * @return the localidadProveedor
     */
    public String getLocalidadProveedor() {
        return localidadProveedor;
    }

    /**
     * @param localidadProveedor the localidadProveedor to set
     */
    public void setLocalidadProveedor(String localidadProveedor) {
        this.localidadProveedor = localidadProveedor;
    }

    /**
     * @return the codigoPostal
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * @param codigoPostal the codigoPostal to set
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * @return the telefonoProveedor
     */
    public String getTelefonoProveedor() {
        return telefonoProveedor;
    }

    /**
     * @param telefonoProveedor the telefonoProveedor to set
     */
    public void setTelefonoProveedor(String telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }

    /**
     * @return the emailProveedor
     */
    public String getEmailProveedor() {
        return emailProveedor;
    }

    /**
     * @param emailProveedor the emailProveedor to set
     */
    public void setEmailProveedor(String emailProveedor) {
        this.emailProveedor = emailProveedor;
    }

    /**
     * @return the estadoProveedor
     */
    public boolean isEstadoProveedor() {
        return estadoProveedor;
    }

    /**
     * @param estadoProveedor the estadoProveedor to set
     */
    public void setEstadoProveedor(boolean estadoProveedor) {
        this.estadoProveedor = estadoProveedor;
    }

    /**
     * @return the usuarioCreacion
     */
    public int getUsuarioCreacion() {
        return usuarioCreacion;
    }

    /**
     * @param usuarioCreacion the usuarioCreacion to set
     */
    public void setUsuarioCreacion(int usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    /**
     * @return the usuarioModificacion
     */
    public Integer getUsuarioModificacion() {
        return usuarioModificacion;
    }

    /**
     * @param usuarioModificacion the usuarioModificacion to set
     */
    public void setUsuarioModificacion(Integer usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    /**
     * @return the fechaCreacion
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * @return the fechaModificacion
     */
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * @param fechaModificacion the fechaModificacion to set
     */
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

}