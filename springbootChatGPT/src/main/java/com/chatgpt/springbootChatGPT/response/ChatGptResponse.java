package com.chatgpt.springbootChatGPT.response;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

/*
* Author Amjad Khan
*/

@Data
public class ChatGptResponse implements Serializable {
	private String id;
	private String object;
	private String model;
	private LocalDate created;
	private List<Choice> choices;
}
