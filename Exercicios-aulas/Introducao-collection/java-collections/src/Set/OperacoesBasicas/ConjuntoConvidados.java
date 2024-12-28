package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    // Atributos
    private Set<Convidado> convidadoSet;

    // Metodo construtor da classe
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    // Metodo para adicionar convidados ao conjunto
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    // Metodo para remover um convidado do conjunto com base no código do convite
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoARemover = null;
        for(Convidado c: convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoARemover = c;
                break;
            }
        } convidadoSet.remove(convidadoARemover);
    }

    // Metodo para contar o numero de convidados
    public int contarConvidados(){
            return convidadoSet.size();

    }

    // Metodo para exibir os convidados do conjunto
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    // Testar o funcionamento da classe
    public static void main(String[] args) {
        ConjuntoConvidados convidadoSet = new ConjuntoConvidados();
        convidadoSet.adicionarConvidado("Douglas", 10);
        convidadoSet.adicionarConvidado("Lucas", 11);
        convidadoSet.adicionarConvidado("Marcos", 12);
        convidadoSet.adicionarConvidado("Bruno", 12);
        System.out.println(convidadoSet.contarConvidados());
        convidadoSet.exibirConvidados();
        convidadoSet.removerConvidadoPorCodigoConvite(10);
        convidadoSet.exibirConvidados();
    }

}
