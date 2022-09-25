package com.springioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springioc.beans.ClientRepository;
import com.springioc.beans.JpaClientRepository;
import com.springioc.beans.Sim;

@Configuration
@ComponentScan(basePackages = "com")
@PropertySource("application.properties")
public class AppConf {
//Here # indicates object-id (obj ref) $ indicates property key.

	@Value("${application.name}")
	public String applicationName;

	@Value("#{airtel}")
	Sim sim;

	@Value("Hello")
	String hello;

//	Int type expressions:

	@Value("#{6+6}") // ==>12
	int sum;
	@Value("#{new java.util.Random().nextInt(1000)}") // =>Random Number
	int randomNumber;
	@Value("#{T(java.lang.Math).max(11,55)}") // =>55 output
	int maxNumber;
	@Value("#{new java.util.Random().nextDouble()*1000}") // =>Generates
	int gererateNumber;

	@Value("#{\"Hello\".length()}") // => Hello is String,
	int length;
	@Value("#{7>7?9:-99}") // =>output-99 7.
	int terrnayOperator;
	@Value("#{6/6}") // =>output:1 8.
	int devi;
	@Value("#{new java.util.Random().hashCode()}") // =>Output 564456
	int hashCode;

	// String DataType expressions:
	@Value("#{\"Welcome\".toUpperCase()}") // =>WELCOME
	String welcome;
	@Value("#(new java,lang.String (‘abcd’).length()}") // =>output 4
	String abcd;
	@Value("#{new java.util.Date().toString()}") // =>Same Data and Time
	String date;
//	@Value ("{(T (java.util.Calender).MILLISECOND})")  // =>Milli seond in int data
   int milisecond;

	public String m1() {
		return applicationName;
	}

	@Bean
	ClientRepository clientRepository() {
		ClientRepository accountRepository = new JpaClientRepository();
		accountRepository.setDataSource(sim.getDataSource());
		accountRepository.setRepName(hello);
		getInTypeExp();
		return accountRepository;
	}

	public void getInTypeExp() {
		System.out.println("Sum :" + sum);
		System.out.println("Max :" + maxNumber);
		System.out.println("GererateNumber :" + gererateNumber);
		System.out.println("Length :" + length);
		System.out.println("TerrnayOperator :" + terrnayOperator);
		System.out.println("Division :" + devi);
		System.out.println("HashCode :" + hashCode);
	}

}
