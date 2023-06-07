import { User } from "../model/user";

// Back-end (API)
let users: User[] = [
    {
        username: "Gabriel",
        password: "123",
        name: "Gabriel Braga",
        job: "Professor de Angular",
        address: "R. 12 de Agosto, 901, Guaraciaba do Norte, CE",
        email: "gabriel@email.com",
        image: "https://avatars.githubusercontent.com/u/66652642?v=4",
        administrator: true
    }
];

export class UserService {

    public static findAll(): User[] {
        return users;
    }

    public static findUser(name: string, password: string): User | null {
        let result: User | null = null;
        for(let user of users) {
            if(user.username == name && user.password == password) {
                result = user;
                break;
            }
        }
        return result;
    }

    public static addUser(user: User) {
        users.push(user);
    }
}