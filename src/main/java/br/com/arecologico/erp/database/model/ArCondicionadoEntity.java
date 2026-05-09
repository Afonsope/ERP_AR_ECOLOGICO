package br.com.arecologico.erp.database.model;

public class ArCondicionadoEntity {

    private Integer idAr;
    private String modelo;
    private Integer btus;
    private MarcaEntity marca;

    public ArCondicionadoEntity() {
        idAr = 0;
        modelo = new String();
        btus = 0;
        marca = new MarcaEntity();
    }
    
    public ArCondicionadoEntity(Integer idAr, String modelo, Integer btus, MarcaEntity marca) {
        this.idAr = idAr;
        this.modelo = modelo;
        this.btus = btus;
        this.marca = marca;
    }

    public Integer getIdAr() {
        return idAr;
    }

    public void setIdAr(Integer idAr) {
        this.idAr = idAr;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getBtus() {
        return btus;
    }

    public void setBtus(Integer btus) {
        this.btus = btus;
    }

    public MarcaEntity getMarca() {
        return marca;
    }

    public void setMarca(MarcaEntity marca) {
        this.marca = marca;
    }
}
