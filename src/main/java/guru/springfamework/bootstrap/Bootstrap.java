package guru.springfamework.bootstrap;

import guru.springfamework.domain.Category;
import guru.springfamework.domain.Customer;
import guru.springfamework.repositories.CategoryRepository;
import guru.springfamework.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    private CategoryRepository categoryRepository;
    private CustomerRepository customerRepository;

    public Bootstrap(CategoryRepository categoryRepository, CustomerRepository customerRepository) {
        this.categoryRepository = categoryRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadCategories();
        loadCustomers();
    }

    private void loadCustomers() {
        Customer jim = new Customer();
        jim.setFirstname("Jim");
        jim.setLastname("Newman");

        Customer mike = new Customer();
        mike.setFirstname("Michael");
        mike.setLastname("Lachappele");

        Customer david = new Customer();
        david.setFirstname("David");
        david.setLastname("Winter");

        Customer anne = new Customer();
        anne.setFirstname("Anne");
        anne.setLastname("Hine");

        customerRepository.save(jim);
        customerRepository.save(mike);
        customerRepository.save(david);
        customerRepository.save(anne);

        System.out.println("Customer data loaded: " + customerRepository.count());
    }

    private void loadCategories() {
        Category fruits = new Category();
        fruits.setName("Fruits");

        Category dried = new Category();
        dried.setName("Dried");

        Category fresh = new Category();
        fresh.setName("Fresh");

        Category exotic = new Category();
        exotic.setName("Exotic");

        Category nuts = new Category();
        nuts.setName("Nuts");

        categoryRepository.save(fruits);
        categoryRepository.save(dried);
        categoryRepository.save(fresh);
        categoryRepository.save(exotic);
        categoryRepository.save(nuts);

        System.out.println("Category data loaded: " + categoryRepository.count());
    }
}
