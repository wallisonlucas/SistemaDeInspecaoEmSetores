public class Armazem implements Setor{
    private int quantidadeEquipamentos;
    private boolean possuiItensInflamaveis;

    public Armazem(int quantidadeEquipamentos, boolean possuiItensInflamaveis) {
        this.quantidadeEquipamentos = quantidadeEquipamentos;
        this.possuiItensInflamaveis = possuiItensInflamaveis;
    }

    public int getQuantidadeEquipamentos() {
        return quantidadeEquipamentos;
    }

    public boolean isPossuiItensInflamaveis() {
        return possuiItensInflamaveis;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitar(this);
    }
}