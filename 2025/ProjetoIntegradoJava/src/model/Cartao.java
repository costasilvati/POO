package model;

public class Cartao {
    private int id;
    private Cliente titular;
    private String numeroCartao;
    private String vencimento; // Formato MM/AA
    private String codSeguranca; // 3 dígitos
    private boolean bloqueado;
    private Funcionario idFuncionario; // Funcionário que cadastrou

    public Cartao(int id, Cliente titular, String numeroCartao, String vencimento, String codSeguranca, boolean bloqueado, Funcionario idFuncionario) {
        this.id = id;
        this.titular = titular;
        this.numeroCartao = numeroCartao;
        this.vencimento = vencimento;
        this.codSeguranca = codSeguranca;
        this.bloqueado = bloqueado;
        this.idFuncionario = idFuncionario;
    }
    
    public Cartao() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getCodSeguranca() {
        return codSeguranca;
    }

    public void setCodSeguranca(String codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public Funcionario getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Funcionario idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Override
    public String toString() {
        return "Cartao{" +
               "id=" + id +
               ", titularNome=" + (titular != null ? titular.getNome() : "N/A") +
               ", numeroCartao='" + "**** **** **** " + (numeroCartao != null && numeroCartao.length() > 4 ? numeroCartao.substring(numeroCartao.length() - 4) : "****") + '\'' +
               ", vencimento='" + vencimento + '\'' +
               ", bloqueado=" + bloqueado +
               ", cadastradoPorFuncionarioId=" + (idFuncionario != null ? idFuncionario.getId() : "N/A") +
               '}';
    }
}