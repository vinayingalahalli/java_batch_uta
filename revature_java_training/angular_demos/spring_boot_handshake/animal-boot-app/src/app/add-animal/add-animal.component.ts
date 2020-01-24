import { Component, OnInit } from '@angular/core';
import { Animal } from '../animal';
import { AnimalServiceService } from '../animal-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-animal',
  templateUrl: './add-animal.component.html',
  styleUrls: ['./add-animal.component.css']
})
export class AddAnimalComponent implements OnInit {

  private animal: Animal;
  constructor(private service:AnimalServiceService,private router:Router) {
    this.animal=new Animal();
   }

   addAnimal(){
     this.service.addAnimal(this.animal).subscribe(res=>this.gotoAnimalList());
     
   }
  gotoAnimalList(): void {
    this.animal=new Animal();
    this.router.navigate(['/animals']);
  }

  ngOnInit() {
  }

}
