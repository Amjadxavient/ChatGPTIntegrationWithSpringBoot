package com.chatgpt.springbootChatGPT.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chatgpt.springbootChatGPT.request.BotRequest;
import com.chatgpt.springbootChatGPT.response.ChatGptResponse;
import com.chatgpt.springbootChatGPT.service.BotService;

import lombok.RequiredArgsConstructor;

/*
* Author Amjad Khan
*/

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/api/v1/bot")
public class BotController {
	private final BotService botService;

	@PostMapping("/send")
	public ResponseEntity<ChatGptResponse> sendMessage(@RequestBody BotRequest botRequest) {
		ChatGptResponse resp = botService.askQuestion(botRequest);
		return new ResponseEntity<ChatGptResponse>(resp, HttpStatus.OK);
	}
}
