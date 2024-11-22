package example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp{
	public static void main(String[]args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MovieRecommender recommender = context.getBean(MovieRecommender.class);
		recommender.recommendMovies();
		
		context.close();
	}
}