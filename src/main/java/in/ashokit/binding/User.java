package in.ashokit.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class User
{
	@NotEmpty(message="Please enter UserName")
	private String uname;
	
	@NotEmpty(message="Please Enter Password")
	private String pwd;
	
	@NotEmpty(message="Please Enter your Email")
	@Email(message="Please Emter Valid Email Address")
	private String email;
	
	@NotNull(message="Please Enter Phone Number")
	private Long phno;

}
