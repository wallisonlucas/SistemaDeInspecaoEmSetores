import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Setor> setores = new ArrayList<>();

        setores.add(new Armazem(120, true));
        setores.add(new Administrativo(60, false));
        setores.add(new Frota(25, false));
        setores.add(new Producao(9, 40));

        VisitanteSetor seguranca = new InspecaoSeguranca();
        VisitanteSetor limpeza = new AvaliacaoLimpeza();

        System.out.println("=============== INSPEÇÃO DE SEGURANÇA ===============");
        for (Setor setor : setores) {
            setor.aceitar(seguranca);
        }
        System.out.println("=====================================================");
        System.out.println("\n=============== AVALIAÇÃO DE LIMPEZA ================");
        for (Setor setor : setores) {
            setor.aceitar(limpeza);
        }
        System.out.println("=====================================================");
    }
}