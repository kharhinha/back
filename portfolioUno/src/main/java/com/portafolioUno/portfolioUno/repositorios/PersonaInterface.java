/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolioUno.portfolioUno.repositorios;

import com.portafolioUno.portfolioUno.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Noblex
 */
public interface PersonaInterface extends JpaRepository<Persona, String>{
    
}
