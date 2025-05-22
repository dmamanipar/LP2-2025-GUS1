import { Component } from '@angular/core';
import {evaluate} from 'mathjs';

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
  result:String="";
  oper:string=""

  getNum1(e:any){
    this.num1=e.target.value;
    console.log(e);
  }

  getNum2(e:any){
    console.log(e);
    this.num2=e.target.value;
  }

  operar(oper:string){
    this.oper=oper;
    this.result=evaluate(this.num1+this.oper+this.num2);
  }

}
