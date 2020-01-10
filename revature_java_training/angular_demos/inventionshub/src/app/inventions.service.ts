import { Injectable } from '@angular/core';
import { Invention } from './inventions/invention';

@Injectable({
  providedIn: 'root'
})
export class InventionsService {

   rawInventions: Invention[]=[{
    name:'Java Programming',
    inventor:'James Gosling',
    year:1992
  },
  {
    name:'Hibernate F/w',
    inventor:'Rod ',
    year:1992
  },
  {
    name:'Javascript',
    inventor:'Brendon Eich',
    year:1996
  },
  {
    name:'C++',
    inventor:'Bijarane Stroustroup',
    year:1983
  },
  {
    name:'Spring F/w',
    inventor:'Gavin King',
    year:2000
  }

];
  constructor() { }
  getInventions():Invention[]{
  return this.rawInventions;
}
}
