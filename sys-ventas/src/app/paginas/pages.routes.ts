import { Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';

export const pagesRoutes: Routes = [
  { path: 'dashboard', component: DashboardComponent,  },
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
