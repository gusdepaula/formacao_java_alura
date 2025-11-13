package br.com.alura.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;

public class ConsultaChatGPT {
    public static String obterTraducao(String texto) {
        OpenAiService service = new OpenAiService("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");


        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();


        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}
