export let name : string="Typescript";
console.log("Hello "+name);

class Car{
    id:number;
    name:string;
    constructor(id:number,name:string){
        this.id=id;
        this.name=name;
    }
    printCar(){
        console.log("id "+this.id);
        console.log("name "+this.name);
    }
}
let car=new Car(101,"benz");
car.printCar();