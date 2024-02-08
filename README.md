## Spring Boot Keycloak

- Keycloak 23.0.6
- Spring Boot 3.2.2


## Required:
- [Keycloak 23.0.6 released](https://www.keycloak.org/2024/02/keycloak-2306-released)

## Docker:
- docker run -d -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin --name my_keycloak quay.io/keycloak/keycloak:23.0.6 start-dev
