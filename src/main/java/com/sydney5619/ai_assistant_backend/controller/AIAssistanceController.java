package com.sydney5619.ai_assistant_backend.controller;

import com.sydney5619.ai_assistant_backend.common.Result;
import com.sydney5619.ai_assistant_backend.pojo.AIAssistant;
import com.sydney5619.ai_assistant_backend.service.AIAssistanceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/admin/ai")
@Api(tags = "ai Interface")
public class AIAssistanceController {
    @Autowired
    private AIAssistanceService aiAssistanceService;

    @ApiOperation("getAllAIAssistance")
    @GetMapping("/getAllAIAssistance")
    public Result<List<AIAssistant>> getAllAIAssistance(){
        List<AIAssistant> list = aiAssistanceService.findAllAIAssistance();
        return Result.success(list);
    }

    @ApiOperation("getAIAssistanceByAIName")
    @GetMapping("/getAIAssistance")
    public Result<AIAssistant> getAIAssistanceByAIName(@RequestParam String aiName) {
        AIAssistant aiAssistantByAIName = aiAssistanceService.getAIAssistantByAIName(aiName);
        return Result.success(aiAssistantByAIName);
    }

    @ApiOperation("updateAIAssistance")
    @PutMapping("/updateAIAssistance")
    public Result<String> updateAIAssistance(@RequestBody AIAssistant aiAssistant){
        aiAssistanceService.updateAIAssistanceById(aiAssistant);
        return Result.success("update successfully");

    }

    @ApiOperation("deleteAIAssistanceById")
    @DeleteMapping("/deleteAIAssistance/{aiId}")
    public Result<String> deleteAIAssistanceByAIId(@PathVariable Long aiId){
        aiAssistanceService.deleteAIAssistanceById(aiId);
        return Result.success("delete successfully");
    }


}
