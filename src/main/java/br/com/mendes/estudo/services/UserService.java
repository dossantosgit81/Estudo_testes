package br.com.mendes.estudo.services;

import br.com.mendes.estudo.domain.User;

public interface UserService {

    User findById(Integer id);
}
