package med.voll.api.paciente;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.Endereco;

@Entity(name = "Paciente")
@Table(name = "Pacientes")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String telefone;

    private String cpf;

    private Boolean ativo;

    @Embedded
    private Endereco endereco;

   public Paciente(DadosPaciente dados ){
       this.ativo = true;
       this.cpf = dados.cpf();
       this.email = dados.email();
       this.telefone = dados.telefone();
       this.nome = dados.nome();
       this.endereco = new Endereco(dados.endereco());

   }

   public void excluir(){
       this.ativo = false;
   }

   public void atualizarInformacoes(@Valid  DadosAtualizacaoPaciente dados){
        this.nome = dados.nome() != null ? dados.nome() : this.nome;
        this.telefone = dados.telefone() != null ? dados.telefone() : this.telefone;
        this.endereco = dados.endereco() != null ? dados.endereco() : this.endereco;
   }
}
