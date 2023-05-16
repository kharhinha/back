/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolioUno.portfolioUno.controller;

import com.portafolioUno.portfolioUno.entidades.Experiencia;
import com.portafolioUno.portfolioUno.interfaz.IExperiencia;
import java.util.List;
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
public class ExperienciaController {
    @Autowired
    private IExperiencia expRepo;
    
    @PostMapping("/experiencia/new")
    public void crear(@RequestBody @Nullable Experiencia exp){
        expRepo.crearExp(exp);
    }
    
    @GetMapping("/experiencia/buscar/{id}")
    @ResponseBody
    public Experiencia buscar(@PathVariable String id){
        return expRepo.buscarExp(id);
    }
    
    @DeleteMapping("/experiencia/borrar/{id}")
    public void borrar(@PathVariable String id){
        expRepo.borrarExp(id);
    }
    
    @GetMapping("/experiencia/listar")
    public List<Experiencia> listar() {
        return expRepo.listarExp();
    }
    
    @PutMapping("/experiencia/cambiar/{id}")
    public void modificar(@PathVariable String id,
            @RequestBody @Nullable Experiencia exp){
        Experiencia ex =buscar(id);
        expRepo.modificarExp(ex, exp);
    }
}
