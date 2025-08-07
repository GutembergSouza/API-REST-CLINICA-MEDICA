package med.voll.api.paciente;

import med.voll.api.endereco.DadosEndereco;
import med.voll.api.endereco.Endereco;

public record DadosDetalhamentoPaciente(String nome, String telefone, Endereco endereco) {
    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getNome(),paciente.getTelefone(),paciente.getEndereco());
    }
}
