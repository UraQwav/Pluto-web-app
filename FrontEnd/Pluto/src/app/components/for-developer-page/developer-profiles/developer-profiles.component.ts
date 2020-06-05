import { Component, OnInit } from '@angular/core';
import { ServiceSignIn } from 'src/app/service/serviceSignIn';
import { User } from 'src/app/entity/user';

@Component({
  selector: 'app-developer-profiles',
  templateUrl: './developer-profiles.component.html',
  styleUrls: ['./developer-profiles.component.css']
})
export class DeveloperProfilesComponent implements OnInit {
user:User[];
  constructor(private servicesign:ServiceSignIn) { 
    this.servicesign.getUsers().subscribe((resp:Response)=>{
      this.user = JSON.parse(JSON.stringify(resp));
    })
  }

  ngOnInit(): void {
  }

  clDelete(user:User){
    this.servicesign.delete(user).subscribe((resp:Response)=>{
      alert("Delete ok");
    })
  }
}
