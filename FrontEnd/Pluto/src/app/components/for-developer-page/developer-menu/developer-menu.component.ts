import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/entity/user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-developer-menu',
  templateUrl: './developer-menu.component.html',
  styleUrls: ['./developer-menu.component.css']
})
export class DeveloperMenuComponent implements OnInit {

  user:User;
  constructor( private router:Router) { }

  ngOnInit(): void {
    this.user = JSON.parse(localStorage.getItem('user'));
  }
  
  clUser():void{
    this.router.navigate(['/developer/profiles/', this.user.id]);
  }
  clCompany():void{
    this.router.navigate(['/developer/vereficationC/', this.user.id]);
  }
  
  clSubs():void{
    this.router.navigate(['/developer/vereficationS/', this.user.id]);
  }
}
