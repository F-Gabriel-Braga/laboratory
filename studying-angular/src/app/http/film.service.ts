import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Film } from './film';

@Injectable({
  providedIn: 'root'
})
export class FilmService {

  private http: HttpClient;

  constructor(http: HttpClient) {
    this.http = http;
  }

  public findAll(): Observable<Film[]> {
    return this.http.get<Film[]>("http://localhost:3000/films/");
  }

  public insert(film: Film): Observable<any> {
    return this.http.post<any>("http://localhost:3000/films/", film);
  }

  public update(film: Film): Observable<any> {
    return this.http.put<any>(`http://localhost:3000/films/${film.id}`, film);
  }

  public delete(id: number): Observable<any> {
    return this.http.delete(`http://localhost:3000/films/${id}`)
  }
}
