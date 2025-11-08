package med.voll.api.domain.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosPaciente(

        String nome,

        String email,

        String telefone,

        String cpf,

        @Valid
        DadosEndereco endereco
        ){}
