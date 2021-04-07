import { Component, OnInit } from '@angular/core';
import { FilmsService } from '../films.service';
import { ResponseFilms } from './film.model';

@Component({
  selector: 'app-list-films',
  templateUrl: './list-films.component.html',
  styleUrls: ['./list-films.component.css']
})
export class ListFilmsComponent implements OnInit {
  responseFilms: ResponseFilms;

  constructor(private filmsService: FilmsService) { }

  ngOnInit() {    
    this.filmsService.getFilms()
      .subscribe(res => this.responseFilms = res)
  }
  
}
