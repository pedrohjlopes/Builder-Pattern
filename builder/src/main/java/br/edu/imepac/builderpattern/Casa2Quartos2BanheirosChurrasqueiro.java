package br.edu.imepac.builderpattern;

public class Casa2Quartos2BanheirosChurrasqueiro implements IBuilderCasa{

    Casa casa = new Casa();

    public Casa2Quartos2BanheirosChurrasqueiro() {
        this.casa = new Casa(2, 2, true);
    }

    @Override
    public void buildQuartos() {
        System.out.println("Um quarto 2,5 x 1,90 outro 2,3 x 1,80");
    }

    @Override
    public void buildBanheiros() {
        System.out.println("Banheiro 2,3 x 1,25 outro 2,1 x 1,70");
    }

    @Override
    public void buildChurrasqueira() {
        System.out.println("Com churrasqueira");
    }

    @Override
    public Casa getCasa() {
        return casa;
    }
}
