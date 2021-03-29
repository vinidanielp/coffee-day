package br.com.coffeeday.domain.bebidas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BebidasRepository extends JpaRepository<Bebidas, Long> {

}
