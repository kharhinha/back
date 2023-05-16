/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolioUno.portfolioUno.interfaz;

import com.portafolioUno.portfolioUno.entidades.Experiencia;
import java.util.List;

/**
 *
 * @author Noblex
 */
public interface IExperiencia {

    public void crearExp(Experiencia exp);

    public void borrarExp(String id);

    public Experiencia buscarExp(String id);

    public List<Experiencia> listarExp();

    public void modificarExp(Experiencia ex, Experiencia exp);
}
