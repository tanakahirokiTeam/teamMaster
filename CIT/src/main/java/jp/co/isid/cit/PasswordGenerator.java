package jp.co.isid.cit;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
		
	public static void main(){
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		String pass = bCryptPasswordEncoder.encode("a");
		System.out.println(pass);
	}
	
}
