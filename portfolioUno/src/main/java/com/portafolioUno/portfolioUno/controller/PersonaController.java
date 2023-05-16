/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolioUno.portfolioUno.controller;

import com.portafolioUno.portfolioUno.entidades.Persona;
import com.portafolioUno.portfolioUno.interfaz.IPersona;
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
public class PersonaController {
     @Autowired    
    private IPersona persona;
    
    @PostMapping("/persona/new")
    @ResponseBody
    public void crear(@RequestBody @Nullable Persona p) {
        persona.crearPersona(p);
    }

    @GetMapping("/persona/buscar/{id}")
    @ResponseBody
    public Persona buscar(@PathVariable String id) {
        return persona.buscar(id);
    }
    
    @DeleteMapping("/persona/borrar/{id}")
    public void borrarPersona(@PathVariable String id) {
        persona.borrarPersona(id);
    }
    
    @PutMapping("/persona/cambiar/{id}")
    public void modificar(@PathVariable String id,
            @RequestBody @Nullable Persona p) {
        persona.modificarPersona(p, id);
    }
}
