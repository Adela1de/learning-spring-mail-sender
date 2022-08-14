package luiz.augusto.springemailclient;

import luiz.augusto.springemailclient.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailClientApplication {

	@Autowired
	private EmailSenderService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailClientApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail()
	{
		service.sendSimpleEmail("ohomemmaisfortedomundo@gmail.com",
				"testetestetestetestetestetestetestetestetestetestetestetestetestetestetestetestetestetest",
				"Teste enviar e-mails com spring boot");
	}

}
