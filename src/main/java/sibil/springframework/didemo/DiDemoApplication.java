package sibil.springframework.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DiDemoApplication.class, args);
		//MyController controller=(MyController) ctx.getBean("myController");
		//controller.hello();
		//System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		//System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}

}
