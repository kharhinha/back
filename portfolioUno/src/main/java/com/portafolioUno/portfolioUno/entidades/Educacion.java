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
@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(generator="uuid")
    @GenericGenerator(name="uuid",strategy="uuid2")
    private String id;
    private String instituto;
    private String provincia;
    private String titulo;
    private String logo;
    private Date fechaFin;

    public Educacion() {
    }

    public Educacion(String id,String instituto, String provincia, String titulo, String logo, Date fechaFin) {
        this.id = id;
        this.instituto = instituto;
        this.provincia = provincia;
        this.titulo = titulo;
        this.logo = logo;
        this.fechaFin = fechaFin;
    }
}
