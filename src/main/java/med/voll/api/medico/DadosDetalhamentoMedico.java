package med.voll.api.medico;

import med.voll.api.endereco.Endereco;

public record DadosDetalhamentoMedico(Long id , String nome, String telefone, String email,Especialidade especialidade, Endereco endereco) {
    public DadosDetalhamentoMedico(Medico medico){
        this(medico.getId(),medico.getNome(),medico.getTelefone(),medico.getEmail(),medico.getEspecialidade(),medico.getEndereco());
    }
}
