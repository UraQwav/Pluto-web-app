import { Component, OnInit } from '@angular/core';
import { ServiceSignUp } from 'src/app/service/serviceSignUp';
import { FormGroup, FormControl, Validators, FormArray } from '@angular/forms';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { __values } from 'tslib';
import { Router } from '@angular/router';
@Component({
  selector: 'app-sign-up-form',
  templateUrl: './sign-up-form.component.html',
  styleUrls: ['./sign-up-form.component.css']
})
export class SignUpFormComponent implements OnInit {

  userEmail;
  userPhone;
  userPassword;
  userConfirmPassword;
  userFirstName;
  userLastName;
  userGender;
  userDateOfBirthday;
  userRegistrationDate;
  userVerificationCode;
  userImagePath;
  day: string="0";
  month: string="0";
  year: string="0";
  eroorInInputDate: boolean=false;
  errorInInputGender: boolean=false;
  eroorPasswordDontMatch: boolean=false;
  signUpForm : FormGroup;

  constructor(private serviceSignUp: ServiceSignUp, private router:Router) { 
    this.signUpForm = new FormGroup({
      "password": new FormControl("", [Validators.required, Validators.minLength(8), Validators.maxLength(50), Validators.pattern('((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})')]),
      "lastName": new FormControl("", [Validators.required, Validators.minLength(2), Validators.maxLength(50), Validators.pattern('^[a-zA-Z]*$')]),
      "gender": new FormControl(), 
      "firstName": new FormControl("", [Validators.required, Validators.minLength(2), Validators.maxLength(50), Validators.pattern('^[a-zA-Z]*$')]),
      "email": new FormControl("", [Validators.required, Validators.pattern('^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$')]),
      "phone": new FormControl("", [Validators.required, Validators.pattern('[+]+375+(29|17|33|44|25|22)+[0-9]{7}')])
    });
  }
  ngOnInit(): void {
    
  }
  signUp(): void{  
    this.eroorInInputDate=true?this.day=='0'||this.month=='0'||this.year=='0':false;
    this.errorInInputGender=true?this.signUpForm.get("gender").value!="Male"&&this.signUpForm.get("gender").value!="Female":false;
    this.eroorPasswordDontMatch=true?this.signUpForm.get("password").value!=this.userConfirmPassword:false;
    if(!this.eroorInInputDate&&!this.errorInInputGender&&!this.eroorPasswordDontMatch){ 
    this.userDateOfBirthday = this.year+"-"+this.month+"-"+this.day;
    this.userRegistrationDate = (new Date()).getFullYear().toString()+"-"+(new Date()).getMonth().toString()+"-"+(new Date()).getDay().toString();
    this.signUpForm.addControl("dateOfBirthday", new FormControl(this.userDateOfBirthday,Validators.required));
    this.signUpForm.addControl("registrationDate", new FormControl(this.userRegistrationDate,Validators.required));
    this.serviceSignUp.signUpUser(this.signUpForm.value).subscribe((resp:Response) =>{})
    this.router.navigate(['my-profile']);
    }
    
  }

}
