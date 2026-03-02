package com.example.aiclient.controller;

import com.example.aiclient.dto.AiResponse;
import com.example.aiclient.dto.PromptRequest;
import com.example.aiclient.facade.AiFacade;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ai")
public class AiController {

    private final AiFacade aiFacade;

    public AiController(AiFacade aiFacade) {
        this.aiFacade = aiFacade;
    }

    @PostMapping("/prompt")
    public ResponseEntity<AiResponse> processPrompt(@Valid @RequestBody PromptRequest request) {
        AiResponse response = aiFacade.processPrompt(request);
        return ResponseEntity.ok(response);
    }
}
