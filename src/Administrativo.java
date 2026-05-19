public class Administrativo implements Setor{
    private int quantidadeFuncionarios;
    private boolean documentosOrganizados;

    public Administrativo(int quantidadeFuncionarios, boolean documentosOrganizados){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.documentosOrganizados = documentosOrganizados;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public boolean isDocumentosOrganizados(){
        return documentosOrganizados;
    }

    @Override
    public void aceitar(VisitanteSetor visitante) {
        visitante.visitar(this);
    }
}