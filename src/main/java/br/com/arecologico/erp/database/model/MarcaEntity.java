package br.com.arecologico.erp.database.model;

public class MarcaEntity {

    private Integer CodMarca;
    private String nomeMarca;

    public MarcaEntity() {
        CodMarca = 0;
        nomeMarca = new String();
    }

    public MarcaEntity(Integer CodMarca, String nomeMarca) {
        this.CodMarca = CodMarca;
        this.nomeMarca = nomeMarca;
    }

    public Integer getCodMarca() {
        return CodMarca;
    }

    public void setCodMarca(Integer codMarca) {
        CodMarca = codMarca;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }
}
