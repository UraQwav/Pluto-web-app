import { GlobalRootURL } from '../GlobalRootURL';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, from } from 'rxjs';
import {Injectable} from '@angular/core'
import { FormGroup, FormArray } from '@angular/forms';
@Injectable(
{
providedIn:'root'
})

export class ServiceSignUp {
    readonly URL = GlobalRootURL.BASE_FAPI_URL + "user/sign-up"
    constructor(private http:HttpClient){
        
    }
    
    signUpUser(body: FormArray): Observable<any>{
        localStorage.setItem("user", JSON.stringify(body.getRawValue));
        return this.http.post(this.URL,body)
    }
}