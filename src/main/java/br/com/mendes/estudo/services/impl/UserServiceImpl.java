package br.com.mendes.estudo.services.impl;

import br.com.mendes.estudo.domain.User;
import br.com.mendes.estudo.repositories.UserRepository;
import br.com.mendes.estudo.services.UserService;
import br.com.mendes.estudo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));
    }
}
