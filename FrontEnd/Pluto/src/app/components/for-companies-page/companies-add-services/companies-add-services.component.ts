import { Component, OnInit } from '@angular/core';
import { ServiceCompaniesAddServices } from 'src/app/service/serviceCompaniesAddServices';
import { Router } from '@angular/router';
import { FormGroup, FormControl, FormArray } from '@angular/forms';
import { ServicePriceAndRenewalTime } from 'src/app/entity/servicePriceAndRenewalTime';
import { ServiceServicePriceAndRenewalTime } from 'src/app/service/serviceServicePriceAndRenewalTime';
import { ServiceCompaniesAdd } from 'src/app/service/serviceCompaniesAdd';
import { Company } from 'src/app/entity/company';

@Component({
  selector: 'app-companies-add-services',
  templateUrl: './companies-add-services.component.html',
  styleUrls: ['./companies-add-services.component.css']
})
export class CompaniesAddServicesComponent implements OnInit {
  companyServiceForm: FormGroup;
  servicePriceAndRenewalTime:ServicePriceAndRenewalTime[];
  company:Company[];
  constructor(private serviceCompaniesAddServices: ServiceCompaniesAddServices,private serviceCompany: ServiceCompaniesAdd, private serviceServicePriceAndRenewalTime:ServiceServicePriceAndRenewalTime, private router:Router) { 
    this.companyServiceForm = new FormGroup({
      "company": new FormGroup({
        "id":  new FormControl()
      }),
      "name": new FormControl(),
      "info": new FormControl(),
      "imagePath": new FormControl(),
      "servicePriceAndRenewalTime":  new FormGroup({
        "id":  new FormControl()
      })
    });
   
    this.serviceServicePriceAndRenewalTime.GetService().subscribe((resp:Response)=>{
      this.servicePriceAndRenewalTime = JSON.parse(JSON.stringify(resp));
      console.log(this.servicePriceAndRenewalTime);
    })
    this.serviceCompany.GetCompany().subscribe((resp:Response)=>{
      this.company = JSON.parse(JSON.stringify(resp));

      console.log(this.company[0]);
    })
  }


  ngOnInit(): void {
   
  }

  AddCompanyService(){
    this.serviceCompaniesAddServices.AddService(this.companyServiceForm).subscribe((resp:Response) =>{
      alert("Added ok");
    })
  }
}
