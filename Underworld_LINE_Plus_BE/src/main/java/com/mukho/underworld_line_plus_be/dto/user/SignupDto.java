package com.mukho.underworld_line_plus_be.dto.user;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class SignupDto {

	String id;
	String password;
	String name;

}
