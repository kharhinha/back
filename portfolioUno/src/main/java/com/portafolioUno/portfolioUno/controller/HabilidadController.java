/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolioUno.portfolioUno.controller;

import com.portafolioUno.portfolioUno.entidades.Habilidad;
import com.portafolioUno.portfolioUno.interfaz.IHabilidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Noblex
 */
@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class HabilidadController {
    @Autowired
    private IHabilidad habRepo;
    
    @PostMapping("/habilidad/new")
    public void crear(@RequestBody @Nullable Habilidad hab){
        habRepo.crearHab(hab);
    }
    
    @GetMapping("/habilidad/buscar/{id}")
    @ResponseBody 
    public Habilidad buscar(@PathVariable String id){
        return habRepo.buscar(id);
    }
    
    @DeleteMapping("/habilidad/borrar{id}")
    public void borra(@PathVariable String id){
        habRepo.borrarHab(id);
    }
    
    @PutMapping("/habilidad/cambiar/{id}")
    public void modificar(@PathVariable String id,
            @RequestBody @Nullable Habilidad hab){
        habRepo.modificarHab(id,hab);
    }
}
