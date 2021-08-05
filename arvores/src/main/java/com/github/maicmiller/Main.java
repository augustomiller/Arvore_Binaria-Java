package com.github.maicmiller;

import com.github.maicmiller.model.Obj;

public class Main {
    public static void main(String[] args) {

        ArvoreBinaria<Obj> arvoreBinaria = new ArvoreBinaria<>();

        // Inserção de árvore de exemplo;
        arvoreBinaria.inserir(new Obj(13));
        arvoreBinaria.inserir(new Obj(10));
        arvoreBinaria.inserir(new Obj(25));
        arvoreBinaria.inserir(new Obj(2));
        arvoreBinaria.inserir(new Obj(12));
        arvoreBinaria.inserir(new Obj(20));
        arvoreBinaria.inserir(new Obj(31));
        arvoreBinaria.inserir(new Obj(29));
        arvoreBinaria.inserir(new Obj(32));

        arvoreBinaria.exibirInOrdem();
        arvoreBinaria.exibirPreOrdem();
        arvoreBinaria.exibirPosOrdem();
    }
}
