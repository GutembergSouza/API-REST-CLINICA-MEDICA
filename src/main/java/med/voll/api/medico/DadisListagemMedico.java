package med.voll.api.medico;

public record DadisListagemMedico(String nome, String email, String crm, Especialidade especialidade) {

    public DadisListagemMedico (Medico medico){
        this(medico.getNome(), medico.getEmail(), medico.getCrm(),medico.getEspecialidade());

    }
}
