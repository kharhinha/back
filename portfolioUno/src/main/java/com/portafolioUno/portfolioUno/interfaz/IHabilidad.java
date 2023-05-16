/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolioUno.portfolioUno.interfaz;

import com.portafolioUno.portfolioUno.entidades.Habilidad;

/**
 *
 * @author Noblex
 */
public interface IHabilidad {

    public void crearHab(Habilidad hab);

    public void borrarHab(String id);

    public Habilidad buscar(String id);

    public void modificarHab(String id, Habilidad hab);
}
