package main;
import beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // Lấy bean User từ ApplicationContext
        User user1 = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");

        user1.setUsername("user1Name");
        user1.setPassword("user1Pass");

        user2.setUsername("user2Name");
        user2.setPassword("user2Pass");

        // In ra giá trị của thuộc tính username và password
        System.out.println("User 1 - Username: " + user1.getUsername());
        System.out.println("User 1 - Password: " + user1.getPassword());

        System.out.println("User 2 - Username: " + user2.getUsername());
        System.out.println("User 2 - Password: " + user2.getPassword());

    }
}
