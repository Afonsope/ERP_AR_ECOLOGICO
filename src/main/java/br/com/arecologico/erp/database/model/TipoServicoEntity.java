package br.com.arecologico.erp.database.model;

public class TipoServicoEntity {

    private Integer corTipoServico;
    private String nomeTipo;
    private String descricao;

    public TipoServicoEntity() {
        corTipoServico = 0;
        nomeTipo = new String();
        descricao = new String();
    }

    public TipoServicoEntity(Integer corTipoServico, String nomeTipo, String descricao) {
        this.corTipoServico = corTipoServico;
        this.nomeTipo = nomeTipo;
        this.descricao = descricao;
    }

    public Integer getCorTipoServico() {
        return corTipoServico;
    }

    public void setCorTipoServico(Integer corTipoServico) {
        this.corTipoServico = corTipoServico;
    }

    public String getNomeTipo() {
        return nomeTipo;
    }

    public void setNomeTipo(String nomeTipo) {
        this.nomeTipo = nomeTipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
