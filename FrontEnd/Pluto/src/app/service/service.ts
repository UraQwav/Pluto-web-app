import { GlobalRootURL } from '../GlobalRootURL';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, from } from 'rxjs';
import {Injectable} from '@angular/core'
@Injectable(
{
providedIn:'root'
})

export class Service {
readonly URL = GlobalRootURL.BASE_API_URL + "user/registration"
constructor(private http:HttpClient){

}
registerUser(login : string, password: string): Observable<any>{

let body = { login : login, password : password}

return this.http.post(this.URL,body)
}
}