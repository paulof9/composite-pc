package br.ufes.computador.builder;

import br.ufes.computador.model.Peca;
import br.ufes.computador.model.Todo;

public class ComputadorServidorWebBuilder extends ComputadorBuilder {

    @Override
    public void construirComputador() {
        computador = new Todo(350.00, "PC Servidor Web");
    }

    @Override
    public void construirGabinete() {
        gabinete = new Todo(1150.00, "Gabinete Rack 4U");
    }

    @Override
    public void construirPlacaMae() {
        placaMae = new Todo(2400.00, "Placa-mãe Servidor C621");
    }

    @Override
    public void construirProcessador() {
        placaMae.adicionar(new Peca(3600.00, "Processador Intel Xeon Silver 4310"));
    }

    @Override
    public void construirMemoria() {
        placaMae.adicionar(new Peca(1980.00, "Memória RAM 64GB DDR4 ECC"));
    }

    @Override
    public void construirArmazenamento() {
        placaMae.adicionar(new Peca(1420.00, "SSD Enterprise 1.92TB (Unidade 1)"));
        placaMae.adicionar(new Peca(1420.00, "SSD Enterprise 1.92TB (Unidade 2)"));
    }

    @Override
    public void construirPlacaDeRede() {
        placaMae.adicionar(new Peca(890.00, "Placa de Rede Dual Port 10GbE"));
    }

    @Override
    public void construirFonte() {
        gabinete.adicionar(new Peca(1450.00, "Fonte Redundante 750W"));
    }

    @Override
    public void construirRefrigeracao() {
        gabinete.adicionar(new Peca(320.00, "Cooler Servidor Alto Fluxo"));
    }

    @Override
    public void construirMonitor() {
        computador.adicionar(new Peca(460.00, "Monitor LED 19,5\""));
    }

    @Override
    public void construirTeclado() {
        computador.adicionar(new Peca(70.00, "Teclado Compacto USB"));
    }

    @Override
    public void construirMouse() {
        computador.adicionar(new Peca(40.00, "Mouse Óptico Básico USB"));
    }
}
