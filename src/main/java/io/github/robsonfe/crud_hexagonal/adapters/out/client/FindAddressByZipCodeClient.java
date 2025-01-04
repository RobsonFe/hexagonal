package io.github.robsonfe.crud_hexagonal.adapters.out.client;

import io.github.robsonfe.crud_hexagonal.adapters.out.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "findAddressByZipCode", url = "${client.address.url}")
public interface FindAddressByZipCodeClient {

    @GetMapping("/address/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);

}
