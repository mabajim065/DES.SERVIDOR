package com.calabozo.mapa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.calabozo.mapa.model.Ciudad;
import com.calabozo.mapa.repository.CiudadRepository;

@Controller
@RequestMapping("/ciudades")
public class cityController {

    @Autowired
    private CiudadRepository ciudadRepository;

    /******************************
     * LISTA DE TODAS LAS CIUDADES
     ******************************/
    @GetMapping
    public String listCities(Model model) {
        List<Ciudad> listaCiudades = ciudadRepository.findAll();
        model.addAttribute("ciudades", listaCiudades);
        return "listaCiudades";
    }

    /******************************
     * ELIMINAR UNA CIUDAD
     ******************************/
    @GetMapping("/eliminar/{id}")
    public String removeCity(@PathVariable Long id, RedirectAttributes redAttrib) {
        if (!ciudadRepository.existsById(id))
            redAttrib.addFlashAttribute("error", "La ciudad no existe");
        else {
            ciudadRepository.deleteById(id);
            redAttrib.addFlashAttribute("success", "Se ha borrado correctamente la ciudad con id " + id);
        }
        return "redirect:/ciudades";
    }

    /******************************
     * NUEVA CIUDAD
     ******************************/
    @GetMapping("/nuevo")
    public String newCity(Model model) {
        model.addAttribute("ciudad", new Ciudad());
        return "nuevaCiudad";
    }

    @PostMapping("/crear")
    public String createCity(@ModelAttribute("ciudad") Ciudad ciudad) {
        ciudadRepository.save(ciudad);
        return "redirect:/ciudades";
    }

    /******************************
     * EDITAR CIUDAD
     ******************************/
    @GetMapping("/editar/{id}")
    public String editCity(@PathVariable Long id, Model model) {
        if (!ciudadRepository.existsById(id)) {
            model.addAttribute("error", "La ciudad no existe");
            return "redirect:/ciudades";
        }
        Ciudad ciudad = ciudadRepository.findById(id).get();
        model.addAttribute("ciudad", ciudad);
        return "editarCiudad";
    }

    @PostMapping("/modificar")
    public String modifyCity(@ModelAttribute("ciudad") Ciudad ciudad, Model model) {
        ciudadRepository.save(ciudad);
        return "redirect:/ciudades";
    }

    /******************************
     * INFO DE UNA CIUDAD
     ******************************/
    @GetMapping("/info/{id}")
public String viewCity(@PathVariable Long id, Model model, RedirectAttributes redAttrib) {
    if (!ciudadRepository.existsById(id)) {
        redAttrib.addFlashAttribute("error", "La ciudad no existe");
        return "redirect:/ciudades";
    }
    Ciudad ciudad = ciudadRepository.findById(id).get();
    model.addAttribute("ciudad", ciudad);
    return "infoCiudad"; 
}

}
