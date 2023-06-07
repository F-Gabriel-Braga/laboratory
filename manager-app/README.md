# Manager App
Este projeto foi gerado com [Angular CLI](https://github.com/angular/angular-cli) versão 14.0.6.

## Descrição
Manager App é uma aplicação de gerenciamento empresarial. Baseada em componentes, ela foi desenvolvida com [Angular](https://angular.io/docs) (14.0.0)
e [Bootstrap](https://getbootstrap.com/docs/5.2/getting-started/introduction/) (5.2).

## Modelos

### [User](https://github.com/F-Gabriel-Braga/manager-app/blob/master/src/app/model/user.ts)
Modelo que define as propriedades de um Usuário no aplicativo.
#### Propriedades
* user
* name
* password
* job
* address
* email
* image
* administrator

### [Report](https://github.com/F-Gabriel-Braga/manager-app/blob/master/src/app/model/report.ts)
Modelo que define as propriedades de um Informativo no aplicativo.
#### Propriedades
* author
* content

## Serviços

### [UserService](https://github.com/F-Gabriel-Braga/manager-app/blob/master/src/app/service/user-service.ts)
Classe que contém métodos de manipulação de Usuário com o banco de dados.
#### Métodos
* findAll(): Retorna todos os Usuários do banco de dados.
* findUser(name, password): Retorna Usuário, especificado por username e password, do banco de dados.
* addUser(user): Método que adiciona novo Usuário ao banco de dados.

### [ReportService](https://github.com/F-Gabriel-Braga/manager-app/blob/master/src/app/service/report-service.ts)
Classe que contém métodos de manipulação de Informativos com o banco de dados.
#### Métodos
* findAll(): Retorna todos os Informativos do banco de dados.
* addReport(report): Método que adiciona novo Informativo ao banco de dados.

## Componentes

### [Content](https://github.com/F-Gabriel-Braga/manager-app/blob/master/src/app/content/content.component.ts)
Componente principal. Encapsula todos os demais componentes da aplicação. Responsável, principalmente, pela comunicação dos demais componentes.
#### Propriedades
* user: Objeto Usuário que está acessando o sistema.
* userEmpty: Propriedade lógica de validação do Usuário.
#### Métodos
* init(user): Método que inicia as propriedades da classe.
* finish(): Método que reseta as propriedades da classe.

### [Login](https://github.com/F-Gabriel-Braga/manager-app/blob/master/src/app/login/login.component.ts)
Componente inicial do aplicativo. Responsável pela inicialização de todos os demais componentes da aplicação.
#### Propriedades
* login: Evento de emissão do Usuário. Deve ser emitido após a verificação de existência do usuário no banco de dados.
#### Métodos
* logar(name, password): Método de verificação de existência do usuário.

### [Personal Data](https://github.com/F-Gabriel-Braga/manager-app/blob/master/src/app/personal-data/personal-data.component.ts)
Componente que exibe os dados do usuário que acessar o aplicativo.
#### Propriedades
* user: Objeto Usuário que está acessando o sistema. Deve ser passado através de Property Binding.
* logout: Evento que emite a saída do usuário da aplicação.
#### Métodos
* exit(): Método que emite o evento de logout.

### [Reports](https://github.com/F-Gabriel-Braga/manager-app/blob/master/src/app/reports/reports.component.ts)
Componente que exibe dados informativos entres os usuários do aplicativo.
#### Propriedades
* user: Objeto Usuário que está acessando o sistema. Deve ser passado através de Property Binding.
* listReports: Lista de informes.
* listEmpty: Propriedade lógica de validação da lista de Informes.
#### Métodos
* addReport(content): Método que adiciona um novo Informativo na lista.
* markMeeting(description, data, time, link): Método que adiciona um novo Informativo de reunião na lista.

### [New User](https://github.com/F-Gabriel-Braga/manager-app/blob/master/src/app/new-user/new-user.component.ts)
Componente que exibe e insere dados de Usuários. É exibido somente a Usuários administradores que acessam o aplicativo.
#### Propriedades
* listUsers: Lista de Usuários.
* listEmpty: Propriedade lógica de validação da lista de Usuários.
#### Métodos
* add(user, name, password, job, address, email,  image, administrator): Método que adiciona um novo Usuário na lista.
