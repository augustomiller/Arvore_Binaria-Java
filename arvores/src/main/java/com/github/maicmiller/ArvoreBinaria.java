package com.github.maicmiller;

public class ArvoreBinaria< T extends Comparable<T> >  {

    private BinNo<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo); // Criando um novo nó do tipo conteúdo.
        raiz = inserir(raiz, novoNo);
    }

    /*
    * Método de inserir, que trabalha de forma recursiva, ele chamará ele mesmo até chegar na posição
    * que ele irá inserir o novo elemento.
    * */
    private BinNo<T> inserir(BinNo<T> atualNo, BinNo<T> novoNo){
        if (atualNo == null){ // Se o atual for nulo, quer dizer que estou na raiz e irei retornar esse novo nó e inseri-lo na raiz...
            return novoNo; // Que é o novo nó que está sendo inserido...
        }else if(novoNo.getConteudo().compareTo(atualNo.getConteudo()) < 0){ // Vamos comparar se o conteúdo do novo nó é menor que o conteúdo do nó atual. Se for menor retorna -1, se for igual retorna 0 e se for maior retorna 1.
            atualNo.setNoEsquerdo(inserir(atualNo.getNoEsquerdo(), novoNo));
        }else{  // se o conteúdo do novo nó for maior ou igual ao nó atual, vamos percorrer para a direita...
            atualNo.setNoDireito(inserir(atualNo.getNoDireito(), novoNo));
        }
        return atualNo; // Depois de percorrer todos esses loops vamos retornar o nó atual...
    }
}
