package com.zup.nossobancodigital.service;

import com.zup.nossobancodigital.dto.DadosPessoaisDTO;
import com.zup.nossobancodigital.model.Pessoa;
import com.zup.nossobancodigital.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PessoaService {

    private final PessoaRepository repository;

    public Pessoa salvarDadosPessoais(Pessoa pessoa) {
        return repository.save(pessoa);
    }
}
