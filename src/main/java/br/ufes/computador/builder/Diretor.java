package br.ufes.computador.builder;

import br.ufes.computador.model.Todo;

public class Diretor {

    private ComputadorBuilder builder;

    public Diretor(ComputadorBuilder builder) {
        setBuilder(builder);
    }

    public void setBuilder(ComputadorBuilder builder) {
        if (builder == null) {
            throw new IllegalArgumentException("O builder não pode ser nulo.");
        }
        this.builder = builder;
    }

    public Todo construir() {
        builder.construirComputador();
        builder.construirGabinete();
        builder.construirPlacaMae();
        builder.construirProcessador();
        builder.construirMemoria();
        builder.construirArmazenamento();
        builder.construirPlacaDeVideo();
        builder.construirPlacaDeRede();
        builder.construirFonte();
        builder.construirRefrigeracao();
        builder.montarGabinete();
        builder.construirMonitor();
        builder.construirTeclado();
        builder.construirMouse();
        return builder.getComputador();
    }
}
