package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton Bean");
    }

    public String getMyScope(){
        return "I'm a Singleton";
    }
}
