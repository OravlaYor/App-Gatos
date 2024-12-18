# App Gatos

Aplicación para explorar imágenes de gatos, desarrollada con Java, Spring Boot y servicios web.

---

## Descripción

**App Gatos** es una aplicación que permite a los usuarios:

- Explorar imágenes aleatorias de gatos.
- Guardar sus imágenes favoritas.
- Compartir imágenes a través de un enlace.

Esta aplicación utiliza la API pública "The Cat API" para obtener imágenes y proporciona un backend que facilita la interacción y el almacenamiento local de preferencias de usuario.

---

## Tecnologías Utilizadas

- **Backend**: Java 17 con Spring Boot.
- **Servicios Externos**: The Cat API.
- **Cliente de API**: Postman.
- **Gestor de Dependencias**: Maven.

---

## Características Principales

- **Consulta de Imágenes Aleatorias**: Obtén imágenes nuevas con cada solicitud.
- **Gestión de Favoritos**: Almacena y organiza tus imágenes favoritas.
- **Compartir Enlaces**: Genera enlaces directos para compartir imágenes específicas.

---

## Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener:

- **Java 17 o superior**.
- **Maven** instalado.
- **Postman** (opcional, para probar la API).
- Una cuenta gratuita en **The Cat API** para obtener una clave de acceso.

---

## Instalación y Ejecución

1. **Clonar el repositorio**:

   ```bash
   git clone https://github.com/OravlaYor/App-Gatos.git
   cd App-Gatos
   ```

2. **Configurar las credenciales**:

   - Obtén una API Key gratuita en [The Cat API](https://thecatapi.com/).
   - Edita el archivo `application.properties` en `src/main/resources` con tu clave de API:
     ```properties
     cat.api.key=TU_API_KEY
     ```

3. **Compilar y ejecutar la aplicación**:

   ```bash
   mvn spring-boot:run
   ```

4. **Acceder a la API**:

   - Por defecto, la API estará disponible en `http://localhost:8080`.

---

## Endpoints Principales

### Explorar Imágenes

- **GET** `/gatos/random`: Obtiene una imagen aleatoria de gato.

### Favoritos

- **GET** `/gatos/favoritos`: Obtiene la lista de imágenes favoritas del usuario.
- **POST** `/gatos/favoritos`: Agrega una imagen a favoritos.
  ```json
  {
    "id": "abc123",
    "url": "https://cdn2.thecatapi.com/images/abc123.jpg"
  }
  ```
- **DELETE** `/gatos/favoritos/{id}`: Elimina una imagen de la lista de favoritos.

### Compartir Imágenes

- **GET** `/gatos/compartir/{id}`: Genera un enlace para compartir una imagen específica.

---

## Pruebas

Si implementaste pruebas, ejecútalas con:

```bash
mvn test
```

---

## Mejoras Futuras

- Implementar una interfaz gráfica para visualizar imágenes y gestionar favoritos.
- Agregar autenticación de usuarios para cuentas personalizadas.
- Soporte para subir imágenes de gatos propias.
- Integración con redes sociales para compartir imágenes directamente.

---

## Autor

**Roy Alvarado**\
[GitHub](https://github.com/OravlaYor) | [LinkedIn](https://www.linkedin.com/in/royalvarodr/)

##

