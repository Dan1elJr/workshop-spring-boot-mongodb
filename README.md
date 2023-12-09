
## Visão Geral
Este projeto implementa uma API REST utilizando o framework Spring Boot para gerenciar usuários e seus posts associados. Ele consiste em dois controladores principais: `UserResource` e `PostResource`.

## UserResource

### Endpoints
- **GET /users:** Recupera uma lista de todos os usuários.
  ```java
  @RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<List<UserDTO>> findAll() {...}
  ```

- **GET /users/{id}:** Recupera um usuário específico por ID.
  ```java
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public ResponseEntity<UserDTO> findById(@PathVariable String id) {...}
  ```

- **POST /users:** Cria um novo usuário.
  ```java
  @RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<Void> insert(@RequestBody UserDTO objDto) {...}
  ```

- **DELETE /users/{id}:** Exclui um usuário por ID.
  ```java
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public ResponseEntity<Void> delete(@PathVariable String id) {...}
  ```

- **PUT /users/{id}:** Atualiza um usuário por ID.
  ```java
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public ResponseEntity<Void> update(@RequestBody UserDTO objDto, @PathVariable String id) {...}
  ```

- **GET /users/{id}/posts:** Recupera todos os posts associados a um usuário específico.
  ```java
  @RequestMapping(value = "/{id}/posts", method = RequestMethod.GET)
  public ResponseEntity<List<Post>> findPosts(@PathVariable String id) {...}
  ```

### Dependências
- **Serviço Autowired:** Utiliza um serviço `UserService` autowired para lidar com a lógica de negócios relacionada a usuários.

## PostResource

### Endpoints
- **GET /posts/{id}:** Recupera um post por ID.
  ```java
  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public ResponseEntity<Post> findById(@PathVariable String id) {...}
  ```

- **GET /posts/titlesearch:** Busca posts por título.
  ```java
  @RequestMapping(value = "/titlesearch", method = RequestMethod.GET)
  public ResponseEntity<List> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {...}
  ```

- **GET /posts/fullsearch:** Realiza uma busca de texto completo em posts.
  ```java
  @RequestMapping(value = "/fullsearch", method = RequestMethod.GET)
  public ResponseEntity<List> fullSearch(
      @RequestParam(value = "text", defaultValue = "") String text,
      @RequestParam(value = "minDate", defaultValue = "") String minDate,
      @RequestParam(value = "maxDate", defaultValue = "") String maxDate
  ) {...}
  ```

### Dependências
- **Serviço Autowired:** Utiliza um serviço `PostService` autowired para lidar com a lógica de negócios relacionada a posts.

## Observação
Certifique-se de configurar as dependências e configurações apropriadas em sua aplicação Spring Boot para uma execução adequada.

**Boa codificação!**
