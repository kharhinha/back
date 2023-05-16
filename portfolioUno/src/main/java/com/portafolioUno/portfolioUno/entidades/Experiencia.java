/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolioUno.portfolioUno.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Noblex
 */
@Getter
@Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    private String puesto;
    private String logo;
    private String lugarTrabajo;
    private Date fechaInicio;
    private Date fechaFin;
    private String descripcion;

    public Experiencia() {
    }
    
    public Experiencia(String id, String puesto, String logo, String lugarTrabajo, Date fechaInicio, Date fechaFin, String descripcion) {
        this.id = id;
        this.puesto = puesto;
        this.logo = logo;
        this.lugarTrabajo = lugarTrabajo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.descripcion = descripcion;
    }
}
