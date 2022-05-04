package com.example.springboot.controller;

import com.example.springboot.model.Persona;
import com.example.springboot.repository.service.IPersonaService;
// import java.util.ArrayList;   --1
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable; --1
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestParam; --1
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

 @Autowired   
 private IPersonaService persoServ;
    
//    List <Persona> listaPersonas = new ArrayList();   --1
    
// @GetMapping("/hola/{nombre}/{apellido}/{edad}")

// public String decirHola(@PathVariable String nombre,   --1
//                         @PathVariable String apellido,   --1
//                         @PathVariable int edad)   --1
//  return "hola mundo";    --1
      
// }     --1
  
//  @GetMapping ("/chau")   --1

//  public String decirChau (@RequestParam String nombre,   --1
//                           @RequestParam String apellido,   --1
//                           @RequestParam int edad) {   --1
//    return "chau mundo";   --1
  
// }   --1
  
  @PostMapping ("/new/persona")
  public void agregarPersona (@RequestBody Persona pers){
//      listaPersonas.add(pers);   --1
    persoServ.crearPersona(pers);
  }
  @GetMapping ("/ver/personas")
  @ResponseBody
  public List<Persona> verPersona () {
 //     return listaPersonas;   --1
    return persoServ.verPersona();
  }
  @DeleteMapping ("/delete/{id}")
  public void borrarPerona (long id){
      persoServ.borrarPersona(id);
  }
}