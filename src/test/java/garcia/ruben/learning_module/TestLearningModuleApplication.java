package garcia.ruben.learning_module;

import org.springframework.boot.SpringApplication;
import org.testcontainers.utility.TestcontainersConfiguration;

public class TestLearningModuleApplication {

	public static void main(String[] args) {
		SpringApplication.from(LearningModuleApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
