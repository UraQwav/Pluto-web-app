import {Component, OnInit} from '@angular/core';
import {Location} from '@angular/common';
import {Router} from '@angular/router';
@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  currentPath: string;
  logOutCheck: Boolean=true;
  constructor( private location: Location, private router: Router){
    this.router.events.subscribe(() => this.changeLocation());
  }
  changeLocation() {
    this.currentPath = this.location.path();
    this.logOutCheck=this.currentPath.indexOf('my-profile')>-1?false:true;
    console.log(this.logOutCheck);
  }
  LogOut():void{
    localStorage.clear();
  }
  ngOnInit(): void {
  }

}
