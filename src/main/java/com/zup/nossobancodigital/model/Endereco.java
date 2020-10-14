package com.zup.nossobancodigital.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Endereco {

    @Id
    private long id;

    private String cep;

    private String rua;

    private String bairro;

    private String complemento;

    private String cidade;

    private String estado;
}
