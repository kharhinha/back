/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolioUno.portfolioUno.interfaz;

import com.portafolioUno.portfolioUno.entidades.Persona;

/**
 *
 * @author Noblex
 */
public interface IPersona {

    public void crearPersona(Persona p);

    public void borrarPersona(String id);

    public Persona buscar(String id);

    public void modificarPersona(Persona p, String id);
}
