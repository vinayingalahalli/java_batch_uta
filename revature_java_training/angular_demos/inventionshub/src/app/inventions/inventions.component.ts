import { Component, OnInit } from '@angular/core';
import { Invention } from './invention';
import { InventionsService } from '../inventions.service';

@Component({
  selector: 'app-inventions',
  templateUrl: './inventions.component.html',
  styleUrls: ['./inventions.component.css'],
  providers:[InventionsService]
})
export class InventionsComponent implements OnInit {
 nameModel :string;
 inventorModel:string;
 yearModel:number;
 inventions:Invention[];
  constructor(private inventionsService:InventionsService) { 
    this.nameModel='';
    this.inventorModel='';
    this.yearModel=0;

  
    this.inventions=inventionsService.getInventions();
  }

createInvention(){
  let newInvention: Invention={
    name:this.nameModel,
    inventor:this.inventorModel,
    year:this.yearModel
  };
  this.inventions.push(newInvention);
  this.nameModel=this.inventorModel='';
  this.yearModel=0;
}

  ngOnInit() {
  }

}
