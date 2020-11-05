package br.com.ochner.flow.controller;

import br.com.ochner.flow.model.Vigilante;
import br.com.ochner.flow.service.VigilanteService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VigilanteController {

    static final Logger logger  = LogManager.getLogger(VigilanteController.class.getName());

    @Autowired
    private VigilanteService vigilanteService;

    // displaying list of all vigilante
    @GetMapping("/vigilantes")
    public List<Vigilante> getAllVigilantes(){
        return vigilanteService.getAllVigilantes();
    }

    // displaying vigilante by id
    @GetMapping("/vigilantes/{id}")
    public Vigilante getVigilante(@PathVariable Long id){
        return vigilanteService.getVigilante(id);
    }

    // inserting vigilante
    @PostMapping("/vigilantes")
    public void addVigilante(@RequestBody Vigilante vigilante){
        vigilanteService.addVigilante(vigilante);
    }

    //updating vigilante by id
    @PutMapping("/vigilantes/{id}")
    public void updateVigilante(@RequestBody Vigilante f, @PathVariable Long id){
        vigilanteService.updateVigilante(f, id);
    }

    // deleting all vigilante
    @DeleteMapping("/vigilantes")
    public void deleteAllVigilantes(){
        vigilanteService.deleteAllVigilante();
    }

    // deleting vigilante by id
    @DeleteMapping("vigilantes/{id}")
    public void deleteVigilanteByID(@RequestBody Vigilante f){
        vigilanteService.deleteVigilante(f);
    }

    // updating/ patching vigilante by id
    @PatchMapping("vigilantes/{id}")
    public void patchVigilanteByID(@RequestBody Vigilante f, @PathVariable Long id) {
        vigilanteService.patchVigilante(f, id);
    }
}
