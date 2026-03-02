package com.example.aiclient.dto;

import jakarta.validation.constraints.NotBlank;

public class PromptRequest {

    @NotBlank(message = "System prompt cannot be blank")
    private String systemPrompt;

    @NotBlank(message = "User prompt cannot be blank")
    private String userPrompt;

    public PromptRequest() {
    }

    public PromptRequest(String systemPrompt, String userPrompt) {
        this.systemPrompt = systemPrompt;
        this.userPrompt = userPrompt;
    }

    public String getSystemPrompt() {
        return systemPrompt;
    }

    public void setSystemPrompt(String systemPrompt) {
        this.systemPrompt = systemPrompt;
    }

    public String getUserPrompt() {
        return userPrompt;
    }

    public void setUserPrompt(String userPrompt) {
        this.userPrompt = userPrompt;
    }
}
