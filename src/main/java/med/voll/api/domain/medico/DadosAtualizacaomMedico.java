package med.voll.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaomMedico(
        @NotNull Long id,
        String telefone,
        String nome,
        DadosEndereco endereco) {
}
