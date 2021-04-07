import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from "@angular/forms"
import { AppComponent } from './app.component';
import { ListFilmsComponent } from './list-films/list-films.component';
import { FilmsService } from './films.service';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { NgbPaginationModule, NgbAlertModule} from '@ng-bootstrap/ng-bootstrap';
import { DetailFilmComponent } from './detail-film/detail-film.component';

import { RouterModule } from '@angular/router';
import { appRoutes } from './app-routing.module';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    ListFilmsComponent,
    DetailFilmComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule,
    NgbModule,
    NgbPaginationModule, 
    NgbAlertModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [FilmsService],
  bootstrap: [AppComponent]
})
export class AppModule { }
