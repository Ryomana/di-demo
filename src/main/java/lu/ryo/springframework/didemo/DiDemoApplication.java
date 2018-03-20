package lu.ryo.springframework.didemo;

import lu.ryo.springframework.didemo.controllers.ConstructorInjectedController;
import lu.ryo.springframework.didemo.controllers.MyController;
import lu.ryo.springframework.didemo.controllers.PropertyInjectedController;
import lu.ryo.springframework.didemo.controllers.SetterInjectedController;
import lu.ryo.springframework.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);

		MyController myController = (MyController) applicationContext.getBean("myController");

//		System.out.println(myController.hello());
//		System.out.println(applicationContext.getBean(PropertyInjectedController.class).sayHello());
//		System.out.println(applicationContext.getBean(SetterInjectedController.class).sayHello());
//		System.out.println(applicationContext.getBean(ConstructorInjectedController.class).sayHello());

		FakeDataSource fakeDataSource = (FakeDataSource) applicationContext.getBean(FakeDataSource.class);

		System.out.println(fakeDataSource.getUser());
	}
}
