package com.chatgpt.springbootChatGPT.request;

import lombok.Data;

import java.io.Serializable;

/*
* Author Amjad Khan
*/

@Data
public class BotRequest implements Serializable {
	private String message;
}
