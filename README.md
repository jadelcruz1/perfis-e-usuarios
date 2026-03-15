# Projeto Sistema de Usuários e Perfis

## Tecnologias Utilizadas
- Backend: Spring Boot
- Frontend: Angular 8+
- Banco de dados: H2 
- Angular Material para componentes no frontend

## Requisitos do Sistema

### CRUD de Perfis
- Campos:
  - `id` (chave primária)
  - `descricao` (texto)
- Regras:
  - O campo `descricao` é obrigatório
  - O campo `descricao` deve ter no mínimo 5 caracteres

### CRUD de Usuários
- Campos:
  - `id` (chave primária)
  - `nome` (texto)
  - `perfis` (lista de perfis de sistema)
- Regras:
  - O campo `nome` é obrigatório
  - O campo `nome` deve ter no mínimo 10 caracteres
  - O campo `perfis` deve ter ao menos 1 perfil informado

## Como Rodar o Projeto

### Backend
1. Abra o terminal na pasta do backend.
2. Execute o comando:
```bash
./mvnw spring-boot:run
```
3. O backend estará rodando em `http://localhost:8080` (padrão).

### Frontend
1. Abra outro terminal na pasta do frontend.
2. Execute o comando:
```bash
ng serve
```
3. O frontend estará rodando em `http://localhost:4200` (padrão).

### Como usar
1. Primeiro, crie um perfil.
2. Depois, crie um usuário que pertença a pelo menos um perfil.
3. O nome do usuário deve conter no mínimo 10 caracteres.
4. Somente consegue excluir um perfil se ele não tiver usuário associado.





