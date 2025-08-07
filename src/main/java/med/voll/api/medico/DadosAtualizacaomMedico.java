package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;
import med.voll.api.endereco.Endereco;

public record DadosAtualizacaomMedico(
        @NotNull Long id,
        String telefone,
        String nome,
        DadosEndereco endereco) {
}
