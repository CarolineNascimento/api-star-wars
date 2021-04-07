import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ResponseFilms, Result } from './list-films/film.model';

@Injectable({
  providedIn: 'root'
})

export class FilmsService {
  constructor(private http: HttpClient) { }

  getFilms(): Observable<ResponseFilms>{
    return this.http.get<ResponseFilms>("http://localhost:9090/list-films");
  }

  getFilm(id: string): Observable<Result>{
    return this.http.get<Result>(`http://localhost:9090/detail-film/${id}`);
  }

  updateFilm(id: string, request: Result): Observable<Result>{
    return this.http.put<Result>(`http://localhost:9090/update-film/${id}`, request);
  }
}

