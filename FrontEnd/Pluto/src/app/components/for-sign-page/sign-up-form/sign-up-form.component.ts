import { Component, OnInit } from '@angular/core';
import { ServiceSignUp } from 'src/app/service/serviceSignUp';
import { FormGroup, FormControl, Validators, FormArray } from '@angular/forms';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { __values } from 'tslib';
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
  userTypeId;
  myForm : FormGroup;

  constructor(private serviceSignUp: ServiceSignUp) { 
    this.myForm = new FormGroup({
      "userPassword": new FormControl("", [Validators.required, Validators.minLength(8), Validators.maxLength(50), Validators.pattern('((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})')]),
      "userLastName": new FormControl("", [Validators.required, Validators.minLength(2), Validators.maxLength(50), Validators.pattern('^[a-zA-Z]*$')]),
      "userGender": new FormControl(), 
      "userFirstName": new FormControl("", [Validators.required, Validators.minLength(2), Validators.maxLength(50), Validators.pattern('^[a-zA-Z]*$')]),
      "userEmail": new FormControl("", [Validators.required, Validators.pattern('^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$')]),
      "userPhone": new FormControl("", [Validators.required, Validators.pattern('[+]+375+(29|17|33|44|25|22)+[0-9]{7}')])
    });
  }
  ngOnInit(): void {
    
  }
  signUp(): void{  
    this.eroorInInputDate=true?this.day=='0'||this.month=='0'||this.year=='0':false;
    this.errorInInputGender=true?this.myForm.get("userGender").value!="Male"&&this.myForm.get("userGender").value!="Female":false;
    this.eroorPasswordDontMatch=true?this.myForm.get("userPassword").value!=this.userConfirmPassword:false;
    if(!this.eroorInInputDate&&!this.errorInInputGender&&!this.eroorPasswordDontMatch){ 
    this.userDateOfBirthday = this.year+"-"+this.month+"-"+this.day;
    // this.userTypeId="1l";
    console.log(this.userTypeId);
    this.userRegistrationDate = (new Date()).getFullYear().toString()+"-"+(new Date()).getMonth().toString()+"-"+(new Date()).getDay().toString();
    this.myForm.addControl("userDateOfBirthday", new FormControl(this.userDateOfBirthday,Validators.required));
    this.myForm.addControl("userRegistrationDate", new FormControl(this.userRegistrationDate,Validators.required));
    // this.myForm.addControl("userTypeIdUserTypeId", new FormControl(this.userTypeId,Validators.required));
    this.serviceSignUp.signUpUser(this.myForm.value).subscribe((resp:Response) =>{})
    }
    
  }

}
