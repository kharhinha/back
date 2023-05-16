/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolioUno.portfolioUno.servicios;

import com.portafolioUno.portfolioUno.entidades.Persona;
import com.portafolioUno.portfolioUno.interfaz.IPersona;
import com.portafolioUno.portfolioUno.repositorios.PersonaInterface;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Noblex
 */
@Service
@Transactional
public class PersonaService implements IPersona{
    @Autowired//inicia la variable el servidor de aplicaciones
    private PersonaInterface perRepo;

    @Override
    public void crearPersona(Persona p) {
        perRepo.save(p);
    }

    @Override
    public void borrarPersona(String id) {
        perRepo.deleteById(id);
    }

    @Override
    public Persona buscar(String id) {
        return perRepo.findById(id).orElse(null);
    }

    @Override
    public void modificarPersona(Persona new_per, String id) {
        Persona p = buscar(id);
        p.setNombre(new_per.getNombre());
        p.setApellido(new_per.getApellido());
        p.setTitulo(new_per.getTitulo());
        crearPersona(p);
    }
}
