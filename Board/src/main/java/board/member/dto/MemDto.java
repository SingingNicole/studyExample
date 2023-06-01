package board.member.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MemDto {
	@NotNull(message = "writer is null.")
	@NotEmpty(message = "writer is empty.")
	private String id;

	@NotNull(message = "writer is null")
	@NotEmpty(message = "writer is empty.")
	private String password;

	private String name;

	@NotNull(message = "birth is null")
	@DateTimeFormat(pattern = "yyyyMMdd")
	private Date birth;

	private String address;

}
