import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './gitapi/user.class';

@Injectable({
  providedIn: 'root'
})
export class GitService {
private url:string;

  constructor(private http:HttpClient) 
  {
    this.url='https://api.github.com/users';
   }
   public getGitUsersList():Observable<User[]>{
    return this.http.get<User[]>(this.url);
   }
}
