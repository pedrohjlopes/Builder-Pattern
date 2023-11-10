package br.edu.imepac.builderpattern;

public interface IBuilderCasa {
    void buildQuartos();

    void buildBanheiros();

    void buildChurrasqueira();

    Casa getCasa();
}
