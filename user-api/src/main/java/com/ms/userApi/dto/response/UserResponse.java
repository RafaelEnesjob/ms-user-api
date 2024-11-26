package com.ms.userApi.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserResponse {

    private Long id;
    private String nome;
    private String sobreNome;
    private String cpf;
    private String telefone;
    private String email;
}
