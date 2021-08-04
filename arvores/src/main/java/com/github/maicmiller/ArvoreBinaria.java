package com.github.maicmiller;

public class ArvoreBinaria< T extends Comparable<T> >  {

    private BinNo<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    // Método responsável por chamar a exibição recursiva...
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

    /*
    * Exibição em ordem do menor para o maior a partir da Raiz...
    * */
    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem!");
        exibirInOrdem(this.raiz);
    }
    /*
    * Como essa exibição recursiva é em ordem, primeiro visitamos o elemento da esquerda, depois exibe o nó e
    * então visita o nó da direita e vai fazendo isso, a lógica é essa...
    * Enquanto o nó não estiver nulo o método recursivo continua a exibir...
    * */
    private void exibirInOrdem(BinNo<T> atualNo){
        if (atualNo != null){ // Vamos conferir se o nó atual não está nulo, se sim quer dizer que está no final da exibição...
             exibirInOrdem(atualNo.getNoEsquerdo());
            System.out.println(atualNo.getConteudo() + ", "); // Exibindo o atual...
            exibirInOrdem(atualNo.getNoDireito()); // Visitando o da direita...
        }
    }

    /*
     * Exibição em ordem do menor para o maior a partir da Raiz...
     * */
    public void exibirPosOrdem(){
        System.out.println("\n Exibindo Pós-Ordem!");
        exibirPosOrdem(this.raiz);
    }
    /*
     * Como essa exibição recursiva é em Pós-ordem, primeiro ele visita depois exibe...
     * Enquanto o nó não estiver nulo o método recursivo continua a exibir...
     * */
    private void exibirPosOrdem(BinNo<T> atualNo){
        if (atualNo != null){ // Vamos conferir se o nó atual não está nulo, se sim quer dizer que está no final da exibição...
            exibirPosOrdem(atualNo.getNoEsquerdo());
            exibirPosOrdem(atualNo.getNoDireito()); // Visitando o da direita...
            System.out.println(atualNo.getConteudo() + ", "); // Exibindo o atual...
        }
    }

    /*
     * Exibição em ordem do menor para o maior a partir da Raiz...
     * */
    public void exibirPreOrdem(){
        System.out.println("\n Exibindo Pré-Ordem!");
        exibirPreOrdem(this.raiz);
    }
    /*
     * Como essa exibição recursiva é em Pré-ordem, primeiro exibimos depois ele visita os nós...
     * Enquanto o nó não estiver nulo o método recursivo continua a exibir...
     * */
    private void exibirPreOrdem(BinNo<T> atualNo){
        if (atualNo != null){ // Vamos conferir se o nó atual não está nulo, se sim quer dizer que está no final da exibição...
            System.out.println(atualNo.getConteudo() + ", "); // Exibindo o conteúdo principal...
            exibirPreOrdem(atualNo.getNoEsquerdo());
            exibirPreOrdem(atualNo.getNoDireito()); // Visitando o da direita...
        }
    }


}
