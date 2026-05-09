package br.com.arecologico.erp.database.model;

public class FuncionarioEntity extends PessoaEntity {

    private Double salario;

    FuncionarioEntity() {
        super();
        salario = 0.0;
    }

    FuncionarioEntity(Integer cod_Pessoa, String CPF, String nome, String email, String telefone, Double salario, EnderecoEntity endereco) {
        super(cod_Pessoa, CPF, nome, email, telefone, endereco);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
