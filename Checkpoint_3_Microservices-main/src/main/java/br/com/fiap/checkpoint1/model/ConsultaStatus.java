package br.com.fiap.checkpoint1.model;

public enum ConsultaStatus {
    AGENDADA("Sua consulta está marcada"),
    CANCELADA("Sua consulta foi cancelada"),
    REALIZADA("Sua consulta está finalizada");


    ConsultaStatus(String mensagem) {
        this.mensagem = mensagem;
    }
    private String mensagem;

    public String getMensagem() {
        return mensagem;
    }
}
