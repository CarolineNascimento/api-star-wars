import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DetailFilmComponent } from './detail-film/detail-film.component';
import { HomeComponent } from './home/home.component';
import { ListFilmsComponent } from './list-films/list-films.component';

export const appRoutes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'list-films', component: ListFilmsComponent},
  {path: 'detail-film/:id', component: DetailFilmComponent}
];

@NgModule({
  imports: [RouterModule.forChild(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
