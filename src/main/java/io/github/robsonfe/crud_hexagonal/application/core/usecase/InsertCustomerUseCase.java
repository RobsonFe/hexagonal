package io.github.robsonfe.crud_hexagonal.application.core.usecase;

import io.github.robsonfe.crud_hexagonal.application.core.domain.Customer;
import io.github.robsonfe.crud_hexagonal.application.ports.in.InsertCustomerInputPort;
import io.github.robsonfe.crud_hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import io.github.robsonfe.crud_hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.stereotype.Service;

@Service
public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerOutputPort insertCustomerOutputPort
    ) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode){
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
