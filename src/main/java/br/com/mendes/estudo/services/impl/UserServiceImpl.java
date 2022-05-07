package br.com.mendes.estudo.services.impl;

import br.com.mendes.estudo.domain.User;
import br.com.mendes.estudo.domain.dto.UserDTO;
import br.com.mendes.estudo.repositories.UserRepository;
import br.com.mendes.estudo.services.UserService;
import br.com.mendes.estudo.services.exceptions.DataIntegrityViolationException;
import br.com.mendes.estudo.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User create(UserDTO obj) {
        findByEmail(obj);
        return repository.save(mapper.map(obj, User.class));
    }

    private void findByEmail(UserDTO obj) {
        Optional<User> user = repository.findByEmail(obj.getEmail());
        if (user.isPresent()) {
            throw new DataIntegrityViolationException("E-mail já cadastrado no sistema.");
        }
    }
}
