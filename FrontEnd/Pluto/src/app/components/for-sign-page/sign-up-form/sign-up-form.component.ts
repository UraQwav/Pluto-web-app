import { Component, OnInit } from '@angular/core';
import { ServiceSignUp } from 'src/app/service/serviceSignUp';
import { FormGroup, FormControl, Validators, FormArray } from '@angular/forms';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { __values } from 'tslib';
import { Router } from '@angular/router';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {User} from '../../../entity/user';
@Component({
  selector: 'app-sign-up-form',
  templateUrl: './sign-up-form.component.html',
  styleUrls: ['./sign-up-form.component.css']
})
export class SignUpFormComponent implements OnInit {
  userConfirmPassword;
  errorInInputGender: boolean=false;
  eroorPasswordDontMatch: boolean=false;
  signUpForm : FormGroup;
  user:User;
  constructor(private serviceSignUp: ServiceSignUp, private router:Router, private http:HttpClient) { 
    this.signUpForm = new FormGroup({
      "password": new FormControl("", [Validators.required, Validators.minLength(8), Validators.maxLength(50), Validators.pattern('((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})')]),
      "lastName": new FormControl("", [Validators.required, Validators.minLength(2), Validators.maxLength(50), Validators.pattern('^[a-zA-Z]*$')]),
      "gender": new FormControl(), 
      "firstName": new FormControl("", [Validators.required, Validators.minLength(2), Validators.maxLength(50), Validators.pattern('^[a-zA-Z]*$')]),
      "email": new FormControl("", [Validators.required, Validators.pattern('^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$')]),
      "phone": new FormControl("", [Validators.required, Validators.pattern('[+]+375+(29|17|33|44|25|22)+[0-9]{7}')]),
      "dateOfBirthday": new FormControl(),
      "registrationDate": new FormControl((new Date()).getFullYear().toString()+"-"+(new Date()).getMonth().toString()+"-"+(new Date()).getDay().toString(),Validators.required)
    });
  }
  ngOnInit(): void {
    
  }
  signUp(): void{  
    this.errorInInputGender=this.signUpForm.get("gender").value!="Male"&&this.signUpForm.get("gender").value!="Female"
    this.eroorPasswordDontMatch=this.signUpForm.get("password").value!=this.userConfirmPassword;
    
    if(!this.errorInInputGender&&!this.eroorPasswordDontMatch){ 
     this.serviceSignUp.signUpUser(this.signUpForm).subscribe((resp:Response) =>{
      localStorage.setItem('user', JSON.stringify(resp));
      this.user = JSON.parse(localStorage.getItem('user'));
      this.router.navigate(['my-profile/home', this.user.id ]);
     })

     console.log(this.signUpForm.value);
    }
    
  }

}
