import { GlobalRootURL } from '../GlobalRootURL';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, from } from 'rxjs';
import {Injectable} from '@angular/core'
import { FormGroup, FormArray } from '@angular/forms';
@Injectable(
{
providedIn:'root'
})

export class ServiceSignIn {
    readonly URL = GlobalRootURL.BASE_API_URL + "user/sign-in"
    constructor(private http:HttpClient){

    }
    
    signInUser(body: FormArray): Observable<any>{
        return this.http.post(this.URL,body)
    }
}