import { Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import {MatejemploComponent} from './matejemplo/matejemplo.component';
import {MainMarcaComponent} from './main-marca/main-marca.component';

export const pagesRoutes: Routes = [
  { path: 'dashboard', component: DashboardComponent,  },
  { path: 'mattable', component: MatejemploComponent },
  { path: 'marca', component: MainMarcaComponent },
  /*{
    path: 'product',
    component: ListaProductoComponent,
    children: [
      { path: 'new', component: FormProductoComponent },
      { path: 'edit/:id', component: FormProductoComponent },
    ],
  },
  { path: 'categoria', component: MainCategoriaComponent , },
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
