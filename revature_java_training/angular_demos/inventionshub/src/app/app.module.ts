import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InventionsComponent } from './inventions/inventions.component';
import {  FormsModule } from '@angular/forms';
import { GitapiComponent } from './gitapi/gitapi.component';
import {  HttpClient,HttpClientModule} from "@angular/common/http";
@NgModule({
  declarations: [
    AppComponent,
    InventionsComponent,
    GitapiComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
