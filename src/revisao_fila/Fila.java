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
    
    public T dequeue(){
        return elementos[inicio++];
    }
    
    public boolean isEmpty(){
        return fim == inicio;
    }
    
    public boolean isFull(){
       return elementos.length-1 == fim;
    }
    
    public T first(){
        return elementos[inicio];
    }
    
    public T last(){
        return elementos[fim];
    }
    
    @Override
    public String toString(){
        StringBuilder retorno = new StringBuilder();
        for(int i=inicio;i>=fim;i++){
            retorno.append(elementos[i] + " - ");
        }
        
        return retorno.toString();
    }
}
