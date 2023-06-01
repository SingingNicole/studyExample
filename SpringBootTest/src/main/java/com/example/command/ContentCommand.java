package com.example.command;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ContentCommand {

	private int id;	// autoincrement 가능

	@NotEmpty(message = "writer is empty.")
	@Size(min = 3, max = 10, message = "writer min 3 max 10.")
	private String writer;

	@NotBlank(message = "content is empty or blank.")
	private String content;

}
