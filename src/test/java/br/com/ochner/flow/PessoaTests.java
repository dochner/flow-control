package br.com.ochner.flow;

import br.com.ochner.flow.model.Empresa;
import br.com.ochner.flow.model.Pessoa;
import br.com.ochner.flow.repository.PessoaRepository;
import br.com.ochner.flow.service.PessoaService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class PessoaTests {


    @Test
    void addPessoa(){

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Douglas");
        pessoa.setSobrenome("Ochner");
        pessoa.setNomeCompleto("Douglas Ochner");


    }


}
