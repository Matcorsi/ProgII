package AdicionalHerencia;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear librería
        Libreria libreria = new Libreria("Librería El Saber");

        // Crear artículos
        Articulo libro1 = new Articulo("Cien años de soledad", "Gabriel García Márquez", 12000, 400, "Realismo mágico en su máxima expresión");
        libro1.addGenero("Novela");
        libro1.addGenero("Ficción");

        Articulo libro2 = new Articulo("It", "Stephen King", 18000, 900, "Una historia de terror inolvidable");
        libro2.addGenero("Terror");
        libro2.addGenero("Suspenso");

        Articulo revista1 = new Articulo("National Geographic", "Varios", 8000, 80, "Artículos de ciencia y naturaleza");
        revista1.addGenero("Ciencia");
        revista1.addGenero("Naturaleza");

        libreria.addStock(libro1);
        libreria.addStock(libro2);
        libreria.addStock(revista1);

        // Crear clientes
        Cliente c1 = new Cliente("Ana", "Pérez", "111", "Calle 1",20);
        Cliente c2 = new Cliente("Carlos", "López", "222", "Calle 2", 15);
        ClienteExigente c3 = new ClienteExigente("Lucía", "Gómez", "333", "Calle 3", 30); // Exigente con 30% descuento
        Cliente c4 = new Cliente("Martín", "Ruiz", "444", "Calle 4", 30);
        Cliente c5 = new Cliente("Martín", "Ruiz", "444", "Calle 4", 30);

        // Configurar gustos
        c1.addAutorFavorito("Gabriel García Márquez");
        c1.addGenerosFavoritos("Novela");

        c2.addAutorFavorito("Stephen King");
        c2.addGenerosFavoritos("Terror");

        c3.addAutorFavorito("Stephen King");
        c3.addGenerosFavoritos("Suspenso");

        c4.addAutorFavorito("Varios");
        c4.addGenerosFavoritos("Ciencia");

        // Agregar clientes a la librería
        libreria.addCliente(c1);
        libreria.addCliente(c2);
        libreria.addCliente(c3);
        libreria.addCliente(c4);
        libreria.addCliente(c5);

        // Simular compras
        c1.addListaCompras(libro1);
        c2.addListaCompras(libro2);

        // 1️⃣ Precio con descuento
        System.out.println("Precio pleno de IT: " + libro2.getPrecio());
        System.out.println("Precio de 'It' para Carlos (15% desc): $" + libreria.precio(libro2, c2));

        // 2️⃣ Si un cliente ya compró un artículo
        System.out.println("¿Ana compró 'It'? " + c1.yaCompro(libro2));
        System.out.println("¿Carlos compró 'It'? " + c2.yaCompro(libro2));

        // 3️⃣ Si a un cliente le gusta un libro/revista
        System.out.println("¿A Lucía le gusta 'It'? " + c3.leGusta(libro2));
        System.out.println("¿A Martín le gusta 'National Geographic'? " + c4.leGusta(revista1));

        // 4️⃣ Listado de clientes a los que les gusta un artículo
        ArrayList<Cliente> fans = libreria.clientesQueLesGusta(libro2);
        System.out.println("\nClientes a los que les gusta 'It':");
        for (Cliente c : fans) {
            System.out.println("- " + c.getNombre() + " " + c.getApellido());
        }
    }
}
