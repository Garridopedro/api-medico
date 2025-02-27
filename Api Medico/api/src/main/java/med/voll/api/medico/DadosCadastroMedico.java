package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank //Notblank é usado para campos string que não podem ficar vazios
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}") // Expressão regular de validação para descrever que é um dígito e que tem que ser de 4 a 6 dígitos
        String crm,

        @NotNull // NotNull é usado para campos que não são string que não podem ficar vazios
        Especialidade especialidade,

        @NotNull
        @Valid
        DadosEndereco endereco) {
}
