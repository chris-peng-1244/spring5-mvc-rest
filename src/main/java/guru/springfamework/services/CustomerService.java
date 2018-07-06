package guru.springfamework.services;

import guru.springfamework.api.v1.model.CustomerDTO;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<CustomerDTO> findAllCustomers();

    Optional<CustomerDTO> findById(Long id);

    CustomerDTO createNewCustomer(CustomerDTO customer);
}
