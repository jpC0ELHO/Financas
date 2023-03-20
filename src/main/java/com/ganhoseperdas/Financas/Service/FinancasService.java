package com.ganhoseperdas.Financas.Service;


import com.ganhoseperdas.Financas.Model.AcressimoModel;
import com.ganhoseperdas.Financas.Model.CategoriaAtivos;
import com.ganhoseperdas.Financas.Repository.AtivosRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FinancasService {

    @Autowired
    private AtivosRepository ativosRepository;

    public FinancasService() {
    }

    @Transactional
    public List<AcressimoModel> ListarLucros() {
        List<AcressimoModel> listarLucrosTipos = this.ativosRepository.findAll();
        return listarLucrosTipos;
    }

    @Transactional
    public AcressimoModel cadastrarAtivo(AcressimoModel acressimoModel) {
        CategoriaAtivos categoria1 = new CategoriaAtivos(1);
        CategoriaAtivos categoria2 = new CategoriaAtivos(2);
        CategoriaAtivos categoria3 = new CategoriaAtivos(3);
        CategoriaAtivos categoria4 = new CategoriaAtivos(4);
        Integer result;


        if(acressimoModel.getValorAtivo()<=1301){

            result= acressimoModel.getLucros()+acressimoModel.getValorAtivo()-acressimoModel.getPerdaPTInicial();
            acressimoModel.setValorAtivo(result);
            categoria1.setValorFinal(result);
            acressimoModel.setCategoriaAtivo(categoria1);

        }
      else if (acressimoModel.getValorAtivo() >= 1301.01 && acressimoModel.getValorAtivo() <= 4999) {
            result= acressimoModel.getLucros()+acressimoModel.getValorAtivo()-acressimoModel.getPerdaPTInicial();
            acressimoModel.setValorAtivo(result);
            categoria2.setValorFinal(result);
            acressimoModel.setCategoriaAtivo(categoria2);
        } else if (acressimoModel.getValorAtivo() >= 5000 && acressimoModel.getValorAtivo() <= 7000) {
            result= acressimoModel.getLucros()+acressimoModel.getValorAtivo()-acressimoModel.getPerdaPTInicial();
            acressimoModel.setValorAtivo(result);
            categoria3.setValorFinal(result);
            acressimoModel.setCategoriaAtivo(categoria3);
        } else if (acressimoModel.getValorAtivo() >= 7001 && acressimoModel.getValorAtivo() <= 20000) {
            result= acressimoModel.getLucros()+acressimoModel.getValorAtivo()-acressimoModel.getPerdaPTInicial();
            acressimoModel.setValorAtivo(result);
            categoria4.setValorFinal(result);
            acressimoModel.setCategoriaAtivo(categoria4);
        }

        return (AcressimoModel) this.ativosRepository.save(acressimoModel);
    }

    public Optional<AcressimoModel> listarAtivos(Integer id) {
        return this.ativosRepository.findById(id);
    }

    @Transactional
    public void removerAtivo(Integer id) {
        this.ativosRepository.deleteById(id);
    }
}
