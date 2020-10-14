package com.zup.nossobancodigital.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "pessoa")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Pessoa {

    @Id
    @GeneratedValue
    private long id;

    private String nome;

    private String sobrenome;

//    @UniqueElements(message = "Já existe outro cliente para o e-mail informado")
    @Column(unique = true)
    private String email;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

//    @UniqueElements(message = "Já existe outro cliente para o cpf informado")
    @Column(unique = true)
    private String cpf;

    @OneToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;
}
