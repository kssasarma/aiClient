package com.example.aiclient.service;

public interface LlmServiceStrategy {
    String generateResponse(String systemPrompt, String userPrompt);
}
