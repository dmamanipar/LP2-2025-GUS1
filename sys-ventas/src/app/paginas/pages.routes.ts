import { Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import {MatejemploComponent} from './matejemplo/matejemplo.component';
import {MainMarcaComponent} from './main-marca/main-marca.component';
import {FormMarcaComponent} from './main-marca/form-marca/form-marca.component';
import {MainProductoComponent} from './main-producto/main-producto.component';
import {FormxProductoComponent} from './main-producto/formx-producto/formx-producto.component';

export const pagesRoutes: Routes = [
  { path: 'dashboard', component: DashboardComponent,  },
  { path: 'mattable', component: MatejemploComponent },
  { path: 'marca', component: MainMarcaComponent,
    children:[
      { path: 'new', component: FormMarcaComponent },
      { path: 'edit/:id', component: FormMarcaComponent },
    ]
  },

  {
    path: 'product',
    component: MainProductoComponent,
    children: [
      { path: 'new', component: FormxProductoComponent },
      { path: 'edit/:id', component: FormxProductoComponent },
    ],
  },

  /*{ path: 'categoria', component: MainCategoriaComponent , },
  //{ path: 'categoria', component: MainCategoriaComponent },
  {
    path: 'marca',
    component: MainMarcaComponent,
    children: [
      { path: 'new', component: FormMarcaComponent },
      { path: 'edit/:id', component: FormMarcaComponent },
    ],
  },*/


];
