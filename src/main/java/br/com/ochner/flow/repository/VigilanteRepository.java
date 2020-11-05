package br.com.ochner.flow.repository;

import br.com.ochner.flow.model.Vigilante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VigilanteRepository extends JpaRepository<Vigilante, Long> {
}
