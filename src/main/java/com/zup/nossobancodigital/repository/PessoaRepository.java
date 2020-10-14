package com.zup.nossobancodigital.repository;

import com.zup.nossobancodigital.model.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
}
