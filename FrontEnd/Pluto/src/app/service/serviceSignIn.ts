import { GlobalRootURL } from '../GlobalRootURL';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable, from } from 'rxjs';
import {Injectable} from '@angular/core'
import { FormGroup, FormArray } from '@angular/forms';
@Injectable(
{
providedIn:'root'
})

export class ServiceSignIn {
    URL = "/user/getByEmailAndPassword/{email}/{password}/signIn"
    constructor(private http:HttpClient){
    }

    signInUser(body: FormGroup): Observable<any>{
        let params = new HttpParams().set("email",body.get("email").value).set("password",body.get("password").value);
        return this.http.get(this.URL,{params: params});
    }
}