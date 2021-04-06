package new_eDoe;

import new_eDoe.controllers.CrudUsuario;
import new_eDoe.controllers.GestorItem;
import new_eDoe.utils.Ferramentas;

import java.io.IOException;

/**
 *
 * @author Brenno harten
 */
public class Facade {

    private static CrudUsuario cd = new CrudUsuario();
    private static GestorItem gi = new GestorItem();

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Usuario ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /**
     * Método responsável por ler receptores
     *
     * @param caminho Caminho que indica a localização do arquivo dos receptores
     * @throws IOException Excessão lançada caso haja falha na leitura
     */
    public static void lerReceptores(String caminho) throws IOException {
        cd.lerReceptores(caminho);
    }


    /**
     * Método responsável por adicionar o doador no sistema
     *
     * @param id      Documento de identificação do usuario
     * @param nome    Nome do usuario
     * @param email   Email do usuario
     * @param celular Celular do usuario
     * @param classe  Classe do usuario
     * @param status  Status do usuario
     * @return Retorna o documento de identificação (ID) do usuário adicionado
     */
    public static String adicionaUsuario(String id, String nome, String email, String celular, String classe, String status) {
        return cd.adicionarUsuario(id, nome, email, celular, classe, status);
    }

    /**
     * Método que pesquisa e identifica o usuário que contém seu documento de
     * identificação (ID) requerido
     *
     * @param id Documento de identificação do usuário
     * @return String com o usuário correspondente ao ID
     */
    public static String pesquisaUsuarioPorId(String id) {
        return cd.pesquisaUsuarioPorId(id);
    }

    /**
     * Método que pesquisa e identifica usuários que contem o nome requerido
     *
     * @param nome Nome do usuário
     * @return String com a sequência de usuários que possuem o nome pesquisado
     */
    public static String pesquisaUsuarioPorNome(String nome) {
        return cd.pesquisaUsuarioPorNome(nome);
    }

    /**
     * Método responsável por atualizar informações do usuário
     *
     * @param id      Documento de identificação do usuário
     * @param nome    Nome do doador
     * @param email   Email do doador
     * @param celular Celular do doador
     * @return String do usuário com as informações atualizadas
     */
    public static String atualizaUsuario(String id, String nome, String email, String celular, String status) {
        return cd.atualizaUsuario(id, nome, email, celular, status);
    }

