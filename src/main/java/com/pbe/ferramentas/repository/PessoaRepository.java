package com.pbe.ferramentas.repository;

import com.pbe.ferramentas.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
