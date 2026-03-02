package com.example.aiclient.facade;

import com.example.aiclient.dto.AiResponse;
import com.example.aiclient.dto.PromptRequest;

public interface AiFacade {
    AiResponse processPrompt(PromptRequest request);
}
