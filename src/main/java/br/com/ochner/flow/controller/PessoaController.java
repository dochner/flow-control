package br.com.ochner.flow.controller;

import br.com.ochner.flow.model.Pessoa;
import br.com.ochner.flow.service.PessoaService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PessoaController {

        static final Logger logger  = LogManager.getLogger(PessoaController.class.getName());

        @Autowired
        private PessoaService pessoaService;

        // displaying list of all pessoa
        @GetMapping("/pessoas")
        public List<Pessoa> getAllPessoa(){
            return pessoaService.getAllPessoas();
        }

        // displaying pessoa by id
        @GetMapping("/pessoas/{id}")
        public Pessoa getPessoa(@PathVariable Long id){
            return pessoaService.getPessoa(id);
        }

        // inserting pessoa
        @PostMapping("/pessoas")
        public void addPessoa(@RequestBody Pessoa pessoa){
            pessoaService.addPessoa(pessoa);
        }

        //updating pessoa by id
        @PutMapping("/pessoas/{id}")
        public void updatePessoa(@RequestBody Pessoa d, @PathVariable Long id){
            pessoaService.updatePessoa(d, id);
        }

        // deleting all pessoa
        @DeleteMapping("/pessoas")
        public void deleteAllPessoas(){
            pessoaService.deleteAllPessoa();
        }

        // deleting pessoa by id
        @DeleteMapping("pessoas/{id}")
        public void deletePessoaByID(@RequestBody Pessoa d){
            pessoaService.deletePessoa(d);
        }

        // updating/ patching pessoa by id
        @PatchMapping("pessoas/{id}")
        public void patchPessoaByID(@RequestBody Pessoa d, @PathVariable Long id) {
            pessoaService.patchPessoa(d, id);
        }
    }
