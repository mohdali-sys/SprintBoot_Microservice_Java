package com.springioc.example.spring_ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.springioc.AppConf;
import com.springioc.beans.Airtel;
import com.springioc.beans.ClientRepository;
import com.springioc.beans.Sim;

@Component
public class Mobile {

	@Autowired
	Environment env;

	//1.First check if same type multiple obj found then check byname if name match then inject else exception
	// 2. By default required=true
	@Autowired
	Sim airtel;

	@Autowired
	ClientRepository clientRepository;
	public static void main(String[] args) {
		
		// AnnotationConfigApplicationContext ioc = new
	//	 AnnotationConfigApplicationContext(AppConf.class); // Pass Conf
		
	/*	In above case container created with no objects (i.e ACAC a =new ACAC()).
		After creating container, we are providing package name to search for classes to create objects using code.
		scan(basePackages).
		 Now we should inform to container Re-search for all classes and create object using code.
		refresh() */
		
		AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext();
		ioc.scan("com");
		ioc.register(AppConf.class);
		ioc.refresh();

		Airtel i = ioc.getBean("airtel", Airtel.class);
		System.out.println("Airtel hashcode:"+i);
		// By default bean scope singleton so same hashcode
		 i = ioc.getBean("airtel", Airtel.class);
		System.out.println("Airtel hashcode:"+i);
		
		i.data();
		
		Mobile mo=ioc.getBean("mobile",Mobile.class);
		mo.airtel.calling();
		System.out.println("Repository injected:"+mo.clientRepository.getDataSource());
		// ioc.register(AppConf.class);
		/*
		 * AppConf app= ioc.getBean("appConf",AppConf.class);
		 * ioc.setDisplayName(app.m1()); System.out.println(" IOC Container Name :" +
		 * ioc.getDisplayName()); System.out.println(" getStartupDate :" +
		 * ioc.getStartupDate()); //System.out.println(" applicationName :" + );
		 * System.out.println(" Container Name :" + ioc.getApplicationName()); Airtel
		 * airtel = (Airtel) ioc.getBean("airtel"); // @Primary airtel.calling();
		 * airtel.data();
		 * 
		 * Jio jio = (Jio) ioc.getBean("jio"); // Jio conf as @lazy initilization
		 * jio.calling(); jio.data(); Mobile m = new Mobile();
		 * System.out.println(" air :" + m.air); // get No qualifying bean of type
		 * exception // we have to use @Primary or @Qalifier
		 * 
		 * 
		 * ClientRepository client =
		 * ioc.getBean("clientRepository",ClientRepository.class);
		 * System.out.println(client.getDataSource()); ioc.registerShutdownHook(); */
		 
		//ioc.destroy(); ioc.close();
		ioc.registerShutdownHook();  // This destory container once current thread stopped
		 

	}

}
