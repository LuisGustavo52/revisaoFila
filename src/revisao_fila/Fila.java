package revisao_fila;

public class Fila<T> {
    private int inicio;
    private int fim;
    private T[] elementos;
    
    public Fila(int tamanho){
        elementos = (T[]) new Object[tamanho];
        inicio = 0;
        fim = -1;
    }
    
    public boolean enqueue(T novoDado){
        if(!isFull()){
            fim++;
            elementos[fim] = novoDado;
            System.out.println("Elemento adicionado, index início = "+inicio+" index fim = "+fim);
            return true;
        }
        return false;
    }
    
    public T equeue(){
        if(!isFull()){
            fim++;
            elementos[fim] = novoDado;
            System.out.println("Elemento adicionado, index início = "+inicio+" index fim = "+fim);
            return true;
        }
        return elementos[inicio];
    }
    
    public boolean isEmpty(){
        return fim == inicio;
    }
    
    public boolean isFull(){
       return elementos.length-1 == fim;
    }
}
