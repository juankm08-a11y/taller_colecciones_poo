package com.delivery.express.colecciones;

import java.util.*;
import java.util.function.Predicate;

public class Utilidades {

    public static <T> List<T> filtrar(List<T> lista, Predicate<T> condicion) {
        List<T> resultado = new ArrayList<>();
        for (T elemento : lista) {
            if (condicion.test(elemento)) {
                resultado.add(elemento);
            }
        }
        return resultado;
    }
}
