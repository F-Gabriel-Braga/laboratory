import { Injectable } from '@angular/core';
import { Food } from './food';
import { FoodsComponent } from './foods/foods.component';

// ng generate service <nome> / ng g s <nome>

// Injeção de Dependência (DI)
@Injectable({
  providedIn: 'root'
})
export class FoodService {

  // Dados com Back-end
  private db: Food[] = [
    {
      id: 1,
      name: "Pizza",
      description: "Queijo, Molho de tomate, Oregano e Tomate.",
      calories: 360
    },
    {
      id: 2,
      name: "X-Burguer",
      description: "Pão, Carne, Queijo, Tomate e Alface.",
      calories: 200
    },
    {
      id: 3,
      name: "Lasanha",
      description: "Queijo, Presunto, Carne moida e Molho rosê.",
      calories: 200
    }
  ];

  constructor() { }

  public findAll(): Food[] {
    // Comandos que se comunicam com o back e obtem todos os dados (find all) de foods.
    return this.db;
  }

  public findFoodName(foodName: string): Food[] {
    let search: Food[] = [];
    for(let food of this.db) {
      if(food.name == foodName) {
        search.push(food);
      }
    }
    return search;
  }

  public insert(food: Food): void {
    food.id = this.db.length+1; // auto increment é feita no SGDB (MySQL)
    this.db.push(food);
  }
}