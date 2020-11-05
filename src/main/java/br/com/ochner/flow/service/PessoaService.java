package br.com.ochner.flow.service;

import br.com.ochner.flow.model.Pessoa;
import br.com.ochner.flow.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository PessoaRepository;


    // fetching all Pessoa
    public List<Pessoa> getAllPessoas(){
        List<Pessoa> pessoas = (List<Pessoa>)PessoaRepository.findAll();
        return pessoas;
    }

    // fetching Pessoa by id
    public Pessoa getPessoa(Long id){
        return PessoaRepository.getOne(id);
    }

    // inserting Pessoa
    public void addPessoa(Pessoa p) {
        PessoaRepository.save(p);
    }

    // updating Pessoa by id
    public void updatePessoa(Pessoa p, Long id){
        if(id == p.getId()) {
            PessoaRepository.save(p);
        }
    }

    // deleting all Pessoas
    public void deleteAllPessoa(){
        PessoaRepository.deleteAll();
    }

    // deleting Pessoa by id
    public void deletePessoa(Pessoa p){
        PessoaRepository.delete(p);
    }

    //patching/updating Pessoa by id
    public void patchPessoa(Pessoa p, Long id) {
        if(id == p.getId()) {
            PessoaRepository.save(p);
        }
    }
}
