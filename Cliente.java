public class Cliente {
    private String nomeCompleto;
    private int mesa;

    public Cliente(String nomeCompleto, int mesa) {
        this.nomeCompleto = nomeCompleto;
        this.mesa = mesa;
    }

    public String getPrimeiroNome() {
        // Usa indexOf para encontrar o primeiro espaço e retorna só o primeiro nome
        int indiceEspaco = nomeCompleto.indexOf(" ");
        if (indiceEspaco == -1) {
            return nomeCompleto; // Caso o cliente tenha apenas um nome
        }
        return nomeCompleto.substring(0, indiceEspaco);
    }

    public String nomeMaiusculo() {
        return nomeCompleto.toUpperCase();
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public int getMesa() {
        return mesa;
    }
}