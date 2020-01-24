import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AnimalServiceService } from './animal-service.service';
import { AnimalListComponent } from './animal-list/animal-list.component';
import { AddAnimalComponent } from './add-animal/add-animal.component';
import {FormsModule} from '@angular/forms'
import { HttpClientModule } from "@angular/common/http";
@NgModule({
  declarations: [
    AppComponent,
    AnimalListComponent,
    AddAnimalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [AnimalServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
