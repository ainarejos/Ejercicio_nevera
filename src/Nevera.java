import java.util.Collection;
import java.util.HashSet;

public class Nevera {

    private Collection<String> comida = new HashSet<String>();

    public boolean put(String item){
        return comida.add(item);
    }

    public boolean contains(String item){
        return comida.contains(item);
    }

    public void take (String item) throws  NoSuchItemException{
        boolean resultado = comida.remove(item);
        if (!resultado){
            throw new NoSuchItemException(item + "\tno encontrado en la nevera");
        }
    }

}
