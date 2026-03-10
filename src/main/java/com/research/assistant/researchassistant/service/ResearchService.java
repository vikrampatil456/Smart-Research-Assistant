package com.research.assistant.researchassistant.service;

import com.research.assistant.researchassistant.model.ResearchRequest;
import org.springframework.stereotype.Service;

@Service
public class ResearchService {
    public String processContent(ResearchRequest request) {
        // build the prompt
        // query the AI MODEL API
        // Parse the response
        // return response
    }
    private String buildPrompt(ResearchRequest request) {
        StringBuilder prompt = new StringBuilder();
        switch (request.getOperation()) {
            case "summarize":
            prompt.append("provide a clear and concise summary of the following text in a few sentences:\n\n");
            break;
            case "suggest":
                prompt.append("Based on the following content: suggest related topics and further reading. Format thr response with clear headings and bullet points:\n\n");
                break;
            default:
                throw new IllegalArgumentException("Unknown Operation: " + request.getOperation());
        }
        prompt.append(request.getContent());
        return prompt.toString();
    }
}
