public class AvaliacaoLimpeza implements VisitanteSetor {

    @Override
    public void visitar(Armazem armazem) {

        if (armazem.getQuantidadeEquipamentos() > 100) {
            System.out.println("Armazém: limpeza precisa ser reforçada.");
        } else {
            System.out.println("Armazém: limpeza adequada.");
        }
    }

    @Override
    public void visitar(Administrativo administrativo) {

        if (administrativo.isDocumentosOrganizados()) {
            System.out.println("Administrativo: ambiente organizado e limpo.");
        } else {
            System.out.println("Administrativo: há excesso de documentos espalhados.");
        }
    }

    @Override
    public void visitar(Frota frota) {

        if (frota.getQuantidadeVeiculos() > 20) {
            System.out.println("Frota: lavagem dos veículos deve ser intensificada.");
        } else {
            System.out.println("Frota: limpeza da frota satisfatória.");
        }
    }

    @Override
    public void visitar(Producao producao) {

        if (producao.getQuantidadeMaquinas() > 30) {
            System.out.println("Produção: acúmulo de resíduos industriais detectado.");
        } else {
            System.out.println("Produção: limpeza industrial adequada.");
        }
    }
}