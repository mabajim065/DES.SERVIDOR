package com.calabozo.mapa.api;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.calabozo.mapa.model.Ciudad;
import com.calabozo.mapa.repository.CiudadRepository;

@RestController
@RequestMapping("/api/ciudad")

public class ApiCiudadController {

    @Autowired
    private CiudadRepository ciudadRepository;

    /**
     * Punto o de acceso para peticiones GET de /api/ciudad
     * devolverá un json con todas las ciudades
     */
    @GetMapping("path")
    public List<Ciudad> getAllCiudades() {

        // usando el metodo findall sacamos todos los registros de la entidad
        // asociada y los devolvemos como una lista
        // al ser un rest controller se convertirá a json
        return ciudadRepository.findAll();
    }
}
