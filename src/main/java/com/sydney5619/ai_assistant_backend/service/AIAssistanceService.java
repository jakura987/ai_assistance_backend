package com.sydney5619.ai_assistant_backend.service;

import com.sydney5619.ai_assistant_backend.pojo.AIAssistant;

import java.util.List;

public interface AIAssistanceService {
    List<AIAssistant> findAllAIAssistance();

    AIAssistant getAIAssistantByAIName(String aiName);

    Integer updateAIAssistanceById(AIAssistant aiAssistant);

    Integer deleteAIAssistanceById(Long aiId);

}
