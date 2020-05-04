import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { GlobalRootURL } from 'src/app/GlobalRootURL';
import { Observable } from 'rxjs';
import { ServiceSignIn } from 'src/app/service/serviceSignIn'
import { FormGroup, FormControl, Validators } from '@angular/forms';
@Component({
  selector: 'app-sign-in-form',
  templateUrl: './sign-in-form.component.html',
  styleUrls: ['./sign-in-form.component.css']
})
export class SignInFormComponent implements OnInit {
  signInForm : FormGroup;
  constructor(private serviceSignIn: ServiceSignIn) { 
    this.signInForm = new FormGroup({
      "userEmail": new FormControl(),
      "userPassword": new FormControl(),
      "userPhone": new FormControl()
    });
  }
  ngOnInit(): void {
  }
  signIn(){
    this.serviceSignIn.signInUser(this.signInForm.value).subscribe((resp:Response) =>{
      localStorage.setItem('auth_token', resp.headers.get('Authorization'));
    })
  }
}
