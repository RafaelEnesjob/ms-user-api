package com.ms.userApi.service;

import com.ms.userApi.entitie.User;
import com.ms.userApi.exceptions.CpfExistenteException;
import com.ms.userApi.repositorie.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ValidadorCpfService {

    private final UserRepository userRepository;

    public ValidadorCpfService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void validarCpf(String cpf) {
        Optional<User> usuarioExistente = userRepository.findByCpf(cpf);
        if (usuarioExistente.isPresent()) {
            throw new CpfExistenteException();
        }
    }
}
