// Modelo de Usuário
export class User {
    username!: string;
    password!: string;
    name!: string;
    job!: string;
    address!: string;
    email!: string;
    image!: string;
    administrator: boolean = false;    
}