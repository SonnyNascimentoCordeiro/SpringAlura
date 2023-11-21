package med.voll.api.model.pacientes;


import jakarta.validation.Valid;
import med.voll.api.model.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEndereco endereco
) {
}