package br.com.mendes.estudo.config;

import br.com.mendes.estudo.domain.User;
import br.com.mendes.estudo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;

    @Bean
    public void startDB() {
        User u1 = new User(null, "Rafael", "rafael@gmail.com", "123");
        User u2 = new User(null, "Junior", "junior@gmail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }
}
