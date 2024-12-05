package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        analisarCandidato(2500);

    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato!");
        } else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }

    }

}
