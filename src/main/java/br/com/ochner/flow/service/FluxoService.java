package br.com.ochner.flow.service;

import br.com.ochner.flow.model.Fluxo;
import br.com.ochner.flow.repository.FluxoRepository;
import br.com.ochner.flow.repository.VigilanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FluxoService {

    @Autowired
    private FluxoRepository fluxoRepository;

    // fetching all Fluxo
    public List<Fluxo> getAllFluxos(){
        List<Fluxo> fluxos = (List<Fluxo>)fluxoRepository.findAll();
        return fluxos;
    }

    // fetching Fluxo by id
    public Fluxo getFluxo(Long id){
        return fluxoRepository.getOne(id);
    }

    // inserting Fluxo
    public void addFluxo(Fluxo v) {
        fluxoRepository.save(v);
    }

    // updating Fluxo by id
    public void updateFluxo(Fluxo v, Long id){
        if(id == v.getId()) {
            fluxoRepository.save(v);
        }
    }

    // deleting all Fluxos
    public void deleteAllFluxo(){
        fluxoRepository.deleteAll();
    }

    // deleting Fluxo by id
    public void deleteFluxo(Fluxo v){
        fluxoRepository.delete(v);
    }

    //patching/updating Fluxo by id
    public void patchFluxo(Fluxo v, Long id) {
        if(id == v.getId()) {
            fluxoRepository.save(v);
        }
    }
}
