import { Component, OnInit } from '@angular/core';
import { Invention } from './invention';

@Component({
  selector: 'app-inventions',
  templateUrl: './inventions.component.html',
  styleUrls: ['./inventions.component.css']
})
export class InventionsComponent implements OnInit {
 nameModel :string;
 inventorModel:string;
 yearModel:number;
 inventions:Invention[];
  constructor() { 
    this.nameModel='';
    this.inventorModel='';
    this.yearModel=0;

    let defaultInvention: Invention={
      name:'Java Programming',
      inventor:'James Gosling',
      year:1992
    };
    this.inventions=[defaultInvention];
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
