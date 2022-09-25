package in.nareshit.raghu.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class MyMailUtil {

	@Autowired
	private JavaMailSender javaMailSender;

	public boolean send(
			String to,
			String cc[],
			String bcc[],
			String subject,
			String text,
			Resource[] files
			) 
	{
		boolean flag = false;
		try {

			/*1. Create Empty message using JavaMailSender
		   	MimeMessage (MIME - Multipurpose Internet Mail Extension)*/
			MimeMessage message = javaMailSender.createMimeMessage();

			/*2. Fill details using MimeMessageHelper class
			to, cc, bcc, subject, text..etc*/
			MimeMessageHelper helper = new MimeMessageHelper(message,( files!=null && files.length>0)? true: false);

			helper.setTo(to);
			
			if(cc!=null)
				helper.setCc(cc);
			if(bcc!=null)
				helper.setBcc(bcc);
			
			helper.setText(text);
			helper.setSubject(subject);

			/*3. Add attachments using MimeMessageHelper class
			Resource[]*/
			if(files!=null && files.length>0) {
				for(Resource file:files) {
					helper.addAttachment(file.getFilename(), file);
				}
			}

			/* 4. Send Email using JavaMailSender */
			javaMailSender.send(message);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}
}
