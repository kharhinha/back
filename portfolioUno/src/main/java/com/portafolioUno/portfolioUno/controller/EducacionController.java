/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolioUno.portfolioUno.controller;

import com.portafolioUno.portfolioUno.entidades.Educacion;
import com.portafolioUno.portfolioUno.interfaz.IEducacion;
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
public class EducacionController {
    @Autowired
    private IEducacion eduRepo;

    @PostMapping("/educacion/new")
    public void crear(@RequestBody @Nullable Educacion edu) {
        eduRepo.crearEdu(edu);
    }

    @GetMapping("/educacion/buscar/{id}")
    @ResponseBody
    public Educacion buscar(@PathVariable String id) {
        return eduRepo.buscar(id);
    }

    @DeleteMapping("/educacion/borrar/{id}")
    public void borrar(@PathVariable String id) {
        eduRepo.borrarEdu(id);
    }

    @PutMapping("/educacion/cambiar{id}")
    public void modificar(@PathVariable String id,
            @RequestBody @Nullable Educacion edu) {
        Educacion newEdu = buscar(id);
        eduRepo.modificarEdu(newEdu, edu);
    }

    @GetMapping("/educacion/listar")
    public List<Educacion> listar() {
        return eduRepo.listarEdu();
    }
}
