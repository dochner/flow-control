package br.com.ochner.flow.controller;

import br.com.ochner.flow.model.Fluxo;
import br.com.ochner.flow.service.FluxoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FluxoController {

    static final Logger logger  = LogManager.getLogger(FluxoController.class.getName());

    @Autowired
    private FluxoService fluxoService;

    // displaying list of all fluxo
    @GetMapping("/fluxo")
    public List<Fluxo> getAllFluxo(){
        return fluxoService.getAllFluxos();
    }

    // displaying fluxo by id
    @GetMapping("/fluxo/{id}")
    public Fluxo getFluxo(@PathVariable Long id){
        return fluxoService.getFluxo(id);
    }

    // inserting fluxo
    @PostMapping("/fluxo")
    public void addFluxo(@RequestBody Fluxo fluxo){
        fluxoService.addFluxo(fluxo);
    }

    //updating fluxo by id
    @PutMapping("/fluxo/{id}")
    public void updateFluxo(@RequestBody Fluxo f, @PathVariable Long id){
        fluxoService.updateFluxo(f, id);
    }

    // deleting all fluxo
    @DeleteMapping("/fluxo")
    public void deleteAllFluxos(){
        fluxoService.deleteAllFluxo();
    }

    // deleting fluxo by id
    @DeleteMapping("fluxo/{id}")
    public void deleteFluxoByID(@RequestBody Fluxo f){
        fluxoService.deleteFluxo(f);
    }

    // updating/ patching fluxo by id
    @PatchMapping("fluxo/{id}")
    public void patchFluxoByID(@RequestBody Fluxo f, @PathVariable Long id) {
        fluxoService.patchFluxo(f, id);
    }
}
