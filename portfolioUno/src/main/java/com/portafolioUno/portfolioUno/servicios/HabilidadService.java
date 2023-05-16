/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolioUno.portfolioUno.servicios;

import com.portafolioUno.portfolioUno.entidades.Habilidad;
import com.portafolioUno.portfolioUno.interfaz.IHabilidad;
import com.portafolioUno.portfolioUno.repositorios.HabilidadInterface;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noblex
 */
@Service
@Transactional
public class HabilidadService implements IHabilidad{
    @Autowired//inicia la variable el servidor de aplicaciones
    private HabilidadInterface habRepo;

    @Override
    public void crearHab(Habilidad hab) {
        habRepo.save(hab);
    }

    @Override
    public void borrarHab(String id) {
        habRepo.deleteById(id);
    }

    @Override
    public Habilidad buscar(String id) {
        return habRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarHab(String id, Habilidad hab) {
        Habilidad ha = buscar(id);
        //modifico
        ha.setLogo(hab.getLogo());
        ha.setAlt(hab.getAlt());
        //guardo
        crearHab(ha);
    }
}
