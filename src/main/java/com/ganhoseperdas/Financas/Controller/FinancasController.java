package com.ganhoseperdas.Financas.Controller;

import com.ganhoseperdas.Financas.Model.AcressimoModel;
import com.ganhoseperdas.Financas.Repository.AtivosRepository;
import com.ganhoseperdas.Financas.Service.FinancasService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/financascontrole")
public class FinancasController {

    @Autowired
    private FinancasService financasService;
    @Autowired
    private AtivosRepository ativosRepository;

    @GetMapping(value="listartodos")
    public List<AcressimoModel> getAllAtivos(){
        return ativosRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Object>inserirAtivo(@RequestBody @Valid AcressimoModel lucros){
        return ResponseEntity.status(HttpStatus.CREATED).body(financasService.cadastrarAtivo(lucros));
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Object>getNome(@PathVariable(value="id") Integer id){

        return ResponseEntity.status(HttpStatus.OK).body(financasService.listarAtivos(id));
    }
    @PutMapping(value="/{id}")
    public ResponseEntity<Object>inserirAtivo(@PathVariable(value="id") Integer id,@RequestBody AcressimoModel acressimoModel){
        Optional<AcressimoModel> dadosAtivos=financasService.listarAtivos(id);
        AcressimoModel alterarAtivo=dadosAtivos.get();
        alterarAtivo.setNomeAtivo(acressimoModel.getNomeAtivo());
        alterarAtivo.setValorAtivo(acressimoModel.getValorAtivo());

        return ResponseEntity.status(HttpStatus.OK).body(financasService.cadastrarAtivo(alterarAtivo));
    }
    @DeleteMapping(value="/{id}")
    public ResponseEntity<Object>deleteSalario(@PathVariable(value="id") Integer id){
        financasService.removerAtivo(id);
        return ResponseEntity.status(HttpStatus.OK).body("Registro removido com sucesso");
    }
}
