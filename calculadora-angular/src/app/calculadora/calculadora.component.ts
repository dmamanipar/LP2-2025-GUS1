import { Component } from '@angular/core';

@Component({
  selector: 'app-calculadora',
  standalone:true,
  imports: [],
  /*template: `
    <p>calculadora works DMO!</p>
    `,*/
  templateUrl: './calculadora.component.html',
  styleUrl: './calculadora.component.css'
})
export class CalculadoraComponent {

  num1:number=0;
  num2:number=0;
  result:number=0;

  getNum1(e:any){
    console.log(e);
  }

  getNum2(e:any){
    console.log(e);
  }

}
