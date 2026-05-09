package br.com.arecologico.erp.database.model;

public class PessoaJuridicaEntity extends PessoaEntity {

    private String CNPJ;

    PessoaJuridicaEntity() {
        CNPJ = new String();
    }

    PessoaJuridicaEntity(Integer cod_Pessoa, String CPF, String nome, String email, String telefone, String CNPJ, EnderecoEntity endereco) {
        super(cod_Pessoa, CPF, nome, email, telefone, endereco);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }

}
