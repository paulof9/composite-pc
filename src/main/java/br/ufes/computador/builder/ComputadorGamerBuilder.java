package br.ufes.computador.builder;

import br.ufes.computador.model.Peca;
import br.ufes.computador.model.Todo;

public class ComputadorGamerBuilder extends ComputadorBuilder {

    @Override
    public void construirComputador() {
        computador = new Todo(250.00, "PC Gamer");
    }

    @Override
    public void construirGabinete() {
        gabinete = new Todo(450.00, "Gabinete Gamer Mid Tower");
    }

    @Override
    public void construirPlacaMae() {
        placaMae = new Todo(1680.00, "Placa-mãe Z790 ATX DDR5");
    }

    @Override
    public void construirProcessador() {
        placaMae.adicionar(new Peca(2490.00, "Processador Intel Core i7-14700K"));
    }

    @Override
    public void construirMemoria() {
        placaMae.adicionar(new Peca(890.00, "Memória RAM 32GB DDR5"));
    }

    @Override
    public void construirArmazenamento() {
        placaMae.adicionar(new Peca(950.00, "SSD NVMe 2TB"));
    }

    @Override
    public void construirPlacaDeVideo() {
        placaMae.adicionar(new Peca(4290.00, "Placa de Vídeo GeForce RTX 4070 Super"));
    }

    @Override
    public void construirFonte() {
        gabinete.adicionar(new Peca(720.00, "Fonte Modular 850W"));
    }

    @Override
    public void construirRefrigeracao() {
        gabinete.adicionar(new Peca(460.00, "Water Cooler 240mm"));
    }

    @Override
    public void construirMonitor() {
        computador.adicionar(new Peca(1750.00, "Monitor Gamer 27\" 165Hz"));
    }

    @Override
    public void construirTeclado() {
        computador.adicionar(new Peca(380.00, "Teclado Mecânico RGB"));
    }

    @Override
    public void construirMouse() {
        computador.adicionar(new Peca(290.00, "Mouse Gamer 26000 DPI"));
    }
}
