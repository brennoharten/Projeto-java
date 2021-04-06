package new_eDoe.models;

import java.util.ArrayList;

/**
 * Interface dos itens do sistema eDoe
 *
 * @author Brenno Harten
 */
public interface Item_eDoe {

    public boolean ehNecessario();

    public int getId();

    public int getQuantidade();

//	public int getPontuacao();
//
//	public void setPontuacao(int pontuacao);

    public String getDescricao();

//	public ArrayList<String> getTags();

}
