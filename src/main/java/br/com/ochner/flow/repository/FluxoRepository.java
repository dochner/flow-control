package br.com.ochner.flow.repository;

import br.com.ochner.flow.model.Fluxo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FluxoRepository extends JpaRepository<Fluxo, Long> {
}
