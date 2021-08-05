package com.github.maicmiller.model;

public abstract class ObjArvore<T> implements Comparable<T> {

    /*
    * Especificando os Métodos(abstratos) que os objetos a ser utilizado na árvore tenha...
    * */
    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int compareTo(T outro);
    public abstract String toString();

}
