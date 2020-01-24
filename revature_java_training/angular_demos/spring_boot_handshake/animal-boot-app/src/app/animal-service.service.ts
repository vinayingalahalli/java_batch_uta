import { Injectable } from '@angular/core';
import {  HttpClient} from "@angular/common/http";
import { Observable } from 'rxjs';
import { Animal } from './animal';
@Injectable({
  providedIn: 'root'
})
export class AnimalServiceService {

  private url:string;

  constructor(private http:HttpClient) {
    this.url="http://localhost:9000/animal";
   }

   public getAllAnimals(): Observable<Animal[]>{
    return this.http.get<Animal[]>(this.url);
   }

   public addAnimal(animal:Animal){
     return this.http.post<Animal>(this.url,animal);
   }

}
