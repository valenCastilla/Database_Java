//package TP_FINAL_ALGORITMO;

public class Dato 
{
   public Object valor;    


//Constructor   
public Dato()
{
    this.valor = new Object();
}

public Object getDato()
{
    return this.valor;
}

public boolean isNA ()
{
    return false;
}

public void setValor (Object x)
{
    this.valor = x;
}

public String getTipoDato ()
{
   return "Object" ;
}

public String printValor()
{
    return this.valor.toString();
}

}
