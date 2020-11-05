package br.com.ochner.flow.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Entity
public class Fluxo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER)
    private Pessoa pessoa;

    private String destino;

    private LocalDateTime entrada, saida;

    private String veiculo;

    @ManyToOne
    private Vigilante vigilante;

}
