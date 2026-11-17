package br.ufes.computador;

import br.ufes.computador.model.Peca;
import br.ufes.computador.model.Todo;

/**
 * @author Clayton
 */
public class Principal {

    public static void main(String[] args) {
        Todo pcEscritorio = new Todo(120.00, "PC Escritório");
        Todo gabineteEscritorio = new Todo(220.00, "Gabinete Micro-ATX Slim");
        Todo placaMaeEscritorio = new Todo(620.00, "Placa-mãe B660M");

        placaMaeEscritorio.adicionar(new Peca(690.00, "Processador Intel Core i3-12100"));
        placaMaeEscritorio.adicionar(new Peca(260.00, "Memória RAM 16GB DDR4"));
        placaMaeEscritorio.adicionar(new Peca(240.00, "SSD NVMe 500GB"));

        gabineteEscritorio.adicionar(new Peca(230.00, "Fonte 400W"));
        gabineteEscritorio.adicionar(new Peca(65.00, "Cooler Box"));
        gabineteEscritorio.adicionar(placaMaeEscritorio);

        pcEscritorio.adicionar(gabineteEscritorio);
        pcEscritorio.adicionar(new Peca(720.00, "Monitor IPS 23,8\" Full HD"));
        pcEscritorio.adicionar(new Peca(85.00, "Teclado USB ABNT2"));
        pcEscritorio.adicionar(new Peca(55.00, "Mouse Óptico USB"));

        System.out.println("Descrição: " + pcEscritorio.getDescricao());
        System.out.println("Preço total: " + String.format("%.2f", pcEscritorio.getPreco()));
        System.out.println();

        Todo pcGamer = new Todo(250.00, "PC Gamer");
        Todo gabineteGamer = new Todo(450.00, "Gabinete Gamer Mid Tower");
        Todo placaMaeGamer = new Todo(1680.00, "Placa-mãe Z790 ATX DDR5");

        placaMaeGamer.adicionar(new Peca(2490.00, "Processador Intel Core i7-14700K"));
        placaMaeGamer.adicionar(new Peca(890.00, "Memória RAM 32GB DDR5"));
        placaMaeGamer.adicionar(new Peca(950.00, "SSD NVMe 2TB"));
        placaMaeGamer.adicionar(new Peca(4290.00, "Placa de Vídeo GeForce RTX 4070 Super"));

        gabineteGamer.adicionar(new Peca(720.00, "Fonte Modular 850W"));
        gabineteGamer.adicionar(new Peca(460.00, "Water Cooler 240mm"));
        gabineteGamer.adicionar(placaMaeGamer);

        pcGamer.adicionar(gabineteGamer);
        pcGamer.adicionar(new Peca(1750.00, "Monitor Gamer 27\" 165Hz"));
        pcGamer.adicionar(new Peca(380.00, "Teclado Mecânico RGB"));
        pcGamer.adicionar(new Peca(290.00, "Mouse Gamer 26000 DPI"));

        System.out.println("Descrição: " + pcGamer.getDescricao());
        System.out.println("Preço total: " + String.format("%.2f", pcGamer.getPreco()));
        System.out.println();

        Todo pcServidorWeb = new Todo(350.00, "PC Servidor Web");
        Todo gabineteServidor = new Todo(1150.00, "Gabinete Rack 4U");
        Todo placaMaeServidor = new Todo(2400.00, "Placa-mãe Servidor C621");

        placaMaeServidor.adicionar(new Peca(3600.00, "Processador Intel Xeon Silver 4310"));
        placaMaeServidor.adicionar(new Peca(1980.00, "Memória RAM 64GB DDR4 ECC"));
        placaMaeServidor.adicionar(new Peca(1420.00, "SSD Enterprise 1.92TB (Unidade 1)"));
        placaMaeServidor.adicionar(new Peca(1420.00, "SSD Enterprise 1.92TB (Unidade 2)"));
        placaMaeServidor.adicionar(new Peca(890.00, "Placa de Rede Dual Port 10GbE"));

        gabineteServidor.adicionar(new Peca(1450.00, "Fonte Redundante 750W"));
        gabineteServidor.adicionar(new Peca(320.00, "Cooler Servidor Alto Fluxo"));
        gabineteServidor.adicionar(placaMaeServidor);

        pcServidorWeb.adicionar(gabineteServidor);
        pcServidorWeb.adicionar(new Peca(460.00, "Monitor LED 19,5\""));
        pcServidorWeb.adicionar(new Peca(70.00, "Teclado Compacto USB"));
        pcServidorWeb.adicionar(new Peca(40.00, "Mouse Óptico Básico USB"));

        System.out.println("Descrição: " + pcServidorWeb.getDescricao());
        System.out.println("Preço total: " + String.format("%.2f", pcServidorWeb.getPreco()));
    }
}
