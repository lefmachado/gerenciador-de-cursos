package org.estudos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    private static final Logger logger = LoggerFactory.getLogger(TestaPerformance.class);

    public static void main(String[] args) {

        Collection<Integer> numeros = new HashSet<>();

        long inicio = System.currentTimeMillis();

        // Adiciona 50.000 números ao conjunto
        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        // Verifica se cada um dos 50.000 números está contido no conjunto
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        // Saída final usando o logger
        logger.info("Tempo gasto na operação: {} ms", tempoDeExecucao);
    }
}