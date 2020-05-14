import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { GlobalRootURL } from 'src/app/GlobalRootURL';
import { Observable } from 'rxjs';
import { ServiceSignIn } from 'src/app/service/serviceSignIn'
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { User } from 'src/app/entity/user';
import { Router } from '@angular/router';
@Component({
  selector: 'app-sign-in-form',
  templateUrl: './sign-in-form.component.html',
  styleUrls: ['./sign-in-form.component.css']
})
export class SignInFormComponent implements OnInit {
  signInForm : FormGroup;
  user:User;
  constructor(private serviceSignIn: ServiceSignIn,private router:Router) { 
    this.signInForm = new FormGroup({
      "userEmail": new FormControl(),
      "userPassword": new FormControl()
    });
  }
  ngOnInit(): void {
    this.user = JSON.parse(localStorage.getItem('user'));
    if(this.user.id!=null){
      this.router.navigate(['my-profile']);
    }
  }
  signIn(){
    this.serviceSignIn.signInUser(this.signInForm).subscribe((resp:Response) =>{
      localStorage.setItem('user', JSON.stringify(resp));
      this.user = JSON.parse(localStorage.getItem('user'));
      this.router.navigate(['my-profile/home', this.user.id ]);
    })
  }
}
