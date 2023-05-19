package com.chatgpt.springbootChatGPT.service;

import com.chatgpt.springbootChatGPT.request.BotRequest;
import com.chatgpt.springbootChatGPT.response.ChatGptResponse;

/*
* Author Amjad Khan
*/

public interface BotService {

	ChatGptResponse askQuestion(BotRequest botRequest);
}
