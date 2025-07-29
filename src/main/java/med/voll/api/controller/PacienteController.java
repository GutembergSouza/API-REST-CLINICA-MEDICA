package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.paciente.DadosListagemPaciente;
import med.voll.api.paciente.DadosPaciente;
import med.voll.api.paciente.Paciente;
import med.voll.api.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        return repository.findAll(paginacao).map(DadosListagemPaciente::new);
    }


}
