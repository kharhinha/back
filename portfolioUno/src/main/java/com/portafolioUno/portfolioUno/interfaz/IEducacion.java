/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolioUno.portfolioUno.interfaz;

import com.portafolioUno.portfolioUno.entidades.Educacion;
import java.util.List;

/**
 *
 * @author Noblex
 */
public interface IEducacion {

    public void crearEdu(Educacion edu);

    public void borrarEdu(String id);

    public Educacion buscar(String id);

    public List<Educacion> listarEdu();

    public void modificarEdu(Educacion newEdu, Educacion edu);
}
