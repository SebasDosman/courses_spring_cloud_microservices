# Spring Cloud with Eureka
This project is a simple demonstration of a microservices architecture using Spring Cloud and Netflix's Eureka for service discovery.

## Key Concepts and Annotations
This project uses a number of Spring Framework features and annotations. Here's a brief explanation of each:

### Spring Framework Features
| Feature | Description |
| --- | --- |
| **Spring Web** | Provides common web-specific utilities for both Servlet and Portlet environments. |
| **Spring Dev Tools** | Provides automatic restart for easier development. |
| **Spring Data JPA** | Simplifies the implementation of data access layers by providing a platform to implement domain-driven design repositories. |
| **PostgreSQL Driver** | JDBC driver that allows Java programs to connect to a PostgreSQL database using standard, database independent Java code. |

### Annotations
| Annotation | Description |
| --- | --- |
| **@Data** | A Lombok annotation to generate getters, setters, equals, hashCode and toString methods. |
| **@NoArgsConstructor** | A Lombok annotation to generate a constructor with no parameters. |
| **@AllArgsConstructor** | A Lombok annotation to generate a constructor with one parameter for each field. |
| **@Entity** | Specifies that the class is an entity and is mapped to a database table. |
| **@Table** | Specifies the primary table for the annotated entity. |
| **@Id** | Specifies the primary key of an entity. |
| **@GeneratedValue** | Provides for the specification of generation strategies for the values of primary keys. |
| **@GeneratedValue(strategy = GenerationType.IDENTITY)** | Specifies that the primary key generation is to be done by the persistence provider at the time of insert. |
| **@Column** | Specifies a mapped column for a persistent property or field. |
| **@Temporal** | Specifies the type to be used in mapping a java.util.Date or java.util.Calendar. |
| **@Temporal(TemporalType.TIMESTAMP)** | Specifies that a persistent date or time field should be persisted as a timestamp in the database. |
| **@PrePersist** | Specifies a callback method for the corresponding lifecycle event. |
| **@Service** | Indicates that an annotated class is a "Service". |
| **@Transactional** | Describes transaction attributes on a method or class. |
| **@Transactional(readOnly = true)** | Spring annotation that sets the `readOnly` attribute of a transaction to `true`. |
| **@RestController** | A convenience annotation that is itself annotated with @Controller and @ResponseBody. |
| **ResponseEntity<?>** | Represents the entire HTTP response. Good for returning file downloads. |
| **Optional** | A container object which may or may not contain a non-null value. |
| **@PathVariable** | Indicates that a method parameter should be bound to a URI template variable. |
| **@RequestMapping** | Annotation for mapping web requests onto methods in request-handling classes. |

### Spring Cloud Eureka
| Concept | Description |
| --- | --- |
| **Eureka Server** | Service registry for resilient mid-tier load balancing and failover. |
| **@EnableEurekaServer** | Annotation to start a Eureka Server. |
| **@EnableDiscoveryClient** | Annotation to make your Spring Boot application act as a Eureka client. |

## Getting Started
### Prerequisites
- Java 8 or later
- Maven
- Spring Boot

### Installation
1. Clone the repository
```bash
git clone https://github.com/SebasDosman/eureka_api.git
```

2. Navigate to the project directory
```bash
cd MicroservicioEureka
cd MicroservicioUsuarios
```

3. Build the project
```bash
mvn clean install
```

### Usage
Start the Eureka server first, and then start the other services. They will automatically register themselves with the Eureka server.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
