import { Component, OnInit } from '@angular/core';
import { AnimalServiceService } from '../animal-service.service';
import { Animal } from '../animal';

@Component({
  selector: 'app-animal-list',
  templateUrl: './animal-list.component.html',
  styleUrls: ['./animal-list.component.css']
})
export class AnimalListComponent implements OnInit {

  private animals:Animal[];
  constructor(private service:AnimalServiceService) { }

  ngOnInit() {
    this.service.getAllAnimals().subscribe(data=>{
      this.animals=data;
    });
  }

}
