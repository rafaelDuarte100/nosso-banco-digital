package com.zup.nossobancodigital.controller;

import com.zup.nossobancodigital.dto.DadosPessoaisDTO;
import com.zup.nossobancodigital.model.Pessoa;
import com.zup.nossobancodigital.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.net.URI;

@RequiredArgsConstructor
@RestController
@RequestMapping("dados-pessoais")
public class DadosPessoaisController {

    private final PessoaService service;

    @PostMapping
    public ResponseEntity cadastrarDadosPessoais(@RequestBody @Valid DadosPessoaisDTO dadosPessoaisDTO) {
        Pessoa pessoa = service.salvarDadosPessoais(dadosPessoaisDTO.converterParaObjeto());
        return ResponseEntity.created(URI.create("Teste").normalize()).build();
    }
}