    /**
     * Método que remove um usuário do sistema
     *
     * @param id Documento de identificação (ID) do usuário
     */
    public static void removeUsuario(String id) {
        cd.removeUsuario(id);
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Item ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /**
     * Método que adiciona um descritor de item no sistema
     *
     * @param descritor Descritor geral dos itens
     */
    public static void adicionaDescritor(String descritor) {
        cd.adicionarDescritor(descritor);
    }

    /**
     * Método que adiciona um item para doação, fornecendo um ID único para o item
     * adicionado
     *
     * @param idDoador   Documento de identificação do doador
     * @param descricao  Descricao do item
     * @param quantidade Quantidade de itens adicionados
     * @return int com o código de identificação (ID) do item doado
     */
    public static int adicionaItemParaDoacao(String idDoador, String descricao, int quantidade) {
        return cd.adicionaItemParaDoacao(idDoador, descricao, quantidade, Ferramentas.idUnico += 1);
    }

    /**
     * Método que exibe um item especifico
     *
     * @param idItem   Código de identificação (ID) do item
     * @param idDoador Documento de identificação do doador
     * @return String com o item correspondente aos parametros passados
     */
    public static String exibeItem(int idItem, String idDoador) {
        return cd.exibeItem(idItem, idDoador);
    }

    /**
     * Método responsável por atualizar informações de um item para doacao
     * específico
     *
     * @param idItem         Código de identificação (ID) do item
     * @param idDoador       Documento de identificação do doador
     * @param novaQuantidade Nova quantidade de itens
     * @return String do item com as informações atualizadas
     */
    public static String atualizaItemParaDoacao(int idItem, String idDoador, int novaQuantidade) {
        return cd.atualizaItemParaDoacao(idItem, idDoador, novaQuantidade);
    }

    /**
     * Método que remove um item doado do sistema
     *
     * @param idItem   Código de identificação (ID) do item
     * @param idDoador Documento de identificação do doador
     */
    public static void removeItemParaDoacao(int idItem, String idDoador) {
        cd.removeItemParaDoacao(idItem, idDoador);
    }

    /**
     * Método que lista todos os descritores dos itens para doação cadastrados no
     * sistema
     *
     * @return String com todos os descritores dos itens para doação cadastrados no
     *         sistema, em ordem alfabética
     */
    public static String listaDescritorDeItensParaDoacao() {
        return cd.listaDescritorDeItensParaDoacao();
    }

    /**
     * Método que lista todos os itens para doação cadastrados no sistema
     *
     * @return String com todos os itens para doação cadastrados no sistema,
     *         ordenado pela quantidade
     */
    public static String listaItensParaDoacao() {
        return cd.listaItensParaDoacao();
    }

    /**
     * Método que permite listar todos os itens relacionados a uma dada descrição
     *
     * @param descricao Descrição requerida dos itens
     * @return String com todos os itens que contém a descrição requerida, em ordem
     *         alabética da descrição
     */
    public static String pesquisaItemParaDoacaoPorDescricao(String descricao) {
        return cd.pesquisaItemParaDoacaoPorDescricao(descricao);
    }

    /**
     * Método que adiciona um item necessário, fornecendo um ID único para o item
     * adicionado
     *
     * @param idReceptor Documento de identificação do receptor
     * @param descricao  Descricao do item
     * @param quantidade Quantidade de itens adicionados
     * @return int com o código de identificação (ID) do item necessário
     */
    public static int adicionaItemNecessario(String idReceptor, String descricao, int quantidade) {
        return cd.adicionaItemNecessario(idReceptor, descricao, quantidade, Ferramentas.idUnico += 1);
    }

    /**
     * Método responsável por atualizar informações de um item necessário específico
     *
     * @param idItem         Código de identificação (ID) do item
     * @param idReceptor     Documento de identificação do receptor
     * @param novaQuantidade Nova quantidade de itens
     * @return String do item com as informações atualizadas
     */
    public static String atualizaItemNecessario(String idReceptor, int idItem, int novaQuantidade) {
        return cd.atualizaItemNecessario(idReceptor, idItem, novaQuantidade);
    }

    /**
     * Método que lista todos os itens necessários cadastrados no sistema
     *
     * @return String com todos os itens para doação cadastrados no sistema,
     *         ordenados pelo código de identificação (ID) dos itens
     */
    public static String listaItensNecessarios() {
        return cd.listaItensNecessarios();
    }

    /**
     * Método que remove um item necessário do sistema
     *
     * @param idItem     Código de identificação (ID) do item
     * @param idReceptor Documento de identificação do receptor
     */
    public static void removeItemNecessario(String idReceptor, int idItem) {
        cd.removeItemNecessario(idReceptor, idItem);
    }

    /**
     * Método responsável por encontrar casamentos (matches) entre itens a serem
     * doados e itens necessários.
     *
     * @param idReceptor       Documento de identificação do receptor
     * @param idItemNecessario Código de identificação (ID) do item necessário
     * @return String com todos os itens a serem doados que pontuaram nesse processo
     *         (zero ou mais itens podem ser retornados), ordenados da maior para a
     *         menor pontuação. Se as pontuações forem iguais ordenar-se pelo código
     *         de identificação (ID) dos itens
     */
    public static String match(String idReceptor, int idItemNecessario) {
        return cd.match(idReceptor, idItemNecessario);
    }

    /**
     *
     * Método que valida o pedido de doação, e realiza a doação no sistema.
     *
     * @param idItemNecessario Código de identificação (ID) do item necessário
     * @param idItemDoado      Código de identificação (ID) do item doado
     * @param data             Data de ocorrência da doação
     * @return String representando a realização da doação, contendo as informações
     *         do doador, do receptor, do item doado e a data de ocorrência da
     *         transação
     */
    public static String realizaDoacao(int idItemNecessario, int idItemDoado, String data) {
        return cd.realizaDoacao(idItemNecessario, idItemDoado, data);
    }

    /**
     * Método que lista todas as doações feitas no sitema
     *
     * @return String com todas as doações já feitas no sistema, ordenadas da doação
     *         da mais antiga para a mais nova. Caso as datas sejam iguais
     *         ordenar-se pela ordem alfabética das descrições dos itens doados.
     */
    public static String listaDoacoes() {
        return cd.listaDoacoes();
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Main

    public static void main(String[] args) throws IOException {
        //lendo receptores
        lerReceptores("arquivos_sistema/novosReceptores.csv");
//        System.out.println(pesquisaUsuarioPorId(""));

        //adicionando usuarios
        adicionaUsuario("123", "brenno", "brennoharte@asg", "12414", "PESSOA_FISICA", "doador");
        System.out.println(pesquisaUsuarioPorId("123"));
//
//
//        //atualizando email e telefone
//		atualizaUsuario("123", "brenno", "brennoharten@gmail.com", "8599999-9999", "doador");
//        System.out.println(pesquisaUsuarioPorNome("brenno"));
//
//        System.out.println(pesquisaUsuarioPorId("88770280096"));
//        //removendo um usuario
//		removeUsuario("84473712044");
////        System.out.println(pesquisaUsuarioPorId("84473712044"));
//
//        //adicionando descritores
//		adicionaDescritor("Cobertor");
//        adicionaDescritor("Roupas");
//        adicionaDescritor("Alimentos");
//        adicionaDescritor("Colchões");
//
//        //listando todos os descritores
//        System.out.println(listaDescritorDeItensParaDoacao());
//
//        //adicionando itens para doação
//		adicionaItemParaDoacao("123", "Cobertor", 20);
//        adicionaItemParaDoacao("123", "alimentos", 40);
//        System.out.println(adicionaItemParaDoacao("123", "Agua", 20));
//
//        //listando todos os descritores
//        System.out.println(listaDescritorDeItensParaDoacao());
//
//        //exibindo o segundo item adicionado
//        System.out.println(exibeItem(10000003, "123"));
//
//        //atualizando a quantidade de um item para doação
//        System.out.println(atualizaItemParaDoacao(10000003, "123", 30));
//
//
//        //removendo um item que estava para doação
//    	removeItemParaDoacao(10000003, "123");
//        //System.out.println(exibeItem(10000002, "123"));
//
//        //listando apenas o itens que estao para doação
//        System.out.println(listaItensParaDoacao());
//
//        //pesquisa se existe um item para doacao
//        System.out.println(pesquisaItemParaDoacaoPorDescricao("Cobertor"));
//
//        //adiciona um item necessario
//        System.out.println(adicionaItemNecessario("88770280096", "alimentos", 20));
//        adicionaItemNecessario("88770280096", "brinquedos", 20);
//
//        //atualiza a quantidade de um item necessario
//        atualizaItemNecessario("88770280096", 10000004, 30);
//
//        //lista todos os itens necessarios
//        System.out.println(listaItensNecessarios());
//
//        //remove um item necessario
//		removeItemNecessario("88770280096", 10000005);
//
//        //encontra um idem para doação que bata com a descrição
//        System.out.println(match("88770280096", 10000004));
//
//        //realiza a doação e atualiza os valores
//        realizaDoacao(10000004, 10000002, "06/04");
//
//        //lista as doações realizadas por ordem de data
//        System.out.println(listaDoacoes());
//
//
//        //listando apenas o itens que estao para doação
//        System.out.println(listaItensParaDoacao());
    }

}

