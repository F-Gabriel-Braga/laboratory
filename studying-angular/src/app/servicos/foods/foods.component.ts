import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Food } from '../food';
import { FoodService } from '../food.service';

@Component({
  selector: 'app-foods',
  templateUrl: './foods.component.html',
  styleUrls: ['./foods.component.css']
})
export class FoodsComponent implements OnInit {

  public listFood: Food[] = [];

  //private foodService: FoodService = new FoodService(); // O FoodsComponent depende de FoodService
  private foodService: FoodService;
  private formBuilder: FormBuilder;

  public form: FormGroup;

  constructor(servico: FoodService, formBuilder: FormBuilder) {
    this.foodService = servico;
    this.formBuilder = formBuilder;

    this.form = formBuilder.group({
      name: [''],
      description: [''],
      calories: ['']
    });
  }

  ngOnInit(): void {
    this.listFood = this.foodService.findAll();
  }

  searchFood(foodName: string): void {
    let search = this.foodService.findFoodName(foodName);
    if(search.length == 0) {
      this.listFood = this.foodService.findAll();
    }
    else {
      this.listFood = search;
    }
  }

  /*public addNewFood(name: string, description: string, calories: number): void {
    this.foodService.insert({
      id: undefined,
      name: name,
      description: description,
      calories: calories
    });
  }*/

  public adicionarFood(): void {
    let food: Food = this.form.value;
    this.foodService.insert(food);
  }
}
