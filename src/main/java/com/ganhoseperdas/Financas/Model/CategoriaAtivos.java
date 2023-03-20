package com.ganhoseperdas.Financas.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "CategoriaAtivos")
public class CategoriaAtivos {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String tipoAtivo;
    @Column(nullable = false)
    private Integer valorFinal;


    //Constructors


    public CategoriaAtivos() {
    }

    public CategoriaAtivos(Integer id) {
        this.id = id;
    }

    //Getters and Setters


    public Integer getValorFinal(Integer result) {
        return valorFinal;
    }

    public void setValorFinal(Integer valorFinal) {
        this.valorFinal = valorFinal;
    }

    public String getTipoAtivo() {
        return tipoAtivo;
    }

    public void setTipoAtivo(String tipoAtivo) {
        this.tipoAtivo = tipoAtivo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
