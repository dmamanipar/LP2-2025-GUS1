import { Routes } from '@angular/router';

import {LayoutComponent} from './paginas/layout/layout.component';

export const routes: Routes = [
  { path: '', redirectTo:'main' , pathMatch: 'full' },
  { path: 'main', component: LayoutComponent, },
];
