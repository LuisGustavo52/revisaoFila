
package revisao_fila;

import java.util.Scanner;

public class Main {

public static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- Menu Fila de Caminhoes ---");
        System.out.println("1. Inserir Caminhoneiro na fila");
        System.out.println("2. Atender Caminhoneiro");
        System.out.println("3. Mostrar Caminhoneiro no comeco da fila");
        System.out.println("4. Mostrar Caminhoneiro no fim da fila");
        System.out.println("0. Sair");
        System.out.printf("Digite a opção desejada: %n", "UTF-8");
        return scanner.nextInt();
    }

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op;   
        Fila<Caminhoneiro> filaInt = new Fila<>(10);
        
        do{
            op = mostrarMenu();
            
            switch(op) {
            case 1:
                Caminhoneiro novoCaminhoneiro = new Caminhoneiro();
                System.out.println("Insira o nome do caminhoneiro:");
                novoCaminhoneiro.setNome(scan.nextLine());
                
                System.out.println("Insira a placa do caminhoneiro:");
                novoCaminhoneiro.setPlaca(scan.nextLine());
                
                System.out.println("Insira o horario de chegada:");
                novoCaminhoneiro.setHorarioChegada(scan.nextLine());
                
                if(filaInt.enqueue(novoCaminhoneiro)){
                    System.out.println("Caminhoneiro inserido com sucesso!");
                }else{
                    System.out.println("Caminhoneiro não inserido, a fila está cheia");
                }
              break;
            case 2:
                if(!filaInt.isEmpty()){
                    System.out.println("Caminhoneiro: "+filaInt.dequeue()+" atendido.");
                }else{
                    System.out.println("A fila está vazia!");           
                }
              break;
            
            case 3:
                System.out.println("Caminhoneiro do inicio: "+filaInt.first());
              break;
              
            case 4:
                System.out.println("Caminhoneiro do fim: "+filaInt.last());
              break;
              
            default:
                System.out.println("Digite um valor válido.");
            }
            
            System.out.println("Digite qualquer tecla para continuar");
            scan.nextLine();
            
        }      
        while(op !=  0);
        scan.close();
    }
}
