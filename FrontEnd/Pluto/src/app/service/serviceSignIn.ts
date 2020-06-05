import { GlobalRootURL } from '../GlobalRootURL';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable, from } from 'rxjs';
import {Injectable} from '@angular/core'
import { FormGroup, FormArray } from '@angular/forms';
import { User } from '../entity/user';
@Injectable(
{
providedIn:'root'
})

export class ServiceSignIn {
    URL = "/user/sign-in";
    URLde = "/user/delete";
    URLget = "/user/getall";
    constructor(private http:HttpClient){
    }

    signInUser(body: FormGroup): Observable<any>{
        return this.http.post(this.URL, body.value);
    }
    getUsers(): Observable<any>{
        return this.http.get(this.URLget);
    }
    delete(user: User): Observable<any>{
        return this.http.post(this.URLde, user);
    }
}