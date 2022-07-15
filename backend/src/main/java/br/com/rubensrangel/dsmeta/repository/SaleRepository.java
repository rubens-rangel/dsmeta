package br.com.rubensrangel.dsmeta.repository;

import br.com.rubensrangel.dsmeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
