import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student manju =context.getBean("student",Student.class);
		manju.displayStudentInfo();
		Student hi = context.getBean("manju",Student.class);
		hi.displayStudentInfo();
	    
	}

}
