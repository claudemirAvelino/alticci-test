import { environment } from '../environments/environment';
import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {catchError, map} from 'rxjs/operators';
import {EMPTY, Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class AppService {
  private url: string = environment.API;

  constructor(private http: HttpClient) { }

  getAlticciSequence(n: number): Observable<any> {
    return this.http.get<any>(`${this.url}/${n}`).pipe(
      map(obj => obj),
      catchError(err => this.errorHandler(err))
    );
  }

  errorHandler(e: any): Observable<any> {
    alert(`Ocorreu um erro ${e}`);
    return EMPTY;
  }
}

