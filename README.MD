# api-gateway

Punto de entrada único con Keycloak como proveedor de identidad

## USO

- Valida roles y permisos de las rutas  `/api/v1/**`.
- Valida el JWT de Keycloak.

## Requisitos

- Java 21
- `book-service` corriendo
- Un realm de Keycloak configurado


## Ejecutar

```bash
./mvnw spring-boot:run
```

expone `http://localhost:9000`.

## Despligue

Dockerfile incluido, se despligua en openshift
