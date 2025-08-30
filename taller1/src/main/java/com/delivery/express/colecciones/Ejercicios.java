package com.delivery.express.colecciones;

import java.util.*;

import com.delivery.express.modelo.Pedido;

public class Ejercicios {
    public static void Pedidos() {

        System.out.println("Delivery Express Pedidos");
        List<Pedido> pedidos = new ArrayList<>();

        pedidos.add(new Pedido("Juan", "Sandwich", 30));
        pedidos.add(new Pedido("Francisco", "Costila BBQ", 32));
        pedidos.add(new Pedido("Javier", "Perro Caliente", 48));
        pedidos.add(new Pedido("Fernanda", "Ensalada", 50));
        pedidos.add(new Pedido("Daniela", "Alitas de Pollo", 37));

        System.out.println("----Pedidos iniciales----");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }

        pedidos.add(0, new Pedido("María", "Pollo Asado", 30));
        pedidos.add(0, new Pedido("Alejandra", "Bandeja Paisa", 15));

        System.out.println("\n----Pedidos con urgentes al inicio ----");
        for (int i = 0; i < pedidos.size(); i++) {
            Pedido pedido = pedidos.get(i);
            if (i < 2) {
                System.out.println(pedido + " -> Pedido urgente");
            } else {
                System.out.println(pedido + "-> Pedido normal");
            }
        }

        Set<Pedido> pedidoSet = new HashSet<>();
        pedidoSet.add(new Pedido("Roberto", "Arroz chino", 36));
        pedidoSet.add(new Pedido("Fernando", "Encocado", 25));
        pedidoSet.add(new Pedido("Bryan", "Hamburguesa", 28));
        pedidoSet.add(new Pedido("Fernando", "Pollo Asado", 30));

        String salida = pedidoSet.stream()
                .map(p -> p.toString())
                .reduce("", (a, b) -> a + "\n" + b);
        System.out.println("---Lista de Pedidos----" + salida);

        Map<String, List<Pedido>> pedidosClientes = new HashMap<>();
        pedidosClientes.put("Juan", Arrays.asList(
                new Pedido("Juan", "Sushi", 27),
                new Pedido("Juan", "Pizza", 30)));

        pedidosClientes.put("Ana", Arrays.asList(
                new Pedido("Ana", "Arepa", 45),
                new Pedido("Ana", "Hamburguesa", 29)));

        pedidosClientes.put("Francisco", Arrays.asList(
                new Pedido("Francisco", "Ensalada", 20),
                new Pedido("Francisco", "Helado", 19)));

        System.out.println("\nPedidos de Ana:");
        pedidosClientes.get("Ana").forEach(p -> System.out.println(" * " + p));

        for (String cliente : pedidosClientes.keySet()) {
            double total = pedidosClientes.get(cliente)
                    .stream()
                    .mapToDouble(Pedido::getTotal)
                    .sum();
            System.out.println(cliente + " " + "gasto en total: " + "  " + total);
        }
    }

}