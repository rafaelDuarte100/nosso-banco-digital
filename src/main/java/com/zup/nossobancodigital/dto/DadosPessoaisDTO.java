package com.zup.nossobancodigital.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zup.nossobancodigital.model.Pessoa;
import com.zup.nossobancodigital.validation.DataNascimentoValid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DadosPessoaisDTO {

    @NotBlank(message = "Nome do cliente é obrigatório")
    private String nome;

    @NotBlank(message = "Sobrenome do cliente é obrigatório")
    private String sobrenome;

    @NotBlank(message = "E-mail do cliente é obrigatório")
    @Email(message = "E-mail informado possui formato inválido")
    private String email;

    @NotNull(message = "Data de Nascimento do cliente é obrigatório")
    @DataNascimentoValid(message = "É preciso possuir mais de 18 anos")
    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @NotBlank(message = "CPF do cliente é obrigatório")
    @CPF(message = "CPF informado possui formato inválido")
    private String cpf;

    public Pessoa converterParaObjeto() {
        return Pessoa.builder()
                    .nome(this.nome)
                    .sobrenome(this.sobrenome)
                    .email(this.email)
                    .dataNascimento(this.dataNascimento)
                    .cpf(this.cpf)
                    .build();
    }
}
