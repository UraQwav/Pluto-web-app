import { Component, OnInit } from '@angular/core';
import { CompanyService } from 'src/app/entity/companyService';
import { ServiceSubscribe } from 'src/app/service/serviceSubscribe';
import { Router } from '@angular/router';

@Component({
  selector: 'app-popular-subs',
  templateUrl: './popular-subs.component.html',
  styleUrls: ['./popular-subs.component.css']
})
export class PopularSubsComponent implements OnInit {
  items:CompanyService[];
  constructor(private serviceSubscribe:ServiceSubscribe,private router:Router) { 
    this.serviceSubscribe.GetService().subscribe((resp:Response)=>{
      this.items = JSON.parse(JSON.stringify(resp));
      console.log(this.items);
    })
  }

  ngOnInit(): void {
  }
  clMore(t:any):void{
    this.router.navigate(['popular-sub-more', t]);
  }
}
