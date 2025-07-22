package med.voll.api.paciente;

import med.voll.api.endereco.DadosEndereco;

public record DadosPaciente(String nome, String email, String telefone, String CPF, DadosEndereco endereco) {

}
