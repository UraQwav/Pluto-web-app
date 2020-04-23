import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { GlobalRootURL } from 'src/app/GlobalRootURL';
import { Observable } from 'rxjs';
import {Service} from 'src/app/service/service'
@Component({
  selector: 'app-sign-in-form',
  templateUrl: './sign-in-form.component.html',
  styleUrls: ['./sign-in-form.component.css']
})
export class SignInFormComponent implements OnInit {
  
  userName;
  password;
  constructor(private service: Service) { }
  ngOnInit(): void {
  }
  registred(): void{
    this.service.registerUser(this.userName,this.password).subscribe((resp:Response) =>{})
  }
}
