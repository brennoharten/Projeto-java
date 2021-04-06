package new_eDoe.comparators;

import java.util.Comparator;
import new_eDoe.models.Item_eDoe;

/**
 * Classe responsável por comparar dois itens do sistema eDoe pela sua descrição
 *
 * @author Brenno Harten
 */
public class DescricaoComparator implements Comparator<Item_eDoe> {

    /**
     * Método que compara dois itens do sistema eDoe pela descrição, comparando-os
     * por ordem alfabetica
     */
    @Override
    public int compare(Item_eDoe o1, Item_eDoe o2) {
        return o1.getDescricao().compareTo(o2.getDescricao());
    }

}
