package br.com.mendes.estudo.services;

import br.com.mendes.estudo.domain.User;
import br.com.mendes.estudo.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO user);

    User update(UserDTO obj);

    void delete(Integer id);
}
