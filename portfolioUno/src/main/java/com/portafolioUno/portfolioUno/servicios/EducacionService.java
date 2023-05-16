/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolioUno.portfolioUno.servicios;

import com.portafolioUno.portfolioUno.entidades.Educacion;
import com.portafolioUno.portfolioUno.interfaz.IEducacion;
import com.portafolioUno.portfolioUno.repositorios.EducacionInterface;
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
public class EducacionService implements IEducacion{
     @Autowired//inicia la variable el servidor de aplicaciones
    private EducacionInterface eduRepo;    
    
    @Override
    public void crearEdu(Educacion edu) {
        eduRepo.save(edu);
    }

    @Override
    public void borrarEdu(String id) {
        eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscar(String id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public List<Educacion> listarEdu() {
        return eduRepo.findAll();
    }
    
    @Override
    public void modificarEdu(Educacion ed,Educacion edu) {//ed recibe el objeto modificado

        //modifico
        ed.setInstituto(edu.getInstituto());
        ed.setTitulo(edu.getTitulo());
        ed.setProvincia(edu.getProvincia());
        ed.setLogo(edu.getLogo());
        ed.setFechaFin(edu.getFechaFin());
        //guardo
        crearEdu(ed);
    }
}
