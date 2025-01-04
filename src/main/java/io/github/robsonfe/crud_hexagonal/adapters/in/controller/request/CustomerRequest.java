package io.github.robsonfe.crud_hexagonal.adapters.in.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CustomerRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String cpf;

    @NotBlank
    private String zipCode;

    //Estava gerando erro de compilação mesmo com o lambok sendo usado, só resolveu fazendo o processo maunualmente.
    public String getZipCode() {
        return zipCode;
    }

}
