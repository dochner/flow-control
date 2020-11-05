package br.com.ochner.flow.controller;

import br.com.ochner.flow.model.Empresa;
import br.com.ochner.flow.service.EmpresaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {

    static final Logger logger  = LogManager.getLogger(EmpresaController.class.getName());

    @Autowired
    private EmpresaService empresaService;

    // displaying list of all empresa
    @GetMapping("/empresas")
    public List<Empresa> getAllEmpresa(){
        return empresaService.getAllEmpresas();
    }

    // displaying empresa by id
    @GetMapping("/empresas/{id}")
    public Empresa getEmpresa(@PathVariable Long id){
        return empresaService.getEmpresa(id);
    }

    // inserting empresa
    @PostMapping("/empresas")
    public void addEmpresa(@RequestBody Empresa empresa){
        empresaService.addEmpresa(empresa);
    }

    //updating empresa by id
    @PutMapping("/empresas/{id}")
    public void updateEmpresa(@RequestBody Empresa e, @PathVariable Long id){
        empresaService.updateEmpresa(e, id);
    }

    // deleting all empresa
    @DeleteMapping("/empresas")
    public void deleteAllEmpresas(){
        empresaService.deleteAllEmpresa();
    }

    // deleting empresa by id
    @DeleteMapping("empresas/{id}")
    public void deleteEmpresaByID(@RequestBody Empresa e){
        empresaService.deleteEmpresa(e);
    }

    // updating/ patching empresa by id
    @PatchMapping("empresas/{id}")
    public void patchEmpresaByID(@RequestBody Empresa e, @PathVariable Long id) {
        empresaService.patchEmpresa(e, id);
    }
}
