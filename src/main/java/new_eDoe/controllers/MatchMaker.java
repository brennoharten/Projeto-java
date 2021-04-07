package new_eDoe.controllers;


import new_eDoe.models.Item;

import java.util.ArrayList;

/**
 * Classe responsavel por fazer os matches entre os itens
 *
 * @author Brenno Harten
 */
public class MatchMaker {

    /**
     * Método que pega os itens que tiveram a pontuação de match, com o item
     * requerido, maior que 0
     *
     * @param todosAsDoacoes Todos os itens para doação cadastrados no sistema
     * @param itemDeMatch    Item necessário requerido para match
     * @return ArrayList com todos os itens para doação que tiveram match com o item
     *         requerido
     */
    public ArrayList<Item> getItensMatchMaker(ArrayList<Item> todosAsDoacoes, Item itemDeMatch) {
        ArrayList<Item> arrayItensMatch = new ArrayList<>();
        if (selecionaItensParaMatch(todosAsDoacoes, itemDeMatch).isEmpty())
            return arrayItensMatch;
        else {
            for (Item i : selecionaItensParaMatch(todosAsDoacoes, itemDeMatch)) {
                arrayItensMatch.add(i);
            }
        }
        return arrayItensMatch;
    }

    /**
     * Método que filtra os itens de match pela sua descricao, selecionando apenas
     * os itens que contém a mesma descricao do item de match
     *
     * @param itensParaAnalise todos os itens cadastrados no sistema
     * @param itemDeMatch      Item necessário requerido para match
     * @return ArrayList com os itens que tem a mesma descricao do item de match
     */
    private ArrayList<Item> selecionaItensParaMatch(ArrayList<Item> itensParaAnalise, Item itemDeMatch) {
        ArrayList<Item> arrayItensMatch = new ArrayList<>();
        String descricaoParaMatch = itemDeMatch.getDescricao();
        for (Item i : itensParaAnalise) {
            if (i.getDescricao().equals(descricaoParaMatch) && (i.getId() != itemDeMatch.getId()))
                arrayItensMatch.add(i);
        }
        return arrayItensMatch;
    }

}
