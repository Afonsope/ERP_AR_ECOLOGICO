package br.com.arecologico.erp.database.model;

public class FuncaoEntity {

    private Integer idFuncao;
    private String descricao;

    public FuncaoEntity() {
        idFuncao = 0;
        descricao = new String();
    }

    public FuncaoEntity(Integer idFuncao, String descricao) {
        this.idFuncao = idFuncao;
        this.descricao = descricao;
    }

    public Integer getIdFuncao() {
        return idFuncao;
    }

    public void setIdFuncao(Integer idFuncao) {
        this.idFuncao = idFuncao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
