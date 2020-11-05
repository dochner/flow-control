package br.com.ochner.flow.service;

import br.com.ochner.flow.model.Empresa;
import br.com.ochner.flow.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {

        @Autowired
        private EmpresaRepository empresaRepository;


        // fetching all Empresa
        public List<Empresa> getAllEmpresas(){
            List<Empresa> empresas = (List<Empresa>)empresaRepository.findAll();
            return empresas;
        }

        // fetching Empresa by id
        public Empresa getEmpresa(Long id){
            return empresaRepository.getOne(id);
        }

        // inserting Empresa
        public void addEmpresa(Empresa p) {
            empresaRepository.save(p);
        }

        // updating Empresa by id
        public void updateEmpresa(Empresa p, Long id){
            if(id == p.getId()) {
                empresaRepository.save(p);
            }
        }

        // deleting all Empresas
        public void deleteAllEmpresa(){
            empresaRepository.deleteAll();
        }

        // deleting Empresa by id
        public void deleteEmpresa(Empresa p){
            empresaRepository.delete(p);
        }

        //patching/updating Empresa by id
        public void patchEmpresa(Empresa p, Long id) {
            if(id == p.getId()) {
                empresaRepository.save(p);
            }
        }
    }
