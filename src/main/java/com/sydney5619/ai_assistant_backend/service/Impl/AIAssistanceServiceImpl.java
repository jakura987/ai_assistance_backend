package com.sydney5619.ai_assistant_backend.service.Impl;

import com.sydney5619.ai_assistant_backend.exception.BusinessException;
import com.sydney5619.ai_assistant_backend.mapper.AIAssistantMapper;
import com.sydney5619.ai_assistant_backend.pojo.AIAssistant;
import com.sydney5619.ai_assistant_backend.service.AIAssistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AIAssistanceServiceImpl implements AIAssistanceService {
    @Autowired
    private AIAssistantMapper aIAssistantMapper;

    @Override
    public List<AIAssistant> findAllAIAssistance() {
        List<AIAssistant> assistantList = aIAssistantMapper.getAllAIAssistance();
        return assistantList;
    }

    @Override
    public AIAssistant getAIAssistantByAIName(String aiName) {
        AIAssistant aiAssistant = aIAssistantMapper.getAIAssistanceByAIName(aiName);
        return aiAssistant;
    }

    @Override
    public Integer updateAIAssistanceById(AIAssistant aiAssistant) {
        Integer count = aIAssistantMapper.updateAIAssistance(aiAssistant);
        if(aIAssistantMapper.updateAIAssistance(aiAssistant) != 0){
            return count;
        }
        throw new BusinessException("update failed : this AI does not exist");
    }

    @Override
    public Integer deleteAIAssistanceById(Long aiId) {
        Integer count = aIAssistantMapper.deleteAIAssistanceByAIId(aiId);
        if(count != 0){
            return count;
        }
        throw new BusinessException("delete failed : this AI does not exist");
    }
}
