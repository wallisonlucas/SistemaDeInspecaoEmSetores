public class InspecaoSeguranca implements VisitanteSetor {
    @Override
    public void visitar(Armazem armazem) {

        if (armazem.isPossuiItensInflamaveis()) {
            System.out.println("Armazém: ATENÇÃO! Existem itens inflamáveis.");
        } else {
            System.out.println("Armazém: segurança adequada.");
        }
    }

    @Override
    public void visitar(Administrativo administrativo) {
        if (administrativo.getQuantidadeFuncionarios() > 50) {
            System.out.println("Administrativo: revisar plano de evacuação.");
        } else {
            System.out.println("Administrativo: setor seguro.");
        }
    }

    @Override
    public void visitar(Frota frota) {
        if (frota.isManutencaoEmDia()) {
            System.out.println("Frota: manutenção dos veículos em dia.");
        } else {
            System.out.println("Frota: veículos precisam de manutenção urgente.");
        }
    }

    @Override
    public void visitar(Producao producao) {
        if (producao.getNivelRisco() > 7) {
            System.out.println("Produção: risco elevado! Uso obrigatório de EPIs.");
        } else {
            System.out.println("Produção: nível de risco controlado.");
        }
    }
}