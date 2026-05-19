public class Producao implements Setor{
    private int nivelRisco;
    private int quantidadeMaquinas;

    public Producao(int nivelRisco, int quantidadeMaquinas) {
        this.nivelRisco = nivelRisco;
        this.quantidadeMaquinas = quantidadeMaquinas;
    }

    public int getNivelRisco() {
        return nivelRisco;
    }

    public int getQuantidadeMaquinas() {
        return quantidadeMaquinas;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitar(this);
    }
}