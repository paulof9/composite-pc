package br.ufes.computador.builder;

import br.ufes.computador.model.Peca;
import br.ufes.computador.model.Todo;

public class ComputadorEscritorioBuilder extends ComputadorBuilder {

    @Override
    public void construirComputador() {
        computador = new Todo(120.00, "PC Escritório");
    }

    @Override
    public void construirGabinete() {
        gabinete = new Todo(220.00, "Gabinete Micro-ATX Slim");
    }

    @Override
    public void construirPlacaMae() {
        placaMae = new Todo(620.00, "Placa-mãe B660M");
    }

    @Override
    public void construirProcessador() {
        placaMae.adicionar(new Peca(690.00, "Processador Intel Core i3-12100"));
    }

    @Override
    public void construirMemoria() {
        placaMae.adicionar(new Peca(260.00, "Memória RAM 16GB DDR4"));
    }

    @Override
    public void construirArmazenamento() {
        placaMae.adicionar(new Peca(240.00, "SSD NVMe 500GB"));
    }

    @Override
    public void construirFonte() {
        gabinete.adicionar(new Peca(230.00, "Fonte 400W"));
    }

    @Override
    public void construirRefrigeracao() {
        gabinete.adicionar(new Peca(65.00, "Cooler Box"));
    }

    @Override
    public void construirMonitor() {
        computador.adicionar(new Peca(720.00, "Monitor IPS 23,8\" Full HD"));
    }

    @Override
    public void construirTeclado() {
        computador.adicionar(new Peca(85.00, "Teclado USB ABNT2"));
    }

    @Override
    public void construirMouse() {
        computador.adicionar(new Peca(55.00, "Mouse Óptico USB"));
    }
}
