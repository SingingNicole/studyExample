package com.example.command;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class NewArticleCommand {

	private int[] id;
	private String title;
	private String content;

}
