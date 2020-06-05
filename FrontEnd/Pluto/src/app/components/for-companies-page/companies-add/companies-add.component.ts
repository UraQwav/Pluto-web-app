import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { ServiceCompaniesAdd } from 'src/app/service/serviceCompaniesAdd';
import { Router } from '@angular/router';

@Component({
  selector: 'app-companies-add',
  templateUrl: './companies-add.component.html',
  styleUrls: ['./companies-add.component.css']
})
export class CompaniesAddComponent implements OnInit {
  companyForm : FormGroup;
  constructor(private serviceCompaniesAdd: ServiceCompaniesAdd,private router:Router) { 
    this.companyForm = new FormGroup({
      "name": new FormControl(),
      "legalAddress": new FormControl(),
      "webSite": new FormControl(),
      "email": new FormControl(),
      "info": new FormControl(),
      "imagePath": new FormControl()
    });
  }
 
  ngOnInit(): void {
  }

  AddCompany(){
    this.serviceCompaniesAdd.AddCompany(this.companyForm).subscribe((resp:Response) =>{
      alert("Added ok");
    })
  }
}
