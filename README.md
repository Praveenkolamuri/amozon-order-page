# Amazon Order Page Service

## Introduction

This project is a simple Spring Boot application that manages Amazon orders. It provides CRUD operations for handling order information such as order ID, name, address, cost, and email.

## Project Structure

### Model

- **ordermodel.java**
  - This class represents the order entity.
  - Annotations:
    - `@Entity`: Specifies that the class is an entity.
    - `@Id`, `@GeneratedValue`: Specifies the primary key and its generation strategy.
    - `@Email`: Validates the email field.
    - Lombok annotations: `@Getter`, `@Setter`, `@AllArgsConstructor`, `@NoArgsConstructor` for generating boilerplate code.

### Service

- **orderservice.java**
  - This class provides services for managing orders.
  - Methods:
    - `insert(ordermodel o)`: Inserts a new order.
    - `insertall(List<ordermodel> or)`: Inserts multiple orders.
    - `getall()`: Retrieves all orders.
    - `getbyid(int id)`: Retrieves an order by ID.
    - `deletebyid(int id)`: Deletes an order by ID.
    - `updatebyid(ordermodel e)`: Updates an order by ID.

### Repository

- **orderrepository.java**
  - This interface extends `CrudRepository` for CRUD operations on orders.
  - Custom method:
    - `findByEmail(String email)`: Finds an order by email.

## Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Praveenkolamuri/amazon-order-page.git
   cd amazon-order-page
   ```

2. **Build the project:**
   ```bash
   mvn clean install
   ```

3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

## Endpoints

- `POST /orders`: Create a new order.
- `POST /orders/batch`: Create multiple orders.
- `GET /orders`: Retrieve all orders.
- `GET /orders/{id}`: Retrieve an order by ID.
- `DELETE /orders/{id}`: Delete an order by ID.
- `PUT /orders`: Update an order.

## Dependencies

- Spring Boot
- Spring Data JPA
- Lombok
- Jakarta Persistence
- Jakarta Validation

## Contact

- LinkedIn: [Sai Praveen Kolamuri](https://www.linkedin.com/in/sai-praveen-kolamuri-7b449822a/)
- GitHub: [Praveenkolamuri](https://github.com/Praveenkolamuri)
- Instagram: [pra_veen2112](https://www.instagram.com/pra_veen2112)
