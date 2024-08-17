package SistemaComercial;

import java.util.ArrayList;
import java.util.List;


public class SistemaComercialMap {


    /**
     * Pesquisa se Existe o cliente pasado como parametro
     * @param cliente e o cliente que sera testado se existe
     * @return true se o cliente existe e false se ele nâo existe
     */
    public boolean existeCliente(Cliente cliente){
        if(this.clientes.containskey(cliente.getId)){
            return true;
        }else{
            return false;
        }
    }

    /**
     * Pequisa se tem um cliente com a Id pasada como parametro
     * @param Id e a chave para localiza o cliente
     * @return o cliente com a Id iqual a passada como parametro
     * @throws ClienteNaoExisteException se nâo tiver um cliente com a Id
     */
    public Cliente pesquisaCliente(String Id)throws ClienteNaoExisteException{
        if(this.clientes.containskey(Id)){
            Cliente cliente=this.clientes.get(Id);
            return cliente;
        }throw new ClienteNaoExisteException("não foi encontrado o cliente com a ID "+Id);

    }


    /**
     * Pesquisa no map de produtos se os Protutos com a mesma categoriase foi passada
     * @param categoria e o tipo que os protutos precisão ser para serem adicionados na colecão
     * @return uma coleção de todos os produtos com a categotia pasada como parametro
     */
    public Collection<Produto>pesquisaProdutosDaCategoria(CategoriaProduto categoria){
        List<Produto> protudosDaCategoriaEscolida=new ArrayList<>();
        for(Protuto protutoEscolido:produtos.values()){
            if(protutoEscolido.getCategoria() == categoria){
                protudosDaCategoriaEscolida.add(protutoEscolido);
            }
        }
        return protudosDaCategoriaEscolida;
    }
}
