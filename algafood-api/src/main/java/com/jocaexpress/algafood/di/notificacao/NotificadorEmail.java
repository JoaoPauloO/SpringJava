package com.jocaexpress.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.jocaexpress.algafood.di.modelo.Cliente;

// Em application.properties está indicando ao gerenciador do spring qual ambiente será executado. No caso, a classe que tiver profile prod será executada
// OBS: em linha de comando em arquivo jar -> java jar-projeto.jar -Dspring.profiles=prod

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {
	
	public NotificadorEmail() {
		System.out.println("Instanciou o REAL");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}
