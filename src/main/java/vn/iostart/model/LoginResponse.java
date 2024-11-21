package vn.iostart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class LoginResponse {
	
	private String token;
	
	private long expiresIn;
}