package br.com.alura.TabelaFipe.service;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements br.com.alura.screenmatch.service.IConverteDados {
    private ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            return mapper.readValue(json, classe);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao converter JSON para objeto: " + e.getMessage(), e);
        }
    }
}
