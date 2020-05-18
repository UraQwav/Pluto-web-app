import { GlobalRootURL } from '../GlobalRootURL';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable, from } from 'rxjs';
import {Injectable} from '@angular/core'
import { FormGroup, FormArray } from '@angular/forms';
@Injectable(
{
providedIn:'root'
})

export class ServiceCompaniesAdd {
    URL = "/company/add"
    URLget = "/company/getall"
    constructor(private http:HttpClient){
    }

    AddCompany(body: FormGroup): Observable<any>{
        return this.http.post(this.URL, body.value);
    }
    GetCompany(): Observable<any>{
        return this.http.get(this.URLget);
    }
}