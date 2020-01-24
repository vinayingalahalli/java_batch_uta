import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AnimalListComponent } from './animal-list/animal-list.component';
import { AddAnimalComponent } from './add-animal/add-animal.component';


const routes: Routes = [
  {path:'animals',component:AnimalListComponent},
  {path:'addAnimal',component:AddAnimalComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
