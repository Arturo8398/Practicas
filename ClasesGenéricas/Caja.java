package ClasesGenéricas;

public class Caja<t>{
    private T articulo;

    public Caja (){
        this.articulo = null;
    }

    public T getArticulo(){
        return articulo;
    }

    public void setArticulo(T articulo){
        this.articulo = articulo;
    }

}
