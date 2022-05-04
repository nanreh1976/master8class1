/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.example.springboot.repository.service;

import com.example.springboot.model.Persona;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author nanre
 */
public class PersonaServiceTest {
    
    public PersonaServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of verPersona method, of class PersonaService.
     */
    @Test
    public void testVerPersona() {
        System.out.println("verPersona");
        PersonaService instance = new PersonaService();
        List<Persona> expResult = null;
        List<Persona> result = instance.verPersona();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of crearPersona method, of class PersonaService.
     */
    @Test
    public void testCrearPersona() {
        System.out.println("crearPersona");
        Persona per = null;
        PersonaService instance = new PersonaService();
        instance.crearPersona(per);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarPersona method, of class PersonaService.
     */
    @Test
    public void testBorrarPersona() {
        System.out.println("borrarPersona");
        Long id = null;
        PersonaService instance = new PersonaService();
        instance.borrarPersona(id);
       
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPersona method, of class PersonaService.
     */
    @Test
    public void testBuscarPersona() {
        System.out.println("buscarPersona");
        Long id = null;
        PersonaService instance = new PersonaService();
        Persona expResult = null;
        Persona result = instance.buscarPersona(id);
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }
    
}
