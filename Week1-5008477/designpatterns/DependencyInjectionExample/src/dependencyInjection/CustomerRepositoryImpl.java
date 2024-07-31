package dependencyInjection;

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // Simulate finding a customer in a database
        return new Customer(id, "John Doe");
    }
}
