package Interface;

import java.util.logging.Logger;

public interface Persistivel {

    public long getId();

    public Persistivel cadastrar(Persistivel p);

    public Persistivel consultar(long id);

    public Persistivel alterar(Persistivel p);

    public boolean excluir(long identificador);
}
