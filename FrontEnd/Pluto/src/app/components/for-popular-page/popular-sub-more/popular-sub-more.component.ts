import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Subscribable, Subscription } from 'rxjs';
import { Company } from 'src/app/entity/company';
import { ServiceCompaniesAddServices } from 'src/app/service/serviceCompaniesAddServices';
import { CompanyService } from 'src/app/entity/companyService';

@Component({
  selector: 'app-popular-sub-more',
  templateUrl: './popular-sub-more.component.html',
  styleUrls: ['./popular-sub-more.component.css']
})
export class PopularSubMoreComponent implements OnInit {
  routeSub: Subscription;
  web;
  company:CompanyService;
  constructor(private router:Router, private route: ActivatedRoute, private sss:ServiceCompaniesAddServices) { 
    this.routeSub = this.route.params.subscribe(params =>{
      this.web=params['id'];
    });
    this.sss.GetCompany(this.web).subscribe((resp:Response)=>{
      this.company= JSON.parse(JSON.stringify(resp));
    })
  }
  ngOnInit(): void {
   
  }

}
