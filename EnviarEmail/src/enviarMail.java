import java.io.IOException;

import com.sendgrid.*;

public class enviarMail 
{

	public static void main(String[] args) throws IOException 
	{
		
		// TODO Auto-generated method stub
		Email from = new Email("mario.duarte@esg.ipsantarem.pt");
	    String subject = "Título do Email";
	    Email to = new Email("mario.duarte@esg.ipsantarem.pt");
	    Content content = new Content("text/plain", "Este é o corpo do email.");
	    
	    Mail mail = new Mail(from, subject, to, content);

	    SendGrid sg = new SendGrid(dados.apiKEY);
	    
	    Request request = new Request();
	    try {
	      request.setMethod(Method.POST);
	      request.setEndpoint("mail/send");
	      request.setBody(mail.build());
	      Response response = sg.api(request);
	      System.out.println(response.getStatusCode());
	      System.out.println(response.getBody());
	      System.out.println(response.getHeaders());
	    } catch (IOException ex) 
	    {
	      throw ex;
	    }
	}

}
