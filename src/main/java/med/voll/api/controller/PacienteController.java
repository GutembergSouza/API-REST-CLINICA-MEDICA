package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.paciente.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    PacienteRepository repository;

    @PostMapping
    public void caddastrarPaciente (@RequestBody @Valid DadosPaciente paciente){
        repository.save(new Paciente(paciente));
    }

    @GetMapping
    public Page<DadosListagemPaciente> listar(@PageableDefault(size = 10) Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemPaciente::new);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deletarPaciente(@PathVariable Long id){
        var paciente = repository.getReferenceById(id);
        paciente.excluir();
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAtualizacaoPaciente dados){
        var paciente = repository.getReferenceById(dados.id());
        paciente.atualizarInformacoes(dados);
    }

}
