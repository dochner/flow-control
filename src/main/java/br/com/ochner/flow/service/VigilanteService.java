package br.com.ochner.flow.service;

import br.com.ochner.flow.model.Vigilante;
import br.com.ochner.flow.repository.VigilanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VigilanteService {

        @Autowired
        private VigilanteRepository vigilanteRepository;


        // fetching all Vigilante
        public List<Vigilante> getAllVigilantes(){
            List<Vigilante> vigilantes = (List<Vigilante>)vigilanteRepository.findAll();
            return vigilantes;
        }

        // fetching Vigilante by id
        public Vigilante getVigilante(Long id){
            return vigilanteRepository.getOne(id);
        }

        // inserting Vigilante
        public void addVigilante(Vigilante v) {
            vigilanteRepository.save(v);
        }

        // updating Vigilante by id
        public void updateVigilante(Vigilante v, Long id){
            if(id == v.getId()) {
                vigilanteRepository.save(v);
            }
        }

        // deleting all Vigilantes
        public void deleteAllVigilante(){
            vigilanteRepository.deleteAll();
        }

        // deleting Vigilante by id
        public void deleteVigilante(Vigilante v){
            vigilanteRepository.delete(v);
        }

        //patching/updating Vigilante by id
        public void patchVigilante(Vigilante v, Long id) {
            if(id == v.getId()) {
                vigilanteRepository.save(v);
            }
        }
    }
