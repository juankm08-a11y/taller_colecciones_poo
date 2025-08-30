package com.delivery.express.modelo;

import java.lang.Override;

public class Pedido {
    private String cliente;
    private String producto;
    private double total;

    public Pedido(String cliente, String producto, double total) {
        this.cliente = cliente;
        this.producto = producto;
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public String getProducto() {
        return producto;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return cliente + " " + producto + "($" + total + ")";
    }

}
