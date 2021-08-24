package springzuoye;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test01(){
        String xml = "springzuoye/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        //我们要拿主体
        springzuoye.Person person = ac.getBean("person", Person.class);
        person.eatw();

    }
}
