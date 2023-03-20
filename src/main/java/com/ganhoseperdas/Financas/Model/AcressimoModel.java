package com.ganhoseperdas.Financas.Model;

import jakarta.persistence.*;

@Entity
@Table(name="Ativos")
public class AcressimoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Integer valorAtivo;
    @Column(nullable = false)
    private Integer lucros;
    @Column
    private Integer perdaPTInicial;
    @Column(nullable = false)
    private String nomeAtivo;

    @Column(nullable = false)
    private Integer patrimonioInicial;
    @Column
    private String RendaFixa;
    @Column
    private String RendaVariavel;
    @Column
    private String FundosdeInvestimento;
    @Column
    private String CDB;
    @Column
    private String TesouroDireto;
    @Column
    private String CryptoMoeda;
    @Column
    private String Acoes;
    @Column
    private String StartUPs;
    @Column
    private String RendasExternas;


    @ManyToOne
    @JoinColumn(name="valorfinal")
    private CategoriaAtivos valorfinal;
    @ManyToOne
    @JoinColumn(name = "categoriaativos_id")
    private CategoriaAtivos categoriaAtivo;


    //Constructor


    public AcressimoModel() {
    }

    public AcressimoModel(Integer id) {
        this.id = id;
    }


    //Getters and Setters


    public Integer getValorAtivo() {
        return valorAtivo;
    }

    public void setValorAtivo(Integer valorAtivo) {
        this.valorAtivo = valorAtivo;
    }

    public Integer getLucros() {
        return lucros;
    }

    public void setLucros(Integer lucros) {
        this.lucros = lucros;
    }

    public Integer getPerdaPTInicial() {
        return perdaPTInicial;
    }

    public void setPerdaPTInicial(Integer perdaPTInicial) {
        this.perdaPTInicial = perdaPTInicial;
    }

    public String getNomeAtivo() {
        return nomeAtivo;
    }

    public void setNomeAtivo(String nomeAtivo) {
        nomeAtivo = nomeAtivo;
    }

    public Integer getPatrimonioInicial() {
        return patrimonioInicial;
    }

    public void setPatrimonioInicial(Integer patrimonioInicial) {
        this.patrimonioInicial = patrimonioInicial;
    }

    public String getRendaFixa() {
        return RendaFixa;
    }

    public void setRendaFixa(String rendaFixa) {
        RendaFixa = rendaFixa;
    }

    public String getRendaVariavel() {
        return RendaVariavel;
    }

    public void setRendaVariavel(String rendaVariavel) {
        RendaVariavel = rendaVariavel;
    }

    public String getFundosdeInvestimento() {
        return FundosdeInvestimento;
    }

    public void setFundosdeInvestimento(String fundosdeInvestimento) {
        FundosdeInvestimento = fundosdeInvestimento;
    }

    public String getCDB() {
        return CDB;
    }

    public void setCDB(String CDB) {
        this.CDB = CDB;
    }

    public String getTesouroDireto() {
        return TesouroDireto;
    }

    public void setTesouroDireto(String tesouroDireto) {
        TesouroDireto = tesouroDireto;
    }

    public String getCryptoMoeda() {
        return CryptoMoeda;
    }

    public void setCryptoMoeda(String cryptoMoeda) {
        CryptoMoeda = cryptoMoeda;
    }

    public String getAcoes() {
        return Acoes;
    }

    public void setAcoes(String acoes) {
        Acoes = acoes;
    }

    public String getStartUPs() {
        return StartUPs;
    }

    public void setStartUPs(String startUPs) {
        StartUPs = startUPs;
    }

    public String getRendasExternas() {
        return RendasExternas;
    }

    public void setRendasExternas(String rendasExternas) {
        RendasExternas = rendasExternas;
    }

    public CategoriaAtivos getCategoriaAtivo() {
        return categoriaAtivo;
    }

    public void setCategoriaAtivo(CategoriaAtivos categoriaAtivo) {
        this.categoriaAtivo = categoriaAtivo;
    }
}

