package br.ufes.computador.builder;

import br.ufes.computador.model.Todo;

public abstract class ComputadorBuilder {

    protected Todo computador;
    protected Todo gabinete;
    protected Todo placaMae;

    public abstract void construirComputador();

    public abstract void construirGabinete();

    public abstract void construirPlacaMae();

    public abstract void construirProcessador();

    public abstract void construirMemoria();

    public abstract void construirArmazenamento();

    public void construirPlacaDeVideo() {
    }

    public void construirPlacaDeRede() {
    }

    public abstract void construirFonte();

    public abstract void construirRefrigeracao();

    public void montarGabinete() {
        gabinete.adicionar(placaMae);
        computador.adicionar(gabinete);
    }

    public abstract void construirMonitor();

    public abstract void construirTeclado();

    public abstract void construirMouse();

    public Todo getComputador() {
        return computador;
    }
}
