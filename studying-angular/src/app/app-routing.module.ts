import { Routes, RouterModule } from '@angular/router';
import { CicloDeVidaComponent } from './ciclo-de-vida/ciclo-de-vida/ciclo-de-vida.component';
import { ComponentAngularComponent } from './component-angular/component-angular.component';
import { IntroductionComponent } from './introduction/introduction.component';
import { PipesComponent } from './pipes/pipes/pipes.component';
import { PostSimulatorComponent } from './data-binding/post-simulator/post-simulator.component';
import { DataBindingComponent } from './data-binding/data-binding/data-binding.component';
import { DiretivasComponent } from './diretivas/diretivas/diretivas.component';
import { ListaAlunosComponent } from './diretivas/lista-alunos/lista-alunos.component';
import { ExternoComponent } from './comunicacao-de-componentes/externo/externo.component';
import { ModuloComponent } from './modulo-teste/modulo/modulo.component';
import { LandingPageComponent } from './modulo-teste/landing-page/landing-page.component';
import { TemplateDrivenComponent } from './forms/template-driven/template-driven.component';
import { DataDrivenComponent } from './forms/data-driven/data-driven.component';
import { FoodsComponent } from './servicos/foods/foods.component';
import { TestObservableComponent } from './observables/test-observable/test-observable.component';
import { FilmsComponent } from './http/films/films.component';
import { RotasComponent } from './rotas/rotas/rotas.component';
const routes: Routes = [
    {
        path: '',
        component: IntroductionComponent
    },
    {
        path: 'introduction',
        component: IntroductionComponent
    },
    {
        path: 'data-binding',
        component: DataBindingComponent
    },
    {
        path: 'post-simulator',
        component: PostSimulatorComponent
    },
    {
        path: 'component-angular',
        component: ComponentAngularComponent
    },
    {
        path: 'in-out',
        component: ExternoComponent
    },
    {
        path: 'diretivas',
        component: DiretivasComponent
    },
    {
        path: 'lista-alunos',
        component: ListaAlunosComponent
    },
    {
        path: 'ciclo-de-vida',
        component: CicloDeVidaComponent
    },
    {
        path: 'pipes',
        component: PipesComponent
    },
    {
        path: 'modulos',
        component: ModuloComponent
    },
    {
        path: 'landing-page',
        component: LandingPageComponent
    },
    {
        path: 'template-driven',
        component: TemplateDrivenComponent
    },
    {
        path: 'data-driven',
        component: DataDrivenComponent
    },
    {
        path: 'foods',
        component: FoodsComponent
    },
    {
        path: 'observable',
        component: TestObservableComponent
    },
    {
        path: 'http',
        component: FilmsComponent
    },
    {
        path: 'routes',
        component: RotasComponent
    }
];
export const RoutingModule = RouterModule.forRoot(routes);