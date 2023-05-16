/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolioUno.portfolioUno.servicios;

import com.portafolioUno.portfolioUno.entidades.Experiencia;
import com.portafolioUno.portfolioUno.interfaz.IExperiencia;
import com.portafolioUno.portfolioUno.repositorios.ExperienciaInterface;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noblex
 */
@Service
@Transactional
public class ExperienciaService implements IExperiencia{
    @Autowired//inicia la variable el servidor de aplicaciones
    private ExperienciaInterface expRepo;
    
    @Override
    public void crearExp(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExp(String id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExp(String id) {
        return expRepo.findById(id).orElse(null);
    }

    @Override
    public List<Experiencia> listarExp() {
       return expRepo.findAll();
    }

    @Override
    public void modificarExp(Experiencia ex,Experiencia exp) {//ex recibe la experiencia modificada
        
        //modifico
        ex.setLugarTrabajo(exp.getLugarTrabajo());
        ex.setPuesto(exp.getPuesto());
        ex.setDescripcion(exp.getDescripcion());
        ex.setLogo(exp.getLogo());
        ex.setFechaInicio(exp.getFechaInicio());
        ex.setFechaFin(exp.getFechaFin());
        //guardo
        crearExp(ex);
    }
}
