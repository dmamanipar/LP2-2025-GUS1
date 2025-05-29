import {Component, OnInit} from '@angular/core';
import {evaluate} from 'mathjs';
import {FormsModule} from '@angular/forms';
import {NgClass, NgForOf, NgIf} from '@angular/common';
import {ButtonModule} from 'primeng/button';
import {Menubar, MenubarModule} from 'primeng/menubar';
import {MenuItem} from 'primeng/api';
import {Badge} from 'primeng/badge';
import {Avatar} from 'primeng/avatar';
import { BadgeModule } from 'primeng/badge';
import { AvatarModule } from 'primeng/avatar';
import { InputTextModule } from 'primeng/inputtext';
import { CommonModule } from '@angular/common';
import { Ripple } from 'primeng/ripple';

@Component({
  selector: 'app-calculadora',
  standalone:true,
  imports: [
    FormsModule,
    NgForOf,
    ButtonModule,
    Menubar,
    Badge,
    NgClass,
    Avatar,
    NgIf,
     BadgeModule, AvatarModule, InputTextModule, Ripple, CommonModule
  ],
  /*template: `
    <p>calculadora works DMO!</p>
    `,*/
  templateUrl: './calculadora.component.html',
  styleUrl: './calculadora.component.css'
})
export class CalculadoraComponent implements OnInit{
  items: MenuItem[] | undefined;

  ngOnInit() {
    this.items = [
      {
        label: 'Home',
        icon: 'pi pi-home',
      },
      {
        label: 'Projects',
        icon: 'pi pi-search',
        badge: '3',
        items: [
          {
            label: 'Core',
            icon: 'pi pi-bolt',
            shortcut: '⌘+S',
          },
          {
            label: 'Blocks',
            icon: 'pi pi-server',
            shortcut: '⌘+B',
          },
          {
            separator: true,
          },
          {
            label: 'UI Kit',
            icon: 'pi pi-pencil',
            shortcut: '⌘+U',
          },
        ],
      },
    ];
  }
  /*
  num1:number=0;
  num2:number=0;
  result:String="";
  oper:string=""
  visible:boolean=false;

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
    this.visible=true;
    this.result=evaluate(this.num1+this.oper+this.num2);
  }*/

  pantalla: string="";

  bottons:string[]=[
    '7', '8', '9', '/',
    '4', '5', '6', '*',
    '1', '2', '3', '+',
    '0', '.', '=', '-',
    'AC'
  ];

  precionarBoton(valor: string){
    if(valor === "AC"){
      this.pantalla="";

    }else if(valor === "="){
      this.calcular();
    }else{
      this.pantalla+=valor;
    }
  }

  calcular(){
    try {
      var valor = this.pantalla;
      this.pantalla=evaluate(valor);
    }catch (e) {
      this.pantalla="Error";
    }
  }

}
