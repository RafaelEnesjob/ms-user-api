package com.ms.userApi.dto.request;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserRequest {

    @NotNull(message = "O nome do usuario é obrigatório.")
    @Size(min = 3, max = 50, message = "O nome do usuario deve ter entre 3 e 50 caracteres.")
    private String nome;

    @NotNull(message = "O sobreNome é obrigatório.")
    @Size(min = 3, max = 50, message = "O sobreNome do usuario deve ter entre 3 e 50 caracteres.")
    private String sobreNome;

    @NotNull(message = "CPF é obrigatório.")
    @Pattern(regexp = "\\d{11}", message = "CPF deve ter 11 dígitos.")
    private String cpf;

    @NotNull(message = "Telefone é obrigatório")
    @Pattern(regexp = "\\d{10,11}", message = "Telefone deve ter 10 ou 11 dígitos")
    private String telefone;

    @NotNull(message = "Email é obrigatório")
    @Email(message = "Email deve ser válido")
    private String email;
}
