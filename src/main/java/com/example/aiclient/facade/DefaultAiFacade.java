package com.example.aiclient.facade;

import com.example.aiclient.dto.AiResponse;
import com.example.aiclient.dto.PromptRequest;
import com.example.aiclient.service.LlmServiceStrategy;
import org.springframework.stereotype.Component;

@Component
public class DefaultAiFacade implements AiFacade {

    private final LlmServiceStrategy llmServiceStrategy;

    public DefaultAiFacade(LlmServiceStrategy llmServiceStrategy) {
        this.llmServiceStrategy = llmServiceStrategy;
    }

    @Override
    public AiResponse processPrompt(PromptRequest request) {
        String responseContent = llmServiceStrategy.generateResponse(request.getSystemPrompt(), request.getUserPrompt());
        return new AiResponse(responseContent);
    }
}
