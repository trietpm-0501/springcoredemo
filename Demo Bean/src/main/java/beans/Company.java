package beans;

import jakarta.mail.internet.MimeMessage;
import org.springframework.context.annotation.Scope;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
@Component
@Scope("singleton")
public class Company {
    private String name;
    private String address;
    private String phoneNumber;

    public Company() {
        this.name = "Công ty ABC";
        this.address = "123 Đường ABC, Quận XYZ, Thành phố HCM";
        this.phoneNumber = "0123-456-789";
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


