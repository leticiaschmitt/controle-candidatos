import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

 public class ProcessoSeletivo {
    public static void main(String[] args) {
      
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"}; 
        for(String candidato: candidatos) { 
            entrandoEmContato (candidato);
        }
     }

     static void entrandoEmContato (String candidato) {

        int tentativasRealizadas = 1; 
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {

            atendeu = atender();
            continuarTentando = ! atendeu;
            if (continuarTentando)
              tentativasRealizadas++;
              else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
      

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
          System.out.println("Conseguimos contato com " + candidato + " na " +tentativasRealizadas + " tentativa.");

          else
            System.out.println("Nao conseguimos contato com " + candidato + ", numero maximo tentativas " + tentativasRealizadas  + "realizada");
      }
        //método auxiliar

     static boolean atender() { 

        return new Random().nextInt(3)==1;

      }

     static void imprimirSelecionados() {


        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice=0; indice < candidatos.length; indice++) {
          System.out.println("0 candidato de n° " + (indice+1) + " é o " + candidatos [indice]);
        }
          System.out.println("Forma abrevida de interação for each");
        for (String candidato: candidatos ) {
          System.out.println("O candidato selecionado foi " + candidato);
        }
     }

     static void selecaoCandidatos(){

        
        //Array com a lista de candidatos
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double SalarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato +  " solicitou este valor de salário: " + salarioPretendido );
            if(SalarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados ++;
            }
            candidatoAtual ++;

        }
     }

      // Método que simula o valor pretendido

     static double valorPretendido () {

       return ThreadLocalRandom.current().nextDouble(1800 , 2200);

     }
    static void analisarCandidato (double salarioPretendido) {


      double salarioBase = 2000.0;

     if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
      }else if(salarioBase == salarioPretendido)
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
         else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
  }
 }
}