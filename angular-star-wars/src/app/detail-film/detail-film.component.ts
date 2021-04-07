import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { FilmsService } from '../films.service';
import { Result } from '../list-films/film.model';

@Component({
  selector: 'app-detail-film',
  templateUrl: './detail-film.component.html',
  styleUrls: ['./detail-film.component.css']
})
export class DetailFilmComponent implements OnInit {

  result: Result;
  id: string;
  returnUpdate: string;

  constructor(private filmsService: FilmsService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.paramMap.get('id');
    this.filmsService.getFilm(this.id).subscribe(res => this.result = res)
  }

  updateDescription(){
    this.filmsService.updateFilm(this.id, this.result).subscribe(res => this.result = res);
    this.returnUpdate = "sucess";
  }

}
