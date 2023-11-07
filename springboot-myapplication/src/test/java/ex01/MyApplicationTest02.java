package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/*
 * Spring Test Integration
 * 
 * Error:
 * SpringBoot Test Integeration(SpringBootTest) 에서는
 * @Configuration 을 달고 있는 설정 클래스는 자동으로 스캔하지 못한다.
 * 
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes={MyApplication.class})
public class MyApplicationTest02 {
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
