import { Component, OnInit } from '@angular/core';
import { ServiceCompaniesAdd } from 'src/app/service/serviceCompaniesAdd';
import { Company } from 'src/app/entity/company';

@Component({
  selector: 'app-developer-compani',
  templateUrl: './developer-compani.component.html',
  styleUrls: ['./developer-compani.component.css']
})
export class DeveloperCompaniComponent implements OnInit {
  company:Company;
  MYVAR = null;
  constructor(private serviceCompany: ServiceCompaniesAdd) {
    this.serviceCompany.GetCompany().subscribe((resp:Response)=>{
      this.company = JSON.parse(JSON.stringify(resp));
    })
   }
   verificationChange(company:Company): void{
     console.log(company.id);
    this.serviceCompany.ChangeStatusCompany(company).subscribe((resp:Response)=>{
      alert("Succsessfully!")
    })
   }
  ngOnInit(): void {
  }

}
