package io.github.robsonfe.crud_hexagonal.application.core.usecase;

import io.github.robsonfe.crud_hexagonal.application.core.domain.Customer;
import io.github.robsonfe.crud_hexagonal.application.ports.in.FindCustomerByIdInputPort;
import io.github.robsonfe.crud_hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.stereotype.Service;

@Service
public class FindCustomerFindByIdUseCase implements FindCustomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerFindByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    public Customer findById(String id) {
        return findCustomerByIdOutputPort.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }
}
