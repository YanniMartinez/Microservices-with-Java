package com.yannbytes.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//Se manda el nombre del componente creado en el auditAware
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl" ) //Permite habilitar la auditoria de EntityListeners
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
