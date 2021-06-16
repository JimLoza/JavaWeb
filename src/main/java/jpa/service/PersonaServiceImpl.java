/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.service;

import javax.inject.Inject;
import jpa.datos.PersonaDao;
import jpa.test.Persona;

/**
 *
 * @author PC
 */
public class PersonaServiceImpl {
    
    @Inject
    private PersonaDao personaDao;
    
    public void registrarPersona(Persona persona){
        personaDao.insertPersona(persona);
    }
}
